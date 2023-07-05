package com.lotto.domain.request.user;

import com.lotto.domain.dto.SignupUser;
import com.lotto.domain.dto.User;

public class SignupRequest {
    private String email;
    private String password;
    private String name;

    public SignupRequest(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public SignupUser toDto() {
        return new SignupUser(email, password, name);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
