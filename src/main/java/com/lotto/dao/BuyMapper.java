package com.lotto.dao;

import com.lotto.domain.request.BuyRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuyMapper {
    int updateMoney(BuyRequest buyRequest);

}
