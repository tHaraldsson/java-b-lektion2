package se.tommy.sendEmail;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JPanel emailPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public GUI() {
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        textField1.setPreferredSize(new Dimension(100, 25));
        textField2.setPreferredSize(new Dimension(100, 25));
        textField3.setPreferredSize(new Dimension(100, 25));


        JLabel label1 = new JLabel("Skicka till: ");
        JLabel label2 = new JLabel("Rubrik: ");
        JLabel label3 = new JLabel("Innehåll: ");


        emailPanel = new JPanel();
        emailPanel.setPreferredSize(new Dimension(400, 250));

        emailPanel.setLayout(new BoxLayout(emailPanel, BoxLayout.Y_AXIS));


        emailPanel.add(label1);
        emailPanel.add(textField1);
        emailPanel.add(Box.createVerticalStrut(15));

        emailPanel.add(label2);
        emailPanel.add(textField2);

        emailPanel.add(Box.createVerticalStrut(15));
        emailPanel.add(label3);
        emailPanel.add(textField3);
    }

    public Email showEmailPanel() {

        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/mail.png"));

        Image scaleImage = originalIcon.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaleImage);

        int result = JOptionPane.showConfirmDialog(null, emailPanel,
                "Skicka mail", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, scaledIcon);


        if (result == JOptionPane.OK_OPTION) {
            String mailAdress = textField1.getText();
            String mailSubject = textField2.getText();
            String text = textField3.getText();

            textField1.setText("");
            textField2.setText("");
            textField3.setText("");

            System.out.println("Skickar mejl till: " + mailAdress + "\nÄmne: " + mailSubject + "\nText: " + text);

            return new Email(mailAdress, mailSubject, text);
        }
        return null;
    }
}
