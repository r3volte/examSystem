package examsystem.backend.service.mail;

import static examsystem.backend.util.MailProp.*;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailService {

  @Bean
  public JavaMailSender getJavaMailSender() {
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost(HOST);
    mailSender.setPort(PORT);

    mailSender.setUsername(USERNAME);
    mailSender.setPassword(PASSWORD);

    mailProperties(mailSender);

    return mailSender;
  }

  private void mailProperties(JavaMailSenderImpl mailSender) {
    Properties props = mailSender.getJavaMailProperties();
    props.put(PROTOCOL, SMTP);
    props.put(AUTH, ENABLE);
    props.put(STARTTLS, ENABLE);
  }
}
