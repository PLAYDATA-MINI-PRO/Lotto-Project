package com.lotto.service;

import com.lotto.dao.BuyMapper;
import com.lotto.domain.dto.LottoNumber;
import com.lotto.domain.dto.UpdateUserMoneyAndStatus;
import com.lotto.domain.request.ChargeMoneyRequest;
import com.lotto.domain.request.UpdateLottoStatusRequest;
import com.lotto.domain.request.BuyLottoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BuyService {
    private final BuyMapper buyMapper;

    @Autowired
    public BuyService(BuyMapper buyMapper) {
        this.buyMapper = buyMapper;
    }

    public List<LottoNumber> findByEmail(String email) {
        return buyMapper.findByEmail(email);
    }

    public void updateMoneyAndStatus(UpdateUserMoneyAndStatus updateUserMoneyAndStatus) {
        int money = buyMapper.findMoney(updateUserMoneyAndStatus.getBuyLottoRequest().getEmail());
        if (money <= 0) {
            throw new IllegalStateException("잔액이 부족합니다");
        }
        buyMapper.updateUserMoney(updateUserMoneyAndStatus.getBuyLottoRequest());
        buyMapper.updateLottoStatus(updateUserMoneyAndStatus.getUpdateLottoStatusRequest());
    }

    public void chargeMoney(ChargeMoneyRequest chargeMoneyRequest) {
        buyMapper.chargeMoney(chargeMoneyRequest);
    }

    public int findMoney(String email) {
        return buyMapper.findMoney(email);
    }
}
