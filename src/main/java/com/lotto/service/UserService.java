package com.lotto.service;

import com.lotto.domain.dto.User;
import com.lotto.domain.request.LoginRequest;
import com.lotto.domain.request.SignupRequest;

public interface UserService {
    boolean signup(SignupRequest request);
    User login(LoginRequest request);
}
