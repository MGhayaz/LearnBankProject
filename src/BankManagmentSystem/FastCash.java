package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton TenThousandButton, FiveThousandButton, TwoThousandButton, OneThousandButton, FiveHundreadButton, HundredButton, BackButton;
    JLabel textLabel;
    String pin;

    FastCash(String pin) {
        this.pin = pin;

        setLayout(null);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectInterface.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);
        textLabel = new JLabel("Choose the amount you want to Withdraw");
        textLabel.setBounds(190, 320, 290, 25);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        imageLabel.add(textLabel);
        TenThousandButton = new JButton("10000");
        TenThousandButton.setBounds(420, 487, 90, 25);
        TenThousandButton.setBackground(Color.WHITE);
        TenThousandButton.setForeground(Color.BLACK);
        TenThousandButton.setFont(new Font("Raleway", Font.BOLD, 16));
        TenThousandButton.addActionListener(this);
        imageLabel.add(TenThousandButton);
        FiveThousandButton = new JButton("5000");
        FiveThousandButton.setBounds(420, 455, 90, 25);
        FiveThousandButton.setBackground(Color.WHITE);
        FiveThousandButton.setForeground(Color.BLACK);
        FiveThousandButton.setFont(new Font("Raleway", Font.BOLD, 16));
        FiveThousandButton.addActionListener(this);
        imageLabel.add(FiveThousandButton);
        TwoThousandButton = new JButton("2000");
        TwoThousandButton.setBounds(420, 425, 90, 25);
        TwoThousandButton.setBackground(Color.WHITE);
        TwoThousandButton.setForeground(Color.BLACK);
        TwoThousandButton.setFont(new Font("Raleway", Font.BOLD, 16));
        TwoThousandButton.addActionListener(this);
        imageLabel.add(TwoThousandButton);
        OneThousandButton = new JButton("1000");
        OneThousandButton.setBounds(160, 487, 90, 25);
        OneThousandButton.setBackground(Color.WHITE);
        OneThousandButton.setForeground(Color.BLACK);
        OneThousandButton.setFont(new Font("Raleway", Font.BOLD, 16));
        OneThousandButton.addActionListener(this);
        imageLabel.add(OneThousandButton);
        FiveHundreadButton = new JButton("500");
        FiveHundreadButton.setBounds(160, 455, 90, 25);
        FiveHundreadButton.setBackground(Color.WHITE);
        FiveHundreadButton.setForeground(Color.BLACK);
        FiveHundreadButton.setFont(new Font("Raleway", Font.BOLD, 16));
        FiveHundreadButton.addActionListener(this);
        imageLabel.add(FiveHundreadButton);
        HundredButton = new JButton("100");
        HundredButton.setBounds(160, 425, 90, 25);
        HundredButton.setBackground(Color.WHITE);
        HundredButton.setForeground(Color.BLACK);
        HundredButton.setFont(new Font("Raleway", Font.BOLD, 16));
        HundredButton.addActionListener(this);
        imageLabel.add(HundredButton);
        BackButton = new JButton("Back");
        BackButton.setBounds(420, 520, 90, 25);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.BLACK);
        BackButton.setFont(new Font("Raleway", Font.BOLD, 16));
        BackButton.addActionListener(this);
        imageLabel.add(BackButton);

        setLocation(500, 0);
        setSize(900, 870);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BackButton) {
            setVisible(false);
            new Transaction(pin).setVisible(true);
        } else {
            String amount = ((JButton) e.getSource()).getText().trim();
            DataBaseConnection dbc = new DataBaseConnection();
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
                Date date = new Date();
                String Query1 = "insert into bankDeposit values('" + pin + "','" + date + "','Withdraw','" + amount + "')";
                dbc.st.executeUpdate(Query1);
                JOptionPane.showMessageDialog(null, "Withdraw of " + amount + " is Successfull");
                setVisible(false);
                new Transaction(pin).setVisible(true);


            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}



