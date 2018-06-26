package com.sample.mail.service;

import javax.mail.MessagingException;

import com.sample.mail.vo.User;

public interface SimpleVelocityMailService {

	void sendTextMail(User user);
	void sendHtmlMail(User user) throws MessagingException;
}
