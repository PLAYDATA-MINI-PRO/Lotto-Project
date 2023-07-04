package com.lotto.service;

import com.lotto.domain.dto.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtServiceImpl {
    private String secretKey = "myKey";
    private long exp = 1000L * 60 * 60;

    public String createToken(User user) {
        return Jwts.builder().setHeaderParam("typ", "JWT")
                .setSubject("userToken")
                .setExpiration(new Date(System.currentTimeMillis() + exp))
                .claim("user", user)
                .signWith(SignatureAlgorithm.ES256, secretKey.getBytes())
                .compact();
    }
}
