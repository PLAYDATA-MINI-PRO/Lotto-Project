package com.lotto.service;

import com.lotto.dao.UserMapper;
import com.lotto.domain.dto.LoginUser;
import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.User;
import com.lotto.domain.request.LoginRequest;
import com.lotto.domain.request.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean signup(SignupUser signupUser) {
        return userMapper.signup(signupUser) != 0;
    }

}
