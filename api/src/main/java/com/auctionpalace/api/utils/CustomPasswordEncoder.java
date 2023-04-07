package com.auctionpalace.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import lombok.Data;

@Component
@Data
public class CustomPasswordEncoder {
    private PasswordEncoder passwordEncoder;
    public CustomPasswordEncoder(){
        this.passwordEncoder = new BCryptPasswordEncoder();
    }
}
