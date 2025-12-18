package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton BackButton;
    JLabel textLabel ;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;

        setLayout(null);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectInterface.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);


        BackButton = new JButton("Back");
        BackButton.setBounds(410, 520, 100, 25);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.BLACK);
        BackButton.setFont(new Font("Raleway", Font.BOLD, 16));
        BackButton.addActionListener(this);
        imageLabel.add(BackButton);


        DataBaseConnection dbc = new DataBaseConnection();
       int balance = 0 ;
        try {
            ResultSet rs = dbc.st.executeQuery("select * from BankDeposit where pinnumber = '" + pin + "'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
        textLabel = new JLabel("Your Current Balance is : " + balance);
        textLabel.setBounds(190, 320, 290, 25);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        imageLabel.add(textLabel);


        setLocation(500, 0);
        setSize(900, 870);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BackButton) {
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
    }
}
