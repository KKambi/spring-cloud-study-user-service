package com.example.userservice.infra.config;

import com.example.userservice.infra.filter.AuthenticationFilter;
import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.Filter;

@RequiredArgsConstructor
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {



    private final Environment env;
    private final BCryptPasswordEncoder passwordEncoder;
    private final UserService userService;

    // Authorization 설정
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable().and()
                // 와이파이 IP Address 매번 변경되기 때문에 모두 허용하자...
//                .authorizeRequests().antMatchers("/users/**").hasIpAddress(("192.168.219.139")).and()
                .authorizeRequests().antMatchers("/users/**").permitAll().and()
                .addFilter(getAuthenticationFilter());
    }

    private Filter getAuthenticationFilter() throws Exception {
        AuthenticationFilter filter = new AuthenticationFilter();
        filter.setAuthenticationManager(authenticationManager());

        return filter;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(
                // 유저를 검증하는 비즈니스 로직이 필요
                userService
        ).passwordEncoder(passwordEncoder);
    }
}
