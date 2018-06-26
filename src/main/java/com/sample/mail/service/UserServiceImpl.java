package com.sample.mail.service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.mail.vo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	SimpleMailService simpleMailService;
	
	@Autowired
	SimpleVelocityMailService simpleVelocityMailService;
	
	@Override
	public void registerUser(User user) throws MessagingException {
		// 회원 가입 처리
		
		//simpleMailService.sendMail(user);
		//simpleVelocityMailService.sendTextMail(user);
		simpleVelocityMailService.sendHtmlMail(user);
	}
}
