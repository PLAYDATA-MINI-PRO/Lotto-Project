package com.lotto.domain.request;

public class UpdateUserMoneyRequest {
    private String email;
    private final int MONEY = 1000;

    public UpdateUserMoneyRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMONEY() {
        return MONEY;
    }
}
