package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SignUp2 extends JFrame implements ActionListener {

    JLabel Religion, Category, Income, Occupation, PANCard, AdhaarCard, EducationQualification, SeniorCitizen, existingcustomer;
    JComboBox ReligionField, CategoryField, IncomeField, OccupationField, EducationQualificationField;
    JRadioButton existingcustomerYes, existingcustomerNO, seniorcitizenYes, seniorcitizenNo;
    JTextField PANCardField, AdhaarCardField;
    JButton nextButton, previousButton;
    static int random;

    public SignUp2(int random) {
        this.random = random;
        setTitle("Ghayaz Finance Pvt Ltd. - Additional Details ");

        JLabel personal = new JLabel("Page 2 : Additional Details");
        personal.setBounds(280, 110, 380, 30);
        personal.setFont(new Font("Raleway", Font.BOLD, 24));
        add(personal);


        Religion = new JLabel("Religion :");
        Religion.setBounds(90, 220, 90, 25);
        Religion.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Religion);
        String religion[] = {
                "Athiest",
                "Hindu",
                "Muslim",
                "Christian",
                "Sikh",
                "Buddhist",
                "Jain",
                "Parsi",
                "Jewish",
                "Other"
        };
        ReligionField = new JComboBox(religion);
        ReligionField.setBounds(290, 220, 400, 25);
        ReligionField.setBackground(Color.WHITE);
        ReligionField.setForeground(Color.BLACK);
        ReligionField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(ReligionField);

        Category = new JLabel("Category :");
        Category.setBounds(90, 270, 140, 25);
        Category.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Category);
        String category[] = {
                "Select Category",
                "General",
                "OBC",
                "SC",
                "ST",
                "EWS",
                "NT",
                "VJNT",
                "Minority",
                "Other"
        };
        CategoryField = new JComboBox(category);
        CategoryField.setBounds(290, 270, 400, 25);
        CategoryField.setBackground(Color.WHITE);
        CategoryField.setForeground(Color.BLACK);
        CategoryField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(CategoryField);

        Income = new JLabel("Income :");
        Income.setBounds(90, 320, 140, 25);
        Income.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Income);
        String income[] = {
                "Select Income",
                "No Income",
                "Below 1 Lakh",
                "1 – 2.5 Lakh",
                "2.5 – 5 Lakh",
                "5 – 7.5 Lakh",
                "7.5 – 10 Lakh",
                "10 – 15 Lakh",
                "15 – 25 Lakh",
                "Above 25 Lakh"
        };
        IncomeField = new JComboBox(income);
        IncomeField.setBounds(290, 320, 400, 25);
        IncomeField.setBackground(Color.WHITE);
        IncomeField.setForeground(Color.BLACK);
        IncomeField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(IncomeField);


        EducationQualification = new JLabel("Education Qualification :");
        EducationQualification.setBounds(90, 370, 219, 25);
        EducationQualification.setFont(new Font("Raleway", Font.BOLD, 18));
        add(EducationQualification);
        String education[] = {
                "Select Qualification",
                "Below 10th",
                "10th Pass",
                "12th Pass",
                "Diploma",
                "Graduate",
                "Post Graduate",
                "Doctorate (PhD)",
                "Professional Degree",
                "Vocational Course",
                "Other"
        };

        EducationQualificationField = new JComboBox(education);
        EducationQualificationField.setBackground(Color.WHITE);
        EducationQualificationField.setForeground(Color.BLACK);
        EducationQualificationField.setBounds(330, 370, 400, 25);
        EducationQualificationField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(EducationQualificationField);


        Occupation = new JLabel("Occupation :");
        Occupation.setBounds(90, 420, 140, 25);
        Occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Occupation);
        String occupation[] = {
                "Select Occupation",
                "Student",
                "Salaried",
                "Self Employed",
                "Business",
                "Professional",
                "Farmer",
                "Government Employee",
                "Private Employee",
                "Retired",
                "Other"
        };

        OccupationField = new JComboBox(occupation);
        OccupationField.setBounds(290, 420, 400, 25);
        OccupationField.setFont(new Font("Raleway", Font.BOLD, 14));
        OccupationField.setBackground(Color.WHITE);
        OccupationField.setForeground(Color.BLACK);
        add(OccupationField);

        PANCard = new JLabel("PANCard :");
        PANCard.setBounds(90, 470, 140, 25);
        PANCard.setFont(new Font("Raleway", Font.BOLD, 18));
        add(PANCard);
        PANCardField = new JTextField();
        PANCardField.setBounds(290, 470, 400, 25);
        PANCardField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(PANCardField);

        AdhaarCard = new JLabel("AdhaarCard :");
        AdhaarCard.setBounds(90, 520, 140, 25);
        AdhaarCard.setFont(new Font("Raleway", Font.BOLD, 18));
        add(AdhaarCard);
        AdhaarCardField = new JTextField();
        AdhaarCardField.setBounds(290, 520, 400, 25);
        AdhaarCardField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(AdhaarCardField);

        SeniorCitizen = new JLabel("Senior Citizen :");
        SeniorCitizen.setBounds(90, 570, 140, 25);
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 18));
        add(SeniorCitizen);
        seniorcitizenYes = new JRadioButton("Yes");
        seniorcitizenYes.setBounds(330, 570, 80, 25);
        seniorcitizenYes.setForeground(Color.BLACK);
        seniorcitizenYes.setBackground(Color.WHITE);
        seniorcitizenYes.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(seniorcitizenYes);
        seniorcitizenNo = new JRadioButton("No");
        seniorcitizenNo.setBounds(430, 570, 80, 25);
        seniorcitizenNo.setForeground(Color.BLACK);
        seniorcitizenNo.setBackground(Color.WHITE);
        seniorcitizenNo.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(seniorcitizenNo);
        ButtonGroup seniorCitizenButtonGroup = new ButtonGroup();
        seniorCitizenButtonGroup.add(seniorcitizenYes);
        seniorCitizenButtonGroup.add(seniorcitizenNo);


        existingcustomer = new JLabel("Existing Customer :");
        existingcustomer.setBounds(90, 620, 180, 25);
        existingcustomer.setFont(new Font("Raleway", Font.BOLD, 18));
        add(existingcustomer);
        existingcustomerYes = new JRadioButton("Yes");
        existingcustomerYes.setBounds(330, 620, 80, 25);
        existingcustomerYes.setForeground(Color.BLACK);
        existingcustomerYes.setBackground(Color.WHITE);
        existingcustomerYes.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(existingcustomerYes);
        existingcustomerNO = new JRadioButton("No");
        existingcustomerNO.setBounds(430, 620, 80, 25);
        existingcustomerNO.setForeground(Color.BLACK);
        existingcustomerNO.setBackground(Color.WHITE);
        existingcustomerNO.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(existingcustomerNO);
        ButtonGroup ExistingCustomerButtonGroup = new ButtonGroup();
        ExistingCustomerButtonGroup.add(existingcustomerYes);
        ExistingCustomerButtonGroup.add(existingcustomerNO);


        // next button
        nextButton = new JButton("Next");
        nextButton.setBounds(590, 680, 90, 35);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBackground(Color.BLACK);
        nextButton.addActionListener(this);
        add(nextButton);


        // back to login page button
        previousButton = new JButton("Previous");
        previousButton.setBounds(250, 680, 90, 35);
        previousButton.setForeground(Color.WHITE);
        previousButton.setBackground(Color.BLACK);
        previousButton.addActionListener(this);
        add(previousButton);


        setSize(850, 800);
        setLocation(600, 80);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp2(random);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == previousButton) {
            setVisible(false);
            new SignUp().setVisible(true);
        } else if (e.getSource() == nextButton) {
            int srandom = random;
            String sreligion = (String) ReligionField.getSelectedItem();
            String scategory = (String) CategoryField.getSelectedItem();
            String sincome = (String) IncomeField.getSelectedItem();
            String seducation = (String) EducationQualificationField.getSelectedItem();
            String sOccupation = (String) OccupationField.getSelectedItem();

            String sPan = PANCardField.getText();
            String sAdhaar = AdhaarCardField.getText();
            String seniorcitizen = null;
            String existingcustomer = null;
            if (seniorcitizenYes.isSelected()) {
                seniorcitizen = seniorcitizenYes.getText();
            } else if (seniorcitizenNo.isSelected()) {
                seniorcitizen = seniorcitizenNo.getText();
            }
            if (existingcustomerYes.isSelected()) {
                existingcustomer = existingcustomerYes.getText();
            } else if (existingcustomerNO.isSelected()) {
                existingcustomer = existingcustomerNO.getText();
            }


            try {
                if (sAdhaar.equals("") || sPan.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Required Fields");
                } else {
                    DataBaseConnection dbc = new DataBaseConnection();
                    String Query = "insert into signUpTwo values('" + srandom + "','" + sreligion + "','" + scategory + "','" + sincome + "'," +
                            "'" + seducation + "','" + sOccupation + "','" + sPan + "','" + sAdhaar + "','" + seniorcitizen + "','" + existingcustomer + "')";
                    dbc.st.executeUpdate(Query);
                }

            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }


        }

    }
}



