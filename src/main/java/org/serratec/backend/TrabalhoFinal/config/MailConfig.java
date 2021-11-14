package org.serratec.backend.TrabalhoFinal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String para, String assunto, String texto) {
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("aps.teresopolis@gmail.com");
		message.setTo(para);
		message.setSubject(assunto);
		message.setText("Dados da inscrição: \n " + texto + "\n \n \n Serratec Residência Petrópolis");
		javaMailSender.send(message);
		
	}
}
