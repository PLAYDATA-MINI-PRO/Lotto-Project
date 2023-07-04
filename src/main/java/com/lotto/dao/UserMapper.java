package com.lotto.dao;

import com.lotto.domain.dto.User;
import com.lotto.domain.request.LoginRequest;
import com.lotto.domain.request.SignupRequest;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {
    private final SqlSessionTemplate sessionTemplate;

    public UserMapper(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    public int signup(SignupRequest request) { return sessionTemplate.insert("user.signup", request); }

    public User login(LoginRequest request) {return sessionTemplate.selectOne("user.login", request);}
}
