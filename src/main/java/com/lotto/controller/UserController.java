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

    @GetMapping("/login")
    public String getLoginPage() {return  "/user/login";}

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

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

    @PostMapping("/login")
    public ModelAndView login(
            @ModelAttribute LoginRequest request,
            ModelAndView modelAndView,
            HttpSession session
    ) {

        LoginUser dto = request.toDto();
        User login = userService.login(dto);

        if (login != null) {
            session.setAttribute("email", login.getEmail());
            session.setAttribute("name", login.getName());
            System.out.println("login = " + login);
            modelAndView.setViewName("redirect:/");
        } else {
            System.out.println("login = " + login);
            modelAndView.setViewName("redirect:/user/login");
        }

        return modelAndView;
    }


}
