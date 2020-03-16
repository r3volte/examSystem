package examsystem.backend.service.mail;

import static examsystem.backend.util.MailProp.*;

import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImpl {


  private JavaMailSender emailSender;

  @Autowired
  public MailServiceImpl(JavaMailSender emailSender) {
    this.emailSender = emailSender;
  }

  public void sendEmailWithResultReport(String email)
          throws MessagingException {
    MimeMessage message = emailSender.createMimeMessage();
    MimeMessageHelper helper = getMimeMessageHelper(email, message);
    FileSystemResource file
            = new FileSystemResource(new File(PATH_TO_ATTACHMENT));
    helper.addAttachment(FILE_NAME, file);
    emailSender.send(message);
  }

  private MimeMessageHelper getMimeMessageHelper(String email,
                                                 MimeMessage message) throws MessagingException {
    MimeMessageHelper helper = new MimeMessageHelper(message, true);
    helper.setTo(email);
    helper.setSubject(EMAIl_SUBJECT);
    helper.setText(EMAIl_SUBJECT);
    return helper;
  }

}
