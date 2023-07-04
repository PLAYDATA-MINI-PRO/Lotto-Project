package com.lotto.domain.request;

import com.lotto.domain.dto.LoginUser;

public class LoginRequest {
    private String email;
    private String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginUser toDto() {
        return new LoginUser(email, password);
    }

    public LoginRequest() {

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
