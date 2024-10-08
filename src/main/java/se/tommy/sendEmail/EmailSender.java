package se.tommy.sendEmail;

public interface EmailSender {
    public void sendEmail(String to, String subject, String messageText);
    public void sendEmail(String to, String subject, String messageText, String cc);
}
