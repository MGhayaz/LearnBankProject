package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {


    JButton Clear , SignUp , signIn ;
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

         SignUp = new JButton("SIGN UP");
        SignUp.setBounds(360, 260, 80, 25);
        SignUp.setBackground(Color.BLACK);
        SignUp.setForeground(Color.WHITE);
        SignUp.addActionListener(this);
        add(SignUp);

         signIn = new JButton("SIGN IN");
        signIn.setBounds(260, 300, 180, 25);
        signIn.setBackground(Color.BLACK);
        signIn.setForeground(Color.WHITE);
        signIn.addActionListener(this);
        add(signIn);


        // Frame Settings
        getContentPane().setBackground(Color.white);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Clear) {
            cardFeild.setText("");
            pinFeild.setText("");
        } else if (e.getSource() == SignUp){

        }
        else if (e.getSource() == signIn){

        }

    }

    public static void main(String[] args) {
        new Login();

    }


}