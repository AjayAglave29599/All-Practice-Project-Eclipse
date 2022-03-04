package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 @Autowired
 DataSource datasource;
 @Override
protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests().anyRequest().fullyAuthenticated().and().formLogin().loginPage("/login")
           .failureUrl("/login?error").permitAll().and().logout().logoutUrl("/logout")
           .logoutSuccessUrl("/login?logout").permitAll().and().csrf();
 }
 @Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {
     auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(passwordEncoder());
 }
 @Bean public PasswordEncoder passwordEncoder() {
     PasswordEncoder encoder = new BcryptPasswordEncoder();
     return encoder;
 }}