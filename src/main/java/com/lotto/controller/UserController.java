package com.lotto.controller;

import com.lotto.domain.dto.LoginUser;
import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.UpdateUser;
import com.lotto.domain.dto.User;
import com.lotto.domain.request.user.LoginRequest;
import com.lotto.domain.request.user.SignupRequest;
import com.lotto.domain.request.user.UpdateRequest;
import com.lotto.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/login")
    public String getLoginPage() {return  "/user/login";}

    @PostMapping("/login")
    public ModelAndView login(
            @ModelAttribute LoginRequest request,
            ModelAndView modelAndView,
            HttpSession session
    ) {

        LoginUser dto = request.toDto();
        User login = userService.login(dto);

        if (login != null) {
            session.setAttribute("id", login.getId());
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

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(HttpSession session) {
        String email = (String) session.getAttribute("email");
        System.out.println("email = " + email);
        if (email != null) {
            userService.delete(email);
            session.invalidate();
        }

        return "redirect:/";
    }



    @GetMapping("/update")
    public ModelAndView getUpdatePage(
            HttpSession session,
            ModelAndView mav
    ) {
        mav.setViewName("/user/update");
        Integer uid = (Integer) session.getAttribute("id");

        return mav;
    }

    @PostMapping("/update")
    public ModelAndView update(
            @ModelAttribute UpdateRequest request,
            HttpSession session,
            ModelAndView mav
            ) {
        mav.setViewName("redirect:/");

        Integer uid = (Integer) session.getAttribute("id");
        UpdateUser dto = request.toDto(uid);

        if (uid != null) {
            userService.update(dto);
        } else {
            System.out.println("uid = " + uid);
        }
        return mav;
    }
}
