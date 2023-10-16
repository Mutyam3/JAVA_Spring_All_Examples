package com.dl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests((authorize) ->{
			authorize.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults());
		
		return http.build();
			
	}
	
	   @Bean
       PasswordEncoder passwordEncoder() {
    
    	   
		return new BCryptPasswordEncoder();   	   
       }

       @Bean
       InMemoryUserDetailsManager userDetailsManager() {
    	   
    	   UserDetails user = org.springframework.security.core.userdetails.User.builder()
   				.username("user")
   				.password(passwordEncoder().encode("Bhargav"))
   				.roles("USER")
   				.build();
    	   
    	   UserDetails admin = org.springframework.security.core.userdetails.User.builder()
    	           .username("admin")
    	           .password(passwordEncoder().encode("Mutyam"))
    	           .roles("ADMIN")
    	           .build();
    	   
        return new InMemoryUserDetailsManager(user,admin);
       }


	
	
	
	
}
