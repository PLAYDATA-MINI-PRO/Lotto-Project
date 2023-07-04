package com.lotto.dao;

import com.lotto.domain.dto.LoginUser;
import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.User;
import com.lotto.domain.request.LoginRequest;
import com.lotto.domain.request.SignupRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int signup(SignupUser signupUser);
}
