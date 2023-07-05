package com.lotto.service;

import com.lotto.dao.BuyMapper;
import com.lotto.domain.dto.LottoNumber;
import com.lotto.domain.request.UpdateLottoStatusRequest;
import com.lotto.domain.request.UpdateUserMoneyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyService {
    private final BuyMapper buyMapper;
    @Autowired
    public BuyService(BuyMapper buyMapper) {
        this.buyMapper = buyMapper;
    }

    public List<LottoNumber> findByEmail(String email){
        return buyMapper.findByEmail(email);
    }

    public void updateMoneyAndStatus(UpdateUserMoneyRequest money, UpdateLottoStatusRequest status){
        buyMapper.updateUserMoney(money);
        buyMapper.updateLottoStatus(status);

    }
}
