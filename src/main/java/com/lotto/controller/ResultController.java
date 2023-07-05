package com.lotto.controller;

import com.lotto.domain.request.WinningNumberRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lotto")
public class ResultController {

    @GetMapping("/result")
    public String getLottoPage1() {
        return "/result";
    }

    @PostMapping("/result")
    public ModelAndView LottoPage2(@ModelAttribute WinningNumberRequest request, ModelAndView mav) {

       mav.setViewName("/lotto/result");
        return mav;
    }

}
