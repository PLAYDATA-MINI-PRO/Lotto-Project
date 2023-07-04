package com.lotto.domain.dto;

import java.sql.Timestamp;

public class User {
    private Integer id;
    private String email;
    private String name;
    private String password;
    private int money;
    private Timestamp createAt;

    public User() {

    }
    public User(Integer id, String email, String name, String password, int money, Timestamp createAt) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.money = money;
        this.createAt = createAt;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", createAt=" + createAt +
                '}';
    }
}