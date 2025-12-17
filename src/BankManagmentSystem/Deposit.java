package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    JButton DepositButton, BackButton;
    JLabel textLabel;
    JTextField textField;
    String pin;

    Deposit(String pin){
        this.pin = pin;

        setLayout(null);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectInterface.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);

        textLabel = new JLabel("Enter the amount you want to deposit");
        textLabel.setBounds(190,320,290,25);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Raleway",Font.BOLD,16));
        imageLabel.add(textLabel);


        textField = new JTextField();
        textField.setBounds(190,350,290,25);
        textField.setFont(new Font("Raleway",Font.BOLD,16));
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.WHITE);
        imageLabel.add(textField);

        DepositButton = new JButton("Deposit");
        DepositButton.setBounds(400,490,110,25);
        DepositButton.setBackground(Color.WHITE);
        DepositButton.setForeground(Color.BLACK);
        DepositButton.setFont(new Font("Raleway",Font.BOLD,16));
        DepositButton.addActionListener(this);
        imageLabel.add(DepositButton);

        BackButton = new JButton("Back");
        BackButton.setBounds(410,520,100,25);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.BLACK);
        BackButton.setFont(new Font("Raleway",Font.BOLD,16));
        BackButton.addActionListener(this);
        imageLabel.add(BackButton);








        setLocation(500,0);
        setSize(900, 870);

    }

    public static void main(String[] args) {
       new  Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BackButton) {
            setVisible(false);
            new Transaction("").setVisible(true);
        } else if(e.getSource() == DepositButton) {

            String depositamount = textField.getText();
            Date date = new Date();
            if(depositamount.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the deposit amount");
            } else{
                DataBaseConnection dbc = new DataBaseConnection();
                String Query1 = "insert into bankDeposit values('"+pin+"','"+date+"','Deposit','"+depositamount+"')";
                try{
                    dbc.st.executeUpdate(Query1);
                    JOptionPane.showMessageDialog(null, "Deposited Successfully");
                    setVisible(false);
                    new Transaction(pin).setVisible(true);

                } catch(Exception ee){
                    System.out.println(ee.getMessage());
                }
            }



        }

    }
}
