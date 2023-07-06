package com.lotto.dao;

import com.lotto.domain.dto.LottoNumber;
import com.lotto.domain.request.ChargeMoneyRequest;
import com.lotto.domain.request.UpdateLottoStatusRequest;
import com.lotto.domain.request.BuyLottoRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {
    List<LottoNumber> findByEmail(String email);
    void updateUserMoney(BuyLottoRequest money);
    void updateLottoStatus(UpdateLottoStatusRequest status);
    void chargeMoney(ChargeMoneyRequest request);
    int findMoney(String email);
}
