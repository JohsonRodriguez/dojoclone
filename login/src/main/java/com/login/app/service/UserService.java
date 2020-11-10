package com.login.app.service;

import com.login.app.model.User;
import com.login.app.web.dto.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);

}
