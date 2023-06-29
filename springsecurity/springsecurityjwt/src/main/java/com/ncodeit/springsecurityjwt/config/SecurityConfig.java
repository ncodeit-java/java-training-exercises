package com.ncodeit.springsecurityjwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.ncodeit.springsecurityjwt.service.impl.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableMethodSecurity
public class SecurityConfig {
	
	
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	private static final String TOKEN_URL = "/getToken";
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }	
	
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring()
        		.antMatchers(TOKEN_URL)
        		;
    } 	
	
	
    @Bean
	protected SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
    	
    	/*
        // Enable CORS and disable CSRF
    	httpSecurity = httpSecurity.cors().and().csrf().disable();
    	
        // Set session management to stateless
    	httpSecurity = httpSecurity
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and();  
    	
        // Set unauthorized requests exception handler
    	httpSecurity = httpSecurity
            .exceptionHandling()
            .authenticationEntryPoint(jwtAuthenticationEntryPoint)
            .and();
    	
        // Set permissions on endpoints
    	httpSecurity.authorizeRequests()
            .antMatchers("/springsecurityjwt/jwt/getToken").permitAll()
            .anyRequest().authenticated();
    	
        // Add JWT token filter
    	httpSecurity.addFilterBefore(
    			jwtRequestFilter,
            UsernamePasswordAuthenticationFilter.class
        );    	
    	 return httpSecurity.build();
    	 
    	 */
    	 
		// We don't need CSRF for this example
		httpSecurity.cors().and().csrf().disable()
				// dont authenticate this particular request
				.authorizeRequests()
				.antMatchers(TOKEN_URL).permitAll()
				.anyRequest().authenticated().and()
				// make sure we use stateless session; session won't be used to
				// store user's state.
				.exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		httpSecurity.userDetailsService(userDetailsServiceImpl);
		// Add a filter to validate the tokens with every request
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
		return httpSecurity.build();
	}

}
