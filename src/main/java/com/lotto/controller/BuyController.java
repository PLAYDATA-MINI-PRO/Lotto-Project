package com.lotto.controller;

import com.lotto.domain.dto.LottoNumber;
import com.lotto.domain.request.UpdateLottoStatusRequest;
import com.lotto.domain.request.UpdateUserMoneyRequest;
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
    public ModelAndView lottoBuyPage(ModelAndView mav, HttpSession session){
        //String userEmail = (String) session.getAttribute("email");
        String userEmail = "aaa@naver.com";
        List<LottoNumber> lottoNumbers = buyService.findByEmail(userEmail);
        mav.addObject("lottoList",lottoNumbers);
        mav.setViewName("/lotto/showBuyPage");
        return mav;
    }

    @PostMapping("/lotto/showBuyPage")
    public ModelAndView lottoBuy(ModelAndView mav,HttpSession session, @RequestParam String lottoNumbers){
//String userEmail = (String) session.getAttribute("email");
        String userEmail = "aaa@naver.com";
        UpdateUserMoneyRequest money = new UpdateUserMoneyRequest(userEmail);
        UpdateLottoStatusRequest status = new UpdateLottoStatusRequest(userEmail,lottoNumbers);
        buyService.updateMoneyAndStatus(money,status);
        List<LottoNumber> lottoNumber = buyService.findByEmail(userEmail);
        mav.addObject("lottoList",lottoNumber);
        mav.setViewName("redirect:/lotto/showBuyPage");
        return mav;
    }
}
