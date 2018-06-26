package com.sample.mail.service;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.sample.mail.vo.User;

@Service
public class SimpleVelocityMailServiceImpl implements SimpleVelocityMailService {

	@Autowired
	JavaMailSenderImpl mailSender;
	
	@Autowired
	VelocityEngine velocityEngine;
	
	@Autowired
	SimpleMailMessage templateMailMessage;
	
	@Override
	public void sendTextMail(User user) {
		SimpleMailMessage message = new SimpleMailMessage(templateMailMessage);
		
		message.setTo(user.getEmail());
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("username", user.getUsername());
		model.put("msg", user.getUsername() + "고객님, 회원가입이 완료되었습니다.");
		
		String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "./META-INF/templates/text-email.vm", "utf-8", model);
		message.setText(text);
		
		mailSender.send(message);		
	}
	
	@Override
	public void sendHtmlMail(User user) throws MessagingException {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
		
		helper.setTo(user.getEmail());
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("username", user.getUsername());
		model.put("msg", user.getUsername() + "고객님, 회원가입이 완료되었습니다.");
		
		String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "./META-INF/templates/html-email.vm", "utf-8", model);
		helper.setText(text, true);
		
		mailSender.send(mimeMessage);
		
	}
}
