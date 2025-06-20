package com.example.sso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(registry -> {
            registry.requestMatchers("/").permitAll();
            registry.anyRequest().authenticated();
        }).oauth2Login(oauth2Login -> {
//            oauth2Login.loginPage("/login");
//            oauth2Login.successHandler((request, response, authentication) -> {
//                response.sendRedirect("/profile");
//            });
                })
                .formLogin(Customizer.withDefaults())
                .build();
    }

}
