package com.sample.mail.service;

import javax.mail.MessagingException;

import com.sample.mail.vo.User;

public interface UserService {

	void registerUser(User user) throws MessagingException;
}
