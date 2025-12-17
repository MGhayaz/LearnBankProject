package BankManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp3 extends JFrame implements ActionListener {

    JLabel AccountType, AccountDetails, CardNumber, CardNumberFormat, PIN, CardNumberFormatdetails, PINNumberFormat;
    JRadioButton SavingAccount, FixedDepositAccount, CurrentAccount, RecurringDepositAccount;
    JCheckBox ATMCard, InternetBanking, MobileBanking, EmailSMSAlerts, EStatement, ChequeBook, Declaration;
    JButton Submit, Cancel;
    boolean AccountDetailsisSubmitted = false;
    static int random;

    SignUp3(int random) {
        this.random = random;
        AccountDetails = new JLabel("Page 3 : Account Details");
        AccountDetails.setBounds(280, 50, 380, 30);
        AccountDetails.setFont(new Font("Raleway", Font.BOLD, 24));
        add(AccountDetails);

        AccountType = new JLabel("Account Type :");
        AccountType.setBounds(90, 130, 160, 25);
        AccountType.setFont(new Font("Raleway", Font.BOLD, 18));
        add(AccountType);
        SavingAccount = new JRadioButton("Saving Account");
        SavingAccount.setBounds(90, 170, 150, 25);
        SavingAccount.setForeground(Color.BLACK);
        SavingAccount.setBackground(Color.WHITE);
        SavingAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        add(SavingAccount);
        FixedDepositAccount = new JRadioButton("Fixed Deposit Account");
        FixedDepositAccount.setBounds(400, 170, 210, 25);
        FixedDepositAccount.setForeground(Color.BLACK);
        FixedDepositAccount.setBackground(Color.WHITE);
        FixedDepositAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        add(FixedDepositAccount);
        CurrentAccount = new JRadioButton("Current Account");
        CurrentAccount.setBounds(90, 210, 230, 25);
        CurrentAccount.setForeground(Color.BLACK);
        CurrentAccount.setBackground(Color.WHITE);
        CurrentAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        add(CurrentAccount);
        RecurringDepositAccount = new JRadioButton("Recurring Deposit Account");
        RecurringDepositAccount.setBounds(400, 210, 250, 25);
        RecurringDepositAccount.setForeground(Color.BLACK);
        RecurringDepositAccount.setBackground(Color.WHITE);
        RecurringDepositAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        add(RecurringDepositAccount);

        ButtonGroup AccountTypeButtonGroup = new ButtonGroup();
        AccountTypeButtonGroup.add(SavingAccount);
        AccountTypeButtonGroup.add(FixedDepositAccount);
        AccountTypeButtonGroup.add(CurrentAccount);
        AccountTypeButtonGroup.add(RecurringDepositAccount);


        //Card Number

        CardNumber = new JLabel("Card Number :");
        CardNumber.setBounds(90, 290, 230, 25);
        CardNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        add(CardNumber);

        CardNumberFormat = new JLabel("XXXX-XXXX-XXXX-9013");
        CardNumberFormat.setBounds(330, 290, 230, 25);
        CardNumberFormat.setFont(new Font("Raleway", Font.BOLD, 18));
        add(CardNumberFormat);
        CardNumberFormatdetails = new JLabel("16 digit unique Card Number Format ");
        CardNumberFormatdetails.setBounds(330, 310, 230, 25);
        CardNumberFormatdetails.setFont(new Font("Raleway", Font.PLAIN, 11));
        add(CardNumberFormatdetails);


        //Pin

        PIN = new JLabel("PIN Type :");
        PIN.setBounds(90, 340, 160, 25);
        PIN.setFont(new Font("Raleway", Font.BOLD, 18));
        add(PIN);
        PINNumberFormat = new JLabel("XXXX");
        PINNumberFormat.setBounds(330, 340, 130, 25);
        PINNumberFormat.setFont(new Font("Raleway", Font.BOLD, 18));
        add(PINNumberFormat);
        CardNumberFormatdetails = new JLabel("Four Digit Unique PIN for Card");
        CardNumberFormatdetails.setBounds(330, 355, 230, 25);
        CardNumberFormatdetails.setFont(new Font("Raleway", Font.PLAIN, 11));
        add(CardNumberFormatdetails);

        CardNumberFormat = new JLabel("XXXX-XXXX-XXXX-9013");
        CardNumberFormat.setBounds(330, 290, 230, 25);
        CardNumberFormat.setFont(new Font("Raleway", Font.BOLD, 18));
        add(CardNumberFormat);

        //Services Required
        AccountType = new JLabel("Services Requried:");
        AccountType.setBounds(90, 430, 190, 25);
        AccountType.setFont(new Font("Raleway", Font.BOLD, 18));
        add(AccountType);


        ATMCard = new JCheckBox("ATM Card");
        ATMCard.setBounds(90, 480, 140, 25);
        ATMCard.setForeground(Color.BLACK);
        ATMCard.setBackground(Color.WHITE);
        ATMCard.setFont(new Font("Raleway", Font.PLAIN, 15));
        add(ATMCard);

        InternetBanking = new JCheckBox("Internet Banking");
        InternetBanking.setBounds(370, 480, 180, 25);
        InternetBanking.setForeground(Color.BLACK);
        InternetBanking.setBackground(Color.WHITE);
        InternetBanking.setFont(new Font("Raleway", Font.PLAIN, 15));
        add(InternetBanking);

        MobileBanking = new JCheckBox("Mobile Banking");
        MobileBanking.setBounds(90, 520, 180, 25);
        MobileBanking.setForeground(Color.BLACK);
        MobileBanking.setBackground(Color.WHITE);
        MobileBanking.setFont(new Font("Raleway", Font.PLAIN, 15));
        add(MobileBanking);

        EmailSMSAlerts = new JCheckBox("Email & SMS Alerts");
        EmailSMSAlerts.setBounds(370, 520, 190, 25);
        EmailSMSAlerts.setForeground(Color.BLACK);
        EmailSMSAlerts.setBackground(Color.WHITE);
        EmailSMSAlerts.setFont(new Font("Raleway", Font.PLAIN, 15));
        add(EmailSMSAlerts);

        ChequeBook = new JCheckBox("Cheque Book");
        ChequeBook.setBounds(90, 560, 140, 25);
        ChequeBook.setForeground(Color.BLACK);
        ChequeBook.setBackground(Color.WHITE);
        ChequeBook.setFont(new Font("Raleway", Font.PLAIN, 15));
        add(ChequeBook);

        EStatement = new JCheckBox("E Statement");
        EStatement.setBounds(370, 560, 140, 25);
        EStatement.setForeground(Color.BLACK);
        EStatement.setBackground(Color.WHITE);
        EStatement.setFont(new Font("Raleway", Font.PLAIN, 15));
        add(EStatement);


        Declaration = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        Declaration.setBounds(50, 610, 670, 25);
        Declaration.setForeground(Color.BLACK);
        Declaration.setBackground(Color.WHITE);
        Declaration.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Declaration);

        Submit = new JButton("Submit");
        Submit.setBounds(590, 660, 90, 35);
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.BLACK);
        Submit.addActionListener(this);
        add(Submit);


        Cancel = new JButton("Cancel");
        Cancel.setBounds(130, 660, 90, 35);
        Cancel.setForeground(Color.WHITE);
        Cancel.setBackground(Color.BLACK);
        Cancel.addActionListener(this);
        add(Cancel);


        setTitle("Ghayaz Finance Pvt Ltd. - Account Details");
        setSize(850, 800);
        setLocation(600, 80);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Submit) {
            if (AccountDetailsisSubmitted){
                JOptionPane.showMessageDialog(null, "Account Already Created");
                return;
            }

            String acType = null;
            if (SavingAccount.isSelected()) {
                acType = SavingAccount.getText();
            } else if (CurrentAccount.isSelected()) {
                acType = CurrentAccount.getText();
            } else if (FixedDepositAccount.isSelected()) {
                acType = FixedDepositAccount.getText();
            } else if (RecurringDepositAccount.isSelected()) {
                acType = RecurringDepositAccount.getText();
            }

            long base = 1206000000000000L;
            long randomPart = (long) (Math.random() * 1000000000000L);
            String cardNumber = String.valueOf(base + randomPart);

            int pin = (int)(Math.random() * 9000) + 1000; // 1000–9999
            String pinNumber = String.valueOf(pin);

            String facilty = "";
            if (ATMCard.isSelected()) {
                facilty = facilty + " "+ ATMCard.getText();
            }  if (InternetBanking.isSelected()) {
                facilty = facilty + " "+ InternetBanking.getText();
            }  if (MobileBanking.isSelected()) {
                facilty = facilty + " "+ MobileBanking.getText();
            }  if (EmailSMSAlerts.isSelected()) {
                facilty = facilty + " "+ EmailSMSAlerts.getText();
            }  if (ChequeBook.isSelected()) {
                facilty = facilty + " "+ ChequeBook.getText();
            }  if (EStatement.isSelected()) {
                facilty = facilty + " "+ EStatement.getText();
            }

            try {
                if (!Declaration.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please Check Declaration");
                } else if (acType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Select Account");
                } else {
                    DataBaseConnection dbc = new DataBaseConnection();
                    String query1 = "insert into signUpthree values(" + random + ",'" + acType + "','" + cardNumber + "','" + pinNumber + "','" + facilty + "')";
                    String query2 = "insert into Login values(" + random + ",'" + cardNumber + "','" + pinNumber + "')";
                    JOptionPane.showMessageDialog(null, "Your account has been created\n Your Card Number: " + cardNumber + "\nAnd PIn is: "+pinNumber);


                    dbc.st.executeUpdate(query1);
                    dbc.st.executeUpdate(query2);
                    AccountDetailsisSubmitted = true;
                    Submit.setEnabled(false);
                    // setVisible(false);
                }

            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }

        }

    }

    public static void main(String[] args) {
        SignUp3 signUp3 = new SignUp3(random);

    }
}
