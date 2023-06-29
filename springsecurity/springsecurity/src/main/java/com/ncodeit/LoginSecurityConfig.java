package com.ncodeit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class LoginSecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	    manager.createUser(User.withUsername("john")
	      .password(bCryptPasswordEncoder.encode("john@123"))
	      .roles("USER")
	      .build());
	    manager.createUser(User.withUsername("ncodeit")
	      .password(bCryptPasswordEncoder.encode("ncodeit@123"))
	      .roles("ADMIN", "USER")
	      .build());
	    return manager;
	}
	
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsService uds) 
	  throws Exception {
	    return http.getSharedObject(AuthenticationManagerBuilder.class)
	      .userDetailsService(uds)
	      .passwordEncoder(bCryptPasswordEncoder)
	      .and()
	      .build();
	}	

	@Bean
	protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/homePage").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
				.antMatchers("/userPage").access("hasRole('ROLE_USER')").antMatchers("/adminPage")
				.access("hasRole('ROLE_ADMIN')")
				.and()
				.formLogin().loginPage("/loginPage").defaultSuccessUrl("/homePage").failureUrl("/loginPage?error")
				.usernameParameter("username").passwordParameter("password").and().logout()
				.logoutSuccessUrl("/loginPage?logout");

		// To disable csrf protection -> http.csrf(csrf -> csrf.disable())
		return http.build();
	}
}
