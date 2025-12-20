package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {

    JButton depositButton, FastCash, PinChange, CashWithdrawl, MiniStatement, BalanceEnquiry, Exit;
    JLabel text;
    String pin;


    Transaction(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectInterface.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);

        text = new JLabel("Select Your Transaction");
        text.setBounds(260, 320, 190, 25);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        imageLabel.add(text);

         depositButton = new JButton("DEPOSIT");
        depositButton.setBounds(160, 420, 140, 25);
        depositButton.setFont(new Font("Raleway", Font.BOLD, 14));
        depositButton.setForeground(Color.BLACK);
        depositButton.setBackground(Color.WHITE);
        depositButton.addActionListener(this);
        imageLabel.add(depositButton);


        FastCash = new JButton("Fast Cash");
        FastCash.setBounds(160, 455, 140, 25);
        FastCash.setFont(new Font("Raleway", Font.BOLD, 14));
        FastCash.setForeground(Color.BLACK);
        FastCash.setBackground(Color.WHITE);
        FastCash.addActionListener(this);
        imageLabel.add(FastCash);


        PinChange = new JButton("Pin Change");
        PinChange.setBounds(160, 490, 140, 25);
        PinChange.setFont(new Font("Raleway", Font.BOLD, 14));
        PinChange.setForeground(Color.BLACK);
        PinChange.setBackground(Color.WHITE);
        PinChange.addActionListener(this);
        imageLabel.add(PinChange);



        CashWithdrawl = new JButton("Cash Withdrawl");
        CashWithdrawl.setBounds(355, 420, 160, 25);
        CashWithdrawl.setFont(new Font("Raleway", Font.BOLD, 14));
        CashWithdrawl.setForeground(Color.BLACK);
        CashWithdrawl.setBackground(Color.WHITE);
        CashWithdrawl.addActionListener(this);
        imageLabel.add(CashWithdrawl);

        MiniStatement = new JButton("Mini Statement");
        MiniStatement.setBounds(355, 455, 160, 25);
        MiniStatement.setFont(new Font("Raleway", Font.BOLD, 14));
        MiniStatement.setForeground(Color.BLACK);
        MiniStatement.setBackground(Color.WHITE);
        MiniStatement.addActionListener(this);
        imageLabel.add(MiniStatement);


        BalanceEnquiry = new JButton("Balance Enquiry");
        BalanceEnquiry.setBounds(355, 490, 160, 25);
        BalanceEnquiry.setFont(new Font("Raleway", Font.BOLD, 14));
        BalanceEnquiry.setForeground(Color.BLACK);
        BalanceEnquiry.setBackground(Color.WHITE);
        BalanceEnquiry.addActionListener(this);
        imageLabel.add(BalanceEnquiry);

        Exit = new JButton("Exit");
        Exit.setBounds(355, 525, 160, 25);
        Exit.setFont(new Font("Raleway", Font.BOLD, 14));
        Exit.setForeground(Color.BLACK);
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        imageLabel.add(Exit);


        setLocation(500,0);
        setSize(900, 870);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Exit) {
            System.exit(0);
        } else if(e.getSource() == depositButton) {
            setVisible(false);
            new Deposit(pin).setVisible(true);
        } else if (e.getSource() == CashWithdrawl ) {
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        } else if (e.getSource() == FastCash){
            setVisible(false);
            new FastCash(pin).setVisible(true);
        } else if(e.getSource() == PinChange) {
            setVisible(false);
            new PinChange(pin).setVisible(true);
        } else if (e.getSource() == BalanceEnquiry) {
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        } else if (e.getSource() == MiniStatement) {
            new MiniStatement(pin).setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Transaction("");
    }

}
