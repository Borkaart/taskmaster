package com.projeto.taskmaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/cadastro", "/css/**", "/js/**").permitAll() // Liberado
                        .anyRequest().authenticated() // O resto exige login
                )
                .formLogin(form -> form
                        .loginPage("/login") // Nossa página customizada
                        .defaultSuccessUrl("/tarefas", true)
                        .permitAll()
                )
                .logout(logout -> logout.logoutSuccessUrl("/login"));

        return http.build();
    }
}