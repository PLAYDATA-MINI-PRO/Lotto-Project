package com.lotto.controller;

import com.lotto.domain.dto.LoginUser;
import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.User;
import com.lotto.domain.request.LoginRequest;
import com.lotto.domain.request.SignupRequest;
import com.lotto.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/signup")
    public String getSignupPage() {return "/user/signup";}


    @PostMapping("/signup")
    public ModelAndView signup(
            @ModelAttribute SignupRequest request,
            ModelAndView modelAndView
            ) {
        SignupUser dto = request.toDto();
        if (userService.signup(dto)) {
            modelAndView.setViewName("redirect:/user/login");
        } else {
            modelAndView.setViewName("redirect:/user/signup");
        }



        return modelAndView;
    }

}
