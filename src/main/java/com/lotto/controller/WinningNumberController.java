package com.lotto.controller;

import com.lotto.domain.dto.ResultDto;
import com.lotto.domain.dto.ResultNumber;
import com.lotto.domain.dto.WinningNumber;
import com.lotto.service.WinningNumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/lotto")
public class WinningNumberController {

    private final WinningNumberService winningNumberService;

    public WinningNumberController(WinningNumberService winningNumberService) {
        this.winningNumberService = winningNumberService;
    }

    @GetMapping("/winningnumber")
    public String getWinningNumberPage() {
        return "/lotto/winningnumber";
    }



    @PostMapping("/winningnumber")
    public ModelAndView postResultPage(ModelAndView mav, @RequestParam("drawDate") int drawDate) {
        mav.setViewName("redirect:/lotto/result");
        mav.addObject("drawDate", drawDate);
        return mav;
    }
    @GetMapping("/result")
    public String getResultPage(Model model, @RequestParam("drawDate") int drawDate) {

        WinningNumber winningNumbers = winningNumberService.findByDraw(drawDate);
        String email = "q1@naver.com";
        ResultDto resultDto = new ResultDto(email, drawDate);

//        당첨번호
        List<ResultNumber> resultNumber = winningNumberService.userLottoNumber(resultDto);
        List<Integer> ranking = winningNumberService.CompareLottoNumbers(winningNumbers.getWinning_numbers(), resultNumber);
        System.out.println(ranking);
        model.addAttribute("winningNumbers", winningNumbers);
        model.addAttribute("lottoNumber", resultNumber);
        return "/lotto/result";
    }
    @PostMapping("/result")
    public ModelAndView resultFinish(ModelAndView mav, @RequestParam("drawDate") int drawDate) {
        String email = "q1@naver.com";
        ResultDto resultDto = new ResultDto(email, drawDate);
        WinningNumber winningNumbers = winningNumberService.findByDraw(drawDate);
//        당첨번호
        List <ResultNumber> resultNumber = winningNumberService.userLottoNumber(resultDto);
        List<Integer> ranking = winningNumberService.CompareLottoNumbers(winningNumbers.getWinning_numbers(),
                resultNumber);
        System.out.println(ranking);

//        테스트용 유저 로또번호
        mav.addObject("drawDate", drawDate);
        mav.addObject("winningNumbers", winningNumbers);
        mav.addObject("lottoNumber", resultNumber);

        mav.setViewName("/lotto/result");
        return mav;
    }
}
