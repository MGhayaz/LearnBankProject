
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
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
        CardNo.setBounds(120, 170, 90, 20);
        CardNo.setFont(new Font("Raleway", Font.BOLD, 18));
        add(CardNo);

        JTextField cardFeild = new JTextField();
        cardFeild.setBounds(210, 170, 150, 20);
        add(cardFeild);


        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 200, 80, 20);
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pin);

        JTextField PinFeild = new JTextField();
        PinFeild.setBounds(210, 200, 150, 20);
        add(PinFeild);


        // Frame Settings
        getContentPane().setBackground(Color.white);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public static void main(String[] args) {
        new Login();

    }
}