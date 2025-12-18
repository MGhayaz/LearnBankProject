package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    JButton ChangeButton, BackButton;
    JLabel textLabel, newpinLabel, ConfirmationnewpinLabel;
    JPasswordField textField, ConfirmationtextField;
    String OldPin;

    PinChange(String OldPin) {
        this.OldPin = OldPin;

        setLayout(null);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectInterface.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);

        textLabel = new JLabel("Change your PIN:");
        textLabel.setBounds(190, 320, 290, 25);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        imageLabel.add(textLabel);


        newpinLabel = new JLabel("Enter new PIN:");
        newpinLabel.setBounds(190, 350, 130, 25);
        newpinLabel.setForeground(Color.WHITE);
        newpinLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        imageLabel.add(newpinLabel);

        textField = new JPasswordField();
        textField.setBounds(320, 350, 100, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 16));
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.WHITE);
        imageLabel.add(textField);

        ConfirmationnewpinLabel = new JLabel("Re-Enter New PIN:");
        ConfirmationnewpinLabel.setBounds(190, 380, 130, 25);
        ConfirmationnewpinLabel.setForeground(Color.WHITE);
        ConfirmationnewpinLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        imageLabel.add(ConfirmationnewpinLabel);


        ConfirmationtextField = new JPasswordField();
        ConfirmationtextField.setBounds(320, 380, 100, 25);
        ConfirmationtextField.setFont(new Font("Raleway", Font.BOLD, 16));
        ConfirmationtextField.setForeground(Color.BLACK);
        ConfirmationtextField.setBackground(Color.WHITE);
        imageLabel.add(ConfirmationtextField);

        ChangeButton = new JButton("Change");
        ChangeButton.setBounds(420, 490, 90, 25);
        ChangeButton.setBackground(Color.WHITE);
        ChangeButton.setForeground(Color.BLACK);
        ChangeButton.setFont(new Font("Raleway", Font.BOLD, 13));
        ChangeButton.addActionListener(this);
        imageLabel.add(ChangeButton);

        BackButton = new JButton("Back");
        BackButton.setBounds(420, 520, 90, 25);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.BLACK);
        BackButton.setFont(new Font("Raleway", Font.BOLD, 13));
        BackButton.addActionListener(this);
        imageLabel.add(BackButton);


        setLocation(500, 0);
        setSize(900, 870);
       // setVisible(true);

    }

    public static void main(String[] args) {
        new PinChange("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BackButton) {
            setVisible(false);
            new Transaction(OldPin).setVisible(true);
        } else if (e.getSource() == ChangeButton) {
            String newpin = textField.getText();
            if (newpin.length() != 4 || !newpin.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Please enter a Valid PIN!");
                return;
            }
            if (textField.getText().equals(ConfirmationtextField.getText())) {
                try {
                    DataBaseConnection dbc = new DataBaseConnection();
                    String QueryForBD = "UPDATE bankDeposit SET pinnumber='" + newpin + "' WHERE pinnumber='" + OldPin + "'";
                    String Query2ForLogin = "UPDATE Login SET pinnumber='" + newpin + "' WHERE pinnumber='" + OldPin + "'";
                    String Query3ForSignUp3 = "UPDATE signUpthree SET pinnumber='" + newpin + "' WHERE pinnumber='" + OldPin + "'";
                    dbc.st.executeUpdate(QueryForBD);
                    dbc.st.executeUpdate(Query2ForLogin);
                    dbc.st.executeUpdate(Query3ForSignUp3);
                    JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                    setVisible(false);
                    new Transaction(newpin).setVisible(true);

                } catch (Exception ee) {
                    System.out.println(ee.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "PIN Mismatch!");

            }

        }

    }
}
