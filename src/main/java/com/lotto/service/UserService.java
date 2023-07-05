package com.lotto.service;

import com.lotto.dao.UserMapper;
import com.lotto.domain.dto.LoginUser;
import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.UpdateUser;
import com.lotto.domain.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean signup(SignupUser signupUser) {
        return userMapper.signup(signupUser) != 0;
    }
    public User login(LoginUser loginUser) { return userMapper.login(loginUser);}
    public int logout(Integer uid){return userMapper.logout(uid);}

    public int update(UpdateUser updateUser) {return userMapper.update(updateUser);}

    public int delete(String email) {return userMapper.delete(email);}
}
