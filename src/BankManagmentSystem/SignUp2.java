package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;

public class SignUp2 extends JFrame {

    JLabel Religion, Category, Income ,Occupation, PANCard, AdhaarCard,EducationQualification;
    JTextField ReligionField , CategoryField, IncomeField ,  OccupationField, PANCardField, AdhaarCardField, EducationQualificationField ;
    public SignUp2()  {
        setTitle("Ghayaz Finance Pvt Ltd.- Additional Details ");

        JLabel personal = new JLabel("Page 1 : Additional Details");
        personal.setBounds(90, 150, 300, 30);
        personal.setFont(new Font("Raleway", Font.PLAIN, 24));
        add(personal);


        Religion = new JLabel("Religion :");
        Religion.setBounds(90, 220, 90, 25);
        Religion.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Religion);
        ReligionField= new JTextField();
        ReligionField.setBounds(290, 220, 400, 25);
        ReligionField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(ReligionField);

        Category = new JLabel("Category :");
        Category.setBounds(90, 270, 140, 25);
        Category.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Category);
        CategoryField = new JTextField();
        CategoryField.setBounds(290, 270, 400, 25);
        CategoryField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(CategoryField);

        Income = new JLabel("Income :");
        Income.setBounds(90, 320, 140, 25);
        Income.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Income);
        IncomeField = new JTextField();
        IncomeField.setBounds(290, 320, 400, 25);
        IncomeField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(IncomeField);



        Occupation = new JLabel("Occupation :");
        Occupation.setBounds(90, 420, 140, 25);
        Occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Occupation);
        OccupationField = new JTextField();
        OccupationField.setBounds(290, 420, 400, 25);
        OccupationField.setFont(new Font("Raleway", Font.BOLD, 14));
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

        EducationQualification = new JLabel("Education Qualification :");
        EducationQualification.setBounds(90, 370, 219, 25);
        EducationQualification.setFont(new Font("Raleway", Font.BOLD, 18));
        add(EducationQualification);
        EducationQualificationField = new JTextField();
        EducationQualificationField.setBounds(330, 370, 400, 25);
        EducationQualificationField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(EducationQualificationField);


















        setSize(850, 800);
        setLocation(600, 80);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp2();
    }
}



