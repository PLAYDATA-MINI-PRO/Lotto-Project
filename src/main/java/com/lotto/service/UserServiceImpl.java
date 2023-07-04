package com.lotto.service;

import com.lotto.dao.UserMapper;
import com.lotto.domain.dto.User;
import com.lotto.domain.request.LoginRequest;
import com.lotto.domain.request.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean signup(SignupRequest request) {
        return userMapper.signup(request) != 0;
    }

    @Override
    public User login(LoginRequest request) {
        try {
            return userMapper.login(request);
        } catch (Exception e) {
            return null;
        }
    }


}
