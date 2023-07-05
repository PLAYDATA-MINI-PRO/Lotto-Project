package com.lotto.dao;

import com.lotto.domain.dto.LottoNumber;
import com.lotto.domain.request.UpdateLottoStatusRequest;
import com.lotto.domain.request.UpdateUserMoneyRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {
    List<LottoNumber> findByEmail(String email);
    void updateUserMoney(UpdateUserMoneyRequest money);
    void updateLottoStatus(UpdateLottoStatusRequest status);
}
