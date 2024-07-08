package com.therealgulo.springboot.demosecurity.service;

import com.therealgulo.springboot.demosecurity.entity.User;
import com.therealgulo.springboot.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
