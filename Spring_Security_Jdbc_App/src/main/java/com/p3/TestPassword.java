package com.p3;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestPassword {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String password = "john123";

        String hash = encoder.encode(password);

        System.out.println("Password = " + password);
        System.out.println("Hash = " + hash);
    }
}