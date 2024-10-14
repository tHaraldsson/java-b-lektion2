package se.tommy.sendEmail;


public class Main {
    public static void main(String[] args) {

        EmailExecute email = new EmailExecute("tommy.haraldsson@stud.sti.se", "91d428aA!");
        GUI gui = new GUI();

        while(true) {
            Email email1 = gui.showEmailPanel();

            if (email1 != null) {
                String to = email1.getTo();
                String subject = email1.getSubject();
                String body = email1.getBody();
                email.sendEmail(to, subject, body);
            }
            else {
                break;
            }
        }
    }
}
