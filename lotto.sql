-- DROP DATABASE Lotto;
CREATE DATABASE Lotto;
USE Lotto;

show tables;
SHOW FULL COLUMNS FROM user;

CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    money INT,
    create_at DATETIME DEFAULT NOW()
);
CREATE TABLE winningNumber (
    id INT PRIMARY KEY AUTO_INCREMENT,
    draw_date INT unique KEY NOT NULL,
    winning_numbers VARCHAR(100) NOT NULL
);

CREATE TABLE lottoNumber (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    lotto_numbers VARCHAR(100) NOT NULL,
    draw_date INT NOT NULL,
    status BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (email) REFERENCES user(email),
    FOREIGN KEY (draw_date) REFERENCES winningNumber(draw_date)
);
CREATE TABLE userWinningInfo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    draw_date INT NOT NULL,
    lotto_numbers VARCHAR(100) NOT NULL,
    matched_numbers VARCHAR(100) NOT NULL,
    FOREIGN KEY (email) REFERENCES User(email),
   --  FOREIGN KEY (lotto_numbers) REFERENCES lottoNumber(lotto_numbers), 로또 넘버는 중복으로 살 수 있어서 외래키 사용하면 안됨
    FOREIGN KEY (draw_date) REFERENCES winningNumber(draw_date)
);
CREATE TABLE outUser (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    create_at DATETIME DEFAULT NOW()
);

