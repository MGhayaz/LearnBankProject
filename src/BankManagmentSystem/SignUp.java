package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener {

    int random;
    JTextField nameField, fathersnameField, emailField, addressField, cityFeild, stateField, pincodeFeild;
    JDateChooser DOBFeild;
    JRadioButton male, female, othergender, Married, UnMarried, otherMaternityStatus;
    JButton nextButton , previousButton;

    public SignUp() {
        setTitle("Ghayaz Finance Pvt Ltd. - Personal Details");

        JLabel brandName = new JLabel("GHAYAZ Finance Pvt Ltd.");
        brandName.setBounds(230, 40, 600, 40);
        brandName.setFont(new Font("Raleway", Font.BOLD, 36));
        add(brandName);


        //Application
        random = (int) Math.round(Math.random() * 10000);
        JLabel frc = new JLabel("APPLICATION FORM NO: " + random);
        frc.setBounds(90, 100, 600, 40);
        frc.setFont(new Font("Raleway", Font.BOLD, 28));
        add(frc);

        // application page
        JLabel personal = new JLabel("Page 1 : Personal Details");
        personal.setBounds(90, 150, 300, 30);
        personal.setFont(new Font("Raleway", Font.PLAIN, 24));
        add(personal);
        // name
        JLabel name = new JLabel("Name :");
        name.setBounds(90, 220, 70, 25);
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        add(name);

        nameField = new JTextField();
        nameField.setBounds(250, 220, 400, 25);
        nameField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(nameField);
        // father name
        JLabel fathersName = new JLabel("Father Name :");
        fathersName.setBounds(90, 270, 140, 25);
        fathersName.setFont(new Font("Raleway", Font.BOLD, 18));
        add(fathersName);
        fathersnameField = new JTextField();
        fathersnameField.setBounds(250, 270, 400, 25);
        fathersnameField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(fathersnameField);
        //Date of birth
        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setBounds(90, 320, 150, 25);
        DOB.setFont(new Font("Raleway", Font.BOLD, 18));
        add(DOB);

        DOBFeild = new JDateChooser();
        DOBFeild.setBounds(250, 320, 400, 25);
        DOBFeild.setForeground(Color.BLACK);
        add(DOBFeild);
        //gender
        JLabel Gender = new JLabel("Gender:");
        Gender.setBounds(90, 370, 80, 25);
        Gender.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Gender);

        male = new JRadioButton("MALE");
        male.setBounds(250, 370, 80, 25);
        male.setForeground(Color.BLACK);
        male.setBackground(Color.WHITE);
        male.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(male);

        female = new JRadioButton("FEMALE");
        female.setBounds(370, 370, 100, 25);
        female.setForeground(Color.BLACK);
        female.setBackground(Color.WHITE);
        female.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(female);

        othergender = new JRadioButton("OTHER");
        othergender.setBounds(500, 370, 90, 25);
        othergender.setForeground(Color.BLACK);
        othergender.setBackground(Color.WHITE);
        othergender.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(othergender);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        buttonGroup.add(othergender);
        //email
        JLabel Email = new JLabel("Email Address:");
        Email.setBounds(90, 420, 150, 25);
        Email.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Email);
        emailField = new JTextField();
        emailField.setBounds(250, 420, 400, 25);
        emailField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(emailField);
        //maternity
        JLabel Maternity = new JLabel("Marital Status:");
        Maternity.setBounds(90, 470, 140, 25);
        Maternity.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Maternity);
        Married = new JRadioButton("MARRIED");
        Married.setBounds(250, 470, 120, 25);
        Married.setForeground(Color.BLACK);
        Married.setBackground(Color.WHITE);
        Married.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(Married);

        UnMarried = new JRadioButton("UNMARRIED");
        UnMarried.setBounds(370, 470, 140, 25);
        UnMarried.setForeground(Color.BLACK);
        UnMarried.setBackground(Color.WHITE);
        UnMarried.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(UnMarried);
        otherMaternityStatus = new JRadioButton("OTHER");
        otherMaternityStatus.setBounds(520, 470, 90, 25);
        otherMaternityStatus.setForeground(Color.BLACK);
        otherMaternityStatus.setBackground(Color.WHITE);
        otherMaternityStatus.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(otherMaternityStatus);

        ButtonGroup MaritalbuttonGroup = new ButtonGroup();
        MaritalbuttonGroup.add(Married);
        MaritalbuttonGroup.add(UnMarried);
        MaritalbuttonGroup.add(otherMaternityStatus);
        //address
        JLabel Address = new JLabel("Address:");
        Address.setBounds(90, 520, 80, 25);
        Address.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Address);
        addressField = new JTextField();
        addressField.setBounds(250, 520, 400, 25);
        addressField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressField);
        //city
        JLabel City = new JLabel("City:");
        City.setBounds(90, 570, 60, 25);
        City.setFont(new Font("Raleway", Font.BOLD, 18));
        add(City);
        cityFeild = new JTextField();
        cityFeild.setBounds(250, 570, 400, 25);
        cityFeild.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityFeild);
        //state
        JLabel State = new JLabel("State:");
        State.setBounds(90, 620, 70, 25);
        State.setFont(new Font("Raleway", Font.BOLD, 18));
        add(State);
        stateField = new JTextField();
        stateField.setBounds(250, 620, 400, 25);
        stateField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stateField);
        //pincode
        JLabel PinCode = new JLabel("Area PinCode:");
        PinCode.setBounds(90, 670, 140, 25);
        PinCode.setFont(new Font("Raleway", Font.BOLD, 18));
        add(PinCode);
        pincodeFeild = new JTextField();
        pincodeFeild.setBounds(250, 670, 400, 25);
        pincodeFeild.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pincodeFeild);


        // next button
        nextButton = new JButton("Next");
        nextButton.setBounds(590, 710, 90, 35);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBackground(Color.BLACK);
        nextButton.addActionListener(this);
        add(nextButton);


        // back to login page button
        previousButton = new JButton("Previous");
        previousButton.setBounds(250, 710, 90, 35);
        previousButton.setForeground(Color.WHITE);
        previousButton.setBackground(Color.BLACK);
        previousButton.addActionListener(this);
        add(previousButton);

        setSize(850, 800);
        setLocation(600, 80);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
