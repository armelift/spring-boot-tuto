package com.armelift.configurations;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
//                .authorizeRequests().antMatchers("/h2/web-console/**").permitAll();
//
//        httpSecurity.csrf().disable();
//        httpSecurity.headers().frameOptions().disable();
//    	httpSecurity.authorizeRequests()
//        .
//        .loginPage("/login")
//        .failureUrl("/login?error")
//        .usernameParameter("email")
//        .permitAll()
//        .and()
//        .logout()
//        .logoutUrl("/logout")
//        .logoutSuccessUrl("/")
//        .permitAll();
    	
    	
    	
    }
    
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(new SecurityConfiguration());
    }

}