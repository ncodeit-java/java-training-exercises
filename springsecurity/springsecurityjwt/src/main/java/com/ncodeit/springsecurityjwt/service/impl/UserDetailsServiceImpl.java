package com.ncodeit.springsecurityjwt.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<GrantedAuthority> roles=new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		return User.withUsername(username)
			.password(new BCryptPasswordEncoder().encode("1234"))
			.roles("ADMIN").build();
		//return new User(username,new BCryptPasswordEncoder().encode("1234"),roles);
	}

}