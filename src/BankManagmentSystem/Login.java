package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {


    JButton Clear, SignIn, signUp;
    JTextField cardFeild;
    JPasswordField pinFeild;

    public Login() {
        setLayout(null);
        // Frame Title
        setTitle("Ghayaz Finance Pvt Ltd.");
        //Image logo setting
        ImageIcon Image1 = new ImageIcon(ClassLoader.getSystemResource("icons/BmsProjectLogo.jpg"));
        Image obj = Image1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon realLogo = new ImageIcon(obj);
        JLabel realLogoLabel = new JLabel(realLogo);
        realLogoLabel.setBounds(50, 20, 100, 100);
        add(realLogoLabel);

        // welcome text setting
        JLabel BigText = new JLabel("Welcome To GHAYAZ Finance Pvt Ltd.");
        BigText.setBounds(200, 35, 600, 40);
        BigText.setFont(new Font("Osward", Font.BOLD, 28));
        add(BigText);


        JLabel CardNo = new JLabel("Card No:");
        CardNo.setBounds(170, 175, 90, 30);
        CardNo.setFont(new Font("Raleway", Font.BOLD, 18));
        add(CardNo);

        cardFeild = new JTextField();
        cardFeild.setBounds(260, 180, 180, 18);
        cardFeild.setFont(new Font("Raleway", Font.BOLD, 13));
        add(cardFeild);


        JLabel pin = new JLabel("PIN        :");
        pin.setBounds(170, 220, 80, 20);
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pin);

        pinFeild = new JPasswordField();
        pinFeild.setBounds(260, 220, 180, 18);
        add(pinFeild);

        Clear = new JButton("CLEAR");
        Clear.setBounds(260, 260, 80, 25);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);

        SignIn = new JButton("SIGN IN");
        SignIn.setBounds(360, 260, 80, 25);
        SignIn.setBackground(Color.BLACK);
        SignIn.setForeground(Color.WHITE);
        SignIn.addActionListener(this);
        add(SignIn);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(260, 300, 180, 25);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);


        // Frame Settings
        getContentPane().setBackground(Color.white);
        setSize(800, 480);
        setVisible(true);
        setLocation(600, 80);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Clear) {
            cardFeild.setText("");
            pinFeild.setText("");
        } else if (e.getSource() == signUp) {
            setVisible(false);
            new SignUp().setVisible(true);
        } else if (e.getSource() == SignIn) {

            String cardNumber = cardFeild.getText().trim();
            String pin = pinFeild.getText().trim();

            if (cardNumber.isEmpty() || pin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Card Number and Pin");
                return;
            }

            String query1 =
                    "select * from Login where cardNumber='" + cardNumber + "' and pinNumber='" + pin + "'";

            try {
                DataBaseConnection dbc = new DataBaseConnection();
                ResultSet rs = dbc.st.executeQuery(query1);

                if (rs.next()) {
                    setVisible(false);
                    new Transaction().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or Pin");
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


        }

    }

    public static void main(String[] args) {
        new Login();

    }


}