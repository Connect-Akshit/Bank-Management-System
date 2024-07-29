package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame{
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran  = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000l);
        
        JLabel formno = new JLabel("APPLICATION FORM NO." +  random);
        formno.setFont(new Font("Raelway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raelway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raelway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        JTextField nameTextField =  new JTextField();
        nameTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel Fname = new JLabel("Father's name:");
        Fname.setFont(new Font("Raelway", Font.BOLD, 20));
        Fname.setBounds(100, 190, 200, 30);
        add(Fname);
        
        JTextField FnameTextField =  new JTextField();
        FnameTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        FnameTextField.setBounds(300, 190, 400, 30);
        add(FnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raelway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel Gender = new JLabel("Gender:");
        Gender.setFont(new Font("Raelway", Font.BOLD, 20));
        Gender.setBounds(100, 290, 200, 30);
        add(Gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("E-Mail Address:");
        email.setFont(new Font("Raelway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        JTextField emailTextField =  new JTextField();
        emailTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raelway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raelway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        JTextField addressTextField =  new JTextField();
        addressTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raelway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        JTextField cityTextField =  new JTextField();
        cityTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raelway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        JTextField stateTextField =  new JTextField();
        stateTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raelway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        JTextField pincodeTextField =  new JTextField();
        pincodeTextField.setFont(new Font("Raelway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 140, 590, 30);
        add(pincodeTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.setFont(new Font("Raelway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
    
}
