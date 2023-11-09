package com.ewallet.demo.ThirdPartyServices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordImpl {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("abcd"));
    }
}