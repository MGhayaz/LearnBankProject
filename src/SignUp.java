import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {


    public SignUp() {

        JLabel brandName = new JLabel("GHAYAZ Finance Pvt Ltd.");
        brandName.setBounds(230, 40, 600, 40);
        brandName.setFont(new Font("Raleway", Font.BOLD, 36));
        add(brandName);


        //Application
        int random = (int) Math.round(Math.random() * 10000);
        JLabel frc = new JLabel("APPLICATION FORM NO: " + random);
        frc.setBounds(90, 100, 600, 40);
        frc.setFont(new Font("Raleway", Font.BOLD, 28));
        add(frc);

        // application page
        JLabel personal = new JLabel("Page 1 : Personal Details: ");
        personal.setBounds(90, 150, 300, 30);
        personal.setFont(new Font("Raleway", Font.BOLD, 24));
        add(personal);
        // name
        JLabel name = new JLabel("Name :");
        name.setBounds(90, 220, 70, 25);
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(250, 220, 400, 25);
        nameField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(nameField);
        // father name
        JLabel fathersName = new JLabel("Father Name :");
        fathersName.setBounds(90, 270, 140, 25);
        fathersName.setFont(new Font("Raleway", Font.BOLD, 18));
        add(fathersName);
        JTextField fathersnameField = new JTextField();
        fathersnameField.setBounds(250, 270, 400, 25);
        fathersnameField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(fathersnameField);
        //Date of birth
        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setBounds(90, 320, 150, 25);
        DOB.setFont(new Font("Raleway", Font.BOLD, 18));
        add(DOB);
        //gender
        JLabel Gender = new JLabel("Gender:");
        Gender.setBounds(90, 370, 80, 25);
        Gender.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Gender);
        //email
        JLabel Email = new JLabel("Email Address:");
        Email.setBounds(90, 420, 150, 25);
        Email.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Email);
        JTextField emailField = new JTextField();
        emailField.setBounds(250, 420, 400, 25);
        emailField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(emailField);
        //maternity
        JLabel Maternity = new JLabel("Marital Status:");
        Maternity.setBounds(90, 470, 140, 25);
        Maternity.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Maternity);
        //address
        JLabel Address = new JLabel("Address:");
        Address.setBounds(90, 520, 80, 25);
        Address.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Address);
        JTextField addressField = new JTextField();
        addressField.setBounds(250, 520, 400, 25);
        addressField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressField);
        //city
        JLabel City = new JLabel("City:");
        City.setBounds(90, 570, 60, 25);
        City.setFont(new Font("Raleway", Font.BOLD, 18));
        add(City);
        JTextField cityFeild = new JTextField();
        cityFeild.setBounds(250, 570, 400, 25);
        cityFeild.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityFeild);
        //state
        JLabel State = new JLabel("State:");
        State.setBounds(90, 620, 70, 25);
        State.setFont(new Font("Raleway", Font.BOLD, 18));
        add(State);
        JTextField stateFeild = new JTextField();
        stateFeild.setBounds(250, 620, 400, 25);
        stateFeild.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stateFeild);
        //pincode
        JLabel PinCode = new JLabel("Area PinCode:");
        PinCode.setBounds(90, 670, 140, 25);
        PinCode.setFont(new Font("Raleway", Font.BOLD, 18));
        add(PinCode);
        JTextField pincodeFeild = new JTextField();
        pincodeFeild.setBounds(250, 670, 400, 25);
        pincodeFeild.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pincodeFeild);

        setSize(850, 800);
        setLocation(600, 80);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SignUp();

    }
}
