package com.lotto.domain.dto;

import java.sql.Timestamp;

public class WinningNumber {

private int id;
private String email;
private String name;
private String password;
private int money;
private Timestamp create_at;


    public WinningNumber(int id, String email, String name, String password, int money, Timestamp create_at) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.money = money;
        this.create_at = create_at;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }
}
