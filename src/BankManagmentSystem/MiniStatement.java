package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    String pin;

    JLabel textLabel ,brandLabel,cardLabel, LedgerLabel;
    MiniStatement (String pin) {
        this.pin = pin;
        setLayout(null);

        brandLabel = new JLabel("Ghayaz Finance Private Ltd.");
        brandLabel.setBounds(190, 60, 260, 25);
        brandLabel.setForeground(Color.BLACK);
        brandLabel.setFont(new Font("Raleway", Font.BOLD, 17));
        add(brandLabel);

        cardLabel = new JLabel();
        cardLabel.setBounds(90, 120, 290, 25);
        cardLabel.setForeground(Color.BLACK);
        cardLabel.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cardLabel);

        textLabel = new JLabel();
        textLabel.setBounds(90, 440, 290, 25);
        add(textLabel);

        LedgerLabel = new JLabel();

        LedgerLabel.setForeground(Color.BLACK);
        LedgerLabel.setFont(new Font("Raleway", Font.BOLD, 13));
        add(LedgerLabel);


        try {
            DataBaseConnection dbc = new DataBaseConnection();
            ResultSet rs = dbc.st.executeQuery("select * from Login where pinNumber = '" + pin + "'");
            while (rs.next()) {
                cardLabel.setText("Card Number: " + rs.getString("cardNumber").substring(0, 4)+ "XXXXXXXX"+rs.getString("cardNumber").substring(12));
            }

        } catch(Exception ee){
            System.out.println(ee.getMessage());
        }



        try {
            int balance = 0 ;
            DataBaseConnection dbc = new DataBaseConnection();
            ResultSet rs = dbc.st.executeQuery("select * from BankDeposit where pinnumber = '" + pin + "'");
            while (rs.next()) {
                LedgerLabel.setText(LedgerLabel.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;"
                        + rs.getString("type") + "&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }

            textLabel.setText("Your Current Balance is : " + balance);

        }catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
        LedgerLabel.setBounds(90, 220, 590, 235);















        setLocation(110, 200);
        getContentPane().setBackground(Color.WHITE);
        setSize(600, 670);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
