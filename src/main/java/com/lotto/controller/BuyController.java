package com.lotto.controller;

import com.lotto.domain.request.BuyRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BuyController {
    @GetMapping("/buy")
    public String lottoBuyPage(){
        return "/buy";
    }

    @PostMapping("/buy")
    public ModelAndView showBuyPage(@ModelAttribute BuyRequest buyRequest
    ,ModelAndView mav){
        mav.addObject()
    }
}
