package com.lotto.dao;

import com.lotto.domain.dto.LoginUser;
import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.UpdateUser;
import com.lotto.domain.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int signup(SignupUser signupUser);
    User login(LoginUser loginUser);
    int update(UpdateUser updateUser);
    int delete(String email);
}
