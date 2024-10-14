package se.tommy.sendEmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailExecute implements EmailSender {

    private String userName;
    private String password;


    public EmailExecute(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    private void executeSendingEmail(String to, String subject, String messageText, String cc) {

        String host = "smtp.office365.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userName));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            if (cc != null) {
                message.setRecipient(Message.RecipientType.CC, new InternetAddress(cc));
            }
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendEmail(String to, String subject, String messageText) {
        executeSendingEmail(to, subject, messageText, null);
    }

    @Override
    public void sendEmail(String to, String subject, String messageText, String cc) {
        executeSendingEmail(to, subject, messageText, cc);
    }
}
