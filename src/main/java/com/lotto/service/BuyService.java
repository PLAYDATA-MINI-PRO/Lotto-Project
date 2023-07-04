package com.lotto.service;

import com.lotto.dao.BuyMapper;
import com.lotto.domain.request.BuyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyService {
    private final BuyMapper buyMapper;

    @Autowired
    public BuyService(BuyMapper buyMapper) {
        this.buyMapper = buyMapper;
    }

    public void updateMoney(BuyRequest buyRequest){
        buyMapper.updateMoney(buyRequest);
    }
}
