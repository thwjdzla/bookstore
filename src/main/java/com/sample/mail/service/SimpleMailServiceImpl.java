package com.sample.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.sample.mail.vo.User;

@Service
public class SimpleMailServiceImpl implements SimpleMailService {

	@Autowired
	MailSender mailSender;
	
	@Autowired
	SimpleMailMessage templateMailMessage;
	
	@Override
	public void sendMail(User user) {
		SimpleMailMessage message = new SimpleMailMessage(templateMailMessage);
		
		message.setTo(user.getEmail());
		message.setText(user.getUsername() + "님 가입이 완료되었습니다.");
		
		mailSender.send(message);
	}
}
