package com.example.demo.User.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.buyuser;
import com.example.demo.User.UserRole;
import com.example.demo.User.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserSecurityService implements UserDetailsService{
	
	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<buyuser> _buyuser = this.userRepository.findByName(name);
		if(_buyuser.isEmpty()) {
			throw new UsernameNotFoundException("사용자가 존재하지 않습니다");
		}
		
		buyuser buyuser = _buyuser.get();
		List<GrantedAuthority> auth = new ArrayList<>();
		if("admin".equals(name)) {
			auth.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
		}else {
			auth.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
		}
		
		return new User(buyuser.getName(), buyuser.getPw(), auth);
	}
	
	

}