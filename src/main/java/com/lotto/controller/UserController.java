package com.lotto.controller;
import com.lotto.service.WinningService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    private final WinningService winningService;

    public UserController(WinningService winningService) {
        this.winningService = winningService;
    }

    @GetMapping("/winningnumber")
    public String showLottoPage() {
        return "/user/winningnumber";
    }

    @PostMapping("/winningnumber")
    public String checkLottoNumber(@RequestParam("lottoNumber") String lottoNumber, Model model) {
        // 로또 번호 체크 로직 수행
        int drawDate = 123; // 예시로 임의의 추첨 회차를 사용
        int rank = winningService.calculateRank(lottoNumber, drawDate);

        model.addAttribute("lottoNumber", lottoNumber);
        model.addAttribute("rank", rank);

        return "/user/winningnumber";
    }
}
