package se.tommy.sendEmail;


public class Main {
    public static void main(String[] args) {

       EmailExecute email = new EmailExecute("skriv din mail", "skriv ditt lösenord till email");

       email.sendEmail("exempel@stud.sti.se", "hej", "Hej detta är ett meddelande från java :)");


    }
}
