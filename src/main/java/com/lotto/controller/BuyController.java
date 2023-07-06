package com.lotto.controller;

import com.lotto.domain.dto.LottoNumber;
import com.lotto.domain.dto.UpdateUserMoneyAndStatus;
import com.lotto.domain.request.ChargeMoneyRequest;
import com.lotto.domain.request.UpdateLottoStatusRequest;
import com.lotto.domain.request.BuyLottoRequest;
import com.lotto.service.BuyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BuyController {
    private final BuyService buyService;

    public BuyController(BuyService buyService) {
        this.buyService = buyService;
    }

    @GetMapping("/lotto/showBuyPage")
    public ModelAndView lottoBuyPage(ModelAndView mav, HttpSession session) {
        String userEmail = (String) session.getAttribute("email");
        List<LottoNumber> lottoNumbers = buyService.findByEmail(userEmail);
        int userMoney = buyService.findMoney(userEmail);
        mav.addObject("userMoney",userMoney);
        mav.addObject("lottoList", lottoNumbers);
        mav.setViewName("/lotto/showBuyPage");
        return mav;
    }

    @PostMapping("/lotto/showBuyPage")
    public ModelAndView lottoBuy(ModelAndView mav, HttpSession session, @RequestParam String lottoNumbers) {
        String userEmail = (String) session.getAttribute("email");
        UpdateUserMoneyAndStatus updateUserMoneyAndStatus = new UpdateUserMoneyAndStatus(userEmail, lottoNumbers);
        boolean updateResult = buyService.updateMoneyAndStatus(updateUserMoneyAndStatus);
        List<LottoNumber> lottoNumber = buyService.findByEmail(userEmail);
        mav.addObject("updateResult",updateResult);
        mav.addObject("lottoList", lottoNumber);
        mav.setViewName("redirect:/lotto/showBuyPage");
        return mav;
    }

    @GetMapping("/lotto/userChargeMoneyPage")
    public ModelAndView userMoneyPage(ModelAndView mav, HttpSession session) {
        String userEmail = (String) session.getAttribute("email");
        int money = buyService.findMoney(userEmail);
        mav.addObject("money", money);
        mav.setViewName("/lotto/userChargeMoneyPage");
        return mav;
    }

    @PostMapping("/lotto/userChargeMoneyPage")
    public ModelAndView chargeMoney(ModelAndView mav, HttpSession session, @RequestParam("userMoney") int money) {
        String userEmail = (String) session.getAttribute("email");
        ChargeMoneyRequest chargeMoneyRequest = new ChargeMoneyRequest(userEmail, money);
        buyService.chargeMoney(chargeMoneyRequest);
        int userMoney = buyService.findMoney(userEmail);
        mav.addObject("userMoney", userMoney);
        mav.setViewName("redirect:/lotto/userChargeMoneyPage");
        return mav;
    }
}
