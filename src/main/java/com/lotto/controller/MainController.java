package com.lotto.controller;

import com.lotto.domain.dto.Main;
import com.lotto.domain.dto.Shopping;
import com.lotto.domain.request.ShoppingRequest;
import com.lotto.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MainController {
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/main")
    public ModelAndView showUpdatePage(
//            HttpSession session,
            ModelAndView mav
    ) {
//        String email = (String) session.getAttribute("email");
        String email = "bbb";
        List<Main> shoppingList = mainService.shoppingList(email); //  장바구니 리스트
        List<Main> buyList = mainService.buyList(email);  // 구매한 리스트
        String drawDate = mainService.drawDate(); // 최신회차 받아옴
        mav.addObject("shoppingList", shoppingList);
        mav.addObject("buyList", buyList);
        mav.addObject("drawDate", drawDate);
        mav.setViewName("/main");
        return mav;
    }

    @PostMapping("/main")
    public ModelAndView lottoShopping(
            @ModelAttribute ShoppingRequest request,
//            HttpSession session,
            ModelAndView mav
    ){
//        String email = (String) session.getAttribute("email");
        String email = "bbb";

        mainService.shopping(request.todto(email));
        // request랑 session을 둘 다 사용해야되서 request에서 email도 받아서 dto로 변환함
        mav.setViewName("redirect:/main");
        return mav;
    }

}
