package com.lotto.service;

import com.lotto.dao.WinningNumberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WinningNumberService {
    private final WinningNumberMapper winningNumberMapper;

    public WinningNumberService(WinningNumberMapper winningNumberMapper) {
        this.winningNumberMapper = winningNumberMapper;
    }

    public int calculateRank(String userLottoNumbers, int drawDate) {
        List<String> winningNumbers = winningNumberMapper.getLottoNumbersByDrawDate(drawDate);

        // 비교 로직 및 등수 계산을 수행하여 결과를 반환
        int rank = 0;
        // 등수 계산 로직 구현

        return rank;
    }
}