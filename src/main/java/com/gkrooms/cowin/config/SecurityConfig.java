package com.gkrooms.cowin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configure HTTP security using the new style (no more deprecated methods)
        http
                .csrf(csrf -> csrf.disable())  // Disable CSRF (common for APIs)
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/register", "/login").permitAll()  // Allow unauthenticated access to /api/register and /api/login
                        .requestMatchers("/api/**").authenticated()  // Require authentication for /api/**
                        .anyRequest().permitAll()  // Allow other requests without authentication
                )
                .httpBasic(Customizer.withDefaults());  // Enable HTTP Basic Authentication
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

