package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {


    JButton WithdrawlButton, BackButton;
    JLabel textLabel;
    JTextField textField;
    String pin;

    Withdrawl(String pin) {
        this.pin = pin;

        setLayout(null);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectInterface.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);

        textLabel = new JLabel("Enter the amount you want to Withdrawl");
        textLabel.setBounds(190, 320, 290, 25);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        imageLabel.add(textLabel);


        textField = new JTextField();
        textField.setBounds(190, 350, 290, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 16));
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.WHITE);
        imageLabel.add(textField);

        WithdrawlButton = new JButton("Withdraw");
        WithdrawlButton.setBounds(400, 490, 110, 25);
        WithdrawlButton.setBackground(Color.WHITE);
        WithdrawlButton.setForeground(Color.BLACK);
        WithdrawlButton.setFont(new Font("Raleway", Font.BOLD, 16));
        WithdrawlButton.addActionListener(this);
        imageLabel.add(WithdrawlButton);

        BackButton = new JButton("Back");
        BackButton.setBounds(410, 520, 100, 25);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.BLACK);
        BackButton.setFont(new Font("Raleway", Font.BOLD, 16));
        BackButton.addActionListener(this);
        imageLabel.add(BackButton);


        setLocation(500, 0);
        setSize(900, 870);

    }

    public static void main(String[] args) {
        new Withdrawl("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BackButton) {
            setVisible(false);
            new Transaction("").setVisible(true);
        } else if (e.getSource() == WithdrawlButton) {
            String Withdrawamount = textField.getText();
            Date date = new Date();
            if (Withdrawamount.equals("") || Withdrawamount.equals("0")) {
                JOptionPane.showMessageDialog(null, "Please enter the deposit amount");
            } else {
                DataBaseConnection dbc = new DataBaseConnection();
                String Query1 = "insert into bankDeposit values('" + pin + "','" + date + "','Withdraw','" + Withdrawamount + "')";
                try {
                    ResultSet rs = dbc.st.executeQuery("select * from BankDeposit where pinnumber = '" + pin + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }

                    if (balance >= Integer.parseInt(Withdrawamount)) {
                        dbc.st.executeUpdate(Query1);
                        JOptionPane.showMessageDialog(null, "Withdrawed Successfully");
                        setVisible(false);
                        new Transaction(pin).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }


                } catch (Exception ee) {
                    System.out.println(ee.getMessage());
                }
            }
        }


    }
}


