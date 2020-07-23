package com.rentals.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rentals.entities.User;
import com.rentals.repositories.UserRepository;

	
@Service
public class UserService implements UserDetailsService {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userrepository.findByUsername(username);
		
		 if (user.isPresent()){
			 return user.map(UserDetailsImpl::new).get();
	        }else{
	            throw new UsernameNotFoundException(username);
	        }
		
	}
	
}
