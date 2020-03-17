package examsystem.backend.util;

public class MailProp {

  public static final String HOST = "smtp.gmail.com";
  public static final int PORT = 587;
  public static final String USERNAME = "schenker.exam.notification@gmail.com";
  public static final String PASSWORD = "medicalnotification12";
  public static final String PROTOCOL = "mail.transport.protocol";
  public static final String ENABLE = "true";
  public static final String SMTP = "smtp";
  public static final String AUTH = "mail.smtp.auth";
  public static final String STARTTLS = "mail.smtp.starttls.enable";
  public static final String SUBJECT = "Wynik Testu.";
  public static final String PATH_TO_ATTACHMENT = "src/main/resources/report.pdf";
  public static final String FILE_NAME = "Wynik_Testu.pdf";

  private MailProp() {
  }
}
