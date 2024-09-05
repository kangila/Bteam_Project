package com.example.demo.User.Service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.buyuser;
import com.example.demo.User.Exception.UserException;
import com.example.demo.User.Repository.UserRepository;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	
	public buyuser create(String id,String pw,String email,String name, String tell, String adress,String gender) {
		
		buyuser user = new buyuser();
		user.setId(id);
		user.setPw(passwordEncoder.encode(pw));
		user.setEmail(email);
		user.setName(name);
		user.setTell(tell);
		user.setAddress(adress);
		user.setGender(gender);
		this.userRepository.save(user);
		return user;
		
	}
	
	public buyuser getUser(String username) throws UserException {
		Optional<buyuser> buyuser = this.userRepository.findByName(username);
		if(buyuser.isPresent()) {
			return buyuser.get();
		}
		else {
			throw new UserException("해당 유저가 존재하지 않습니다");
		}
	}
}