//        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nextButton) {
            String name = nameField.getText();
            String Fathername = fathersnameField.getText();
            String address = addressField.getText();
            String DOB = ((JTextField) DOBFeild.getDateEditor().getUiComponent()).getText();
            String City = cityFeild.getText();
            String State = (stateField.getText());
            String Pincode = pincodeFeild.getText();
            String email = emailField.getText();

            String Gender = null;
            if (male.isSelected()) {
                Gender = "Male";
            } else if (female.isSelected()) {
                Gender = "Female";
            } else if (othergender.isSelected()) {
                Gender = "Other";
            }

            String MaritalStatus = null;
            if (Married.isSelected()) {
                MaritalStatus = "Married";
            } else if (UnMarried.isSelected()) {
                MaritalStatus = "Unmarried";
            } else if (otherMaternityStatus.isSelected()) {
                MaritalStatus = "Other";
            }


            try {
                if (name.equals("") || Fathername.equals("") || address.equals("") || DOB.equals("") || City.equals("")
                        || State.equals("") || Pincode.equals("") || email.equals("") || Gender == null
                        || MaritalStatus == null) {
                    JOptionPane.showMessageDialog(null, "Please Enter Required Fields");
                }
                else {
                    DataBaseConnection dbc = new DataBaseConnection();
                    String Query = "insert into signUp values('"+random+"','"+name+"','"+Fathername+"','"+address+"'," +
                            "'"+DOB+"','"+City+"','"+State+"','"+Pincode+"','"+email+"','"+Gender+"','"+MaritalStatus+"')";
                    dbc.st.executeUpdate(Query); // dml command


                    setVisible(false);
                    new SignUp2(random).setVisible(true);
                }
            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }
        } else if(e.getSource() == previousButton) {
            setVisible(false);
            new Login().setVisible(true);

        }


    }

    public static void main(String[] args) {
        new SignUp();

    }
}
