/*package com.example.parkprjct.security;

import com.example.parkprjct.domain.user.UserService;
import com.example.parkprjct.security.filter.TestTokenFilter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import lombok.extern.slf4j.Slf4j;

@Profile("local")
@Configuration
@EnableWebSecurity
@Slf4j
public class TestSecurityConfig extends SecurityConfigBase {
    public TestSecurityConfig(UserService userService) {
        super(new TestTokenFilter(userService));
    }
}*/