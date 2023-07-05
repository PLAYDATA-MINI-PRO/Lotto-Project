package com.lotto.domain.request;

import com.lotto.domain.dto.UpdateUser;

public class UpdateRequest {
    private String password;
    private String name;

    public UpdateUser toDto(Integer uid) { return new UpdateUser(uid, password, name);}

    public UpdateRequest(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
