package com.lotto.service;

import com.lotto.dao.WinningNumberMapper;
import com.lotto.domain.dto.ResultDto;
import com.lotto.domain.dto.ResultNumber;
import com.lotto.domain.dto.WinningNumber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class WinningNumberService {
    private final WinningNumberMapper winningNumberMapper;

    public WinningNumberService(WinningNumberMapper winningNumberMapper) {
        this.winningNumberMapper = winningNumberMapper;
    }

    public WinningNumber findByDraw(int drawDate) {
        return winningNumberMapper.findByDraw(drawDate);
    }

    public List<ResultNumber> userLottoNumber(ResultDto resultDto) {
        return winningNumberMapper.userLottoNumber(resultDto);
    }


    public List<Integer> CompareLottoNumbers(String winningNumber, List<ResultNumber> resultNumbers) {
        Set<String> winningSet = new HashSet<>(Set.of(winningNumber.split(",")));
        int rank = 0;
            List<Integer> resultRanks = new ArrayList<Integer>();
        for (ResultNumber resultNumber : resultNumbers) {
            Set<String> userNumberSet = new HashSet<>(Set.of(resultNumber.getWinning_numbers().split(",")));
            userNumberSet.retainAll(winningSet);

            int matchedNumbers = userNumberSet.size();
            if (matchedNumbers == 6) {
                rank = 1; // 1등
                break;
            } else if (matchedNumbers == 5) {
                rank = 2; // 2등
            } else if (matchedNumbers == 4) {
                rank = 3; // 3등
            } else if (matchedNumbers == 3) {
                rank = 4; // 4등
            } else if (matchedNumbers == 2) {
                rank = 5; // 5등
            }
            resultRanks.add(rank);
        }
        return resultRanks;
    }

}