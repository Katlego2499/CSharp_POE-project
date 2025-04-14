/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Register {
    // creating CheckUsername method
    
     public String Username, Password,PasswordConfirmirtaion,FirstName,LastName;
     public int cellphone;
    public  void CheckUserName(){
        // conditions that should be met for the user to be correct
    boolean Underscore =Username.contains("_");
    if(Underscore==true && Username.length()<=5){
        JOptionPane.showConfirmDialog(null, "Your Username has succefully been captured.");
    }else{
                JOptionPane.showConfirmDialog(null, "Your Username has not been formatted correctley, "  
                        + "Please ensure that your username "  
                        + "contains an underscore and no " 
                        + "more than five characters in length.");
                  Username=JOptionPane.showInputDialog("Enter user name"); 
             CheckUserName();// call the method until the username is correct/valid
                
                
                }
    }
public boolean checkpassword(String password) {
boolean hasDigit=false, hasUppercase=false, hasSpecialChar=false;
        String SpecialChar="!@#$%^&*()_+<>?/{}[];:'\",.";
        for(char ch:password.toCharArray()) { 
            if (Character.isUpperCase(ch)) hasUppercase=true;
             if (Character.isDigit(ch)) hasDigit=true;
             if (SpecialChar.contains(String.valueOf(ch))) hasSpecialChar=true;
            
        }
                return password.length()>=8 && hasDigit && hasSpecialChar && hasUppercase;
}

   
    public  void  RegisterUser(){
        // declaring variables
    
     // prompting the user to enter FirstName, LastName, Username, Password and Cellphone number.
     FirstName=JOptionPane.showInputDialog("Enter FirstName");
     LastName=JOptionPane.showInputDialog("Enter Last Name");
      Username=JOptionPane.showInputDialog("Enter user name"); 
             CheckUserName();// calling the method  to check the
     Password=JOptionPane.showInputDialog("Enter user Password");
     //Checking password requiremnets 
     if (!checkpassword(Password)) {
         
         JOptionPane.showMessageDialog(null, "Password should have atleast 8 charcters and should contain special character and number ");
         return;
     }
     //Prompting user to confirm password
     PasswordConfirmirtaion=JOptionPane.showInputDialog("Confirm Password");
     
   // prompting the user to enter cellphone number
  String cellphoneInput = JOptionPane.showInputDialog(null, "Enter cellphone number (Start with +27)");
     

// Validate South African cellphone number (27+ followed by 9 digits)
String cellphoneRegex = "^\\+27\\d{9}$";
if (!cellphoneInput.matches(cellphoneRegex)) {
    JOptionPane.showMessageDialog(null, "Cell phone number not formated corectly or does not consist of the international code." +
            " Please enter in format: +27_________ (11 digits total)");
    return;
}
      
      JOptionPane.showMessageDialog(null, "Sucessfully registered the user! You may Log in now." );
      
    }
    //User Login
    public void Login(){
        //Prompting user to enter both a Username and Password
        String enteredUsername=JOptionPane.showInputDialog("Enter you Username");
         String enteredPassword=JOptionPane.showInputDialog("Enter you Password");
         //Checking if the username and password is the same
    if (enteredUsername.equals(Username)&& enteredPassword.equals(Password)) {
        //Telling the user its good to see them again if login was successful
        JOptionPane.showMessageDialog(null, "Welcome, " + FirstName + "" + LastName+ "Great to see you once again" + "!");
    } else {
    JOptionPane.showMessageDialog(null, "Incorrect username or password. Please try again.");
    Login();
    }
    }
    public static void  main(String[] args) {
        // Creating the register
        Register user =new Register();
        user.RegisterUser();
        
     
    }
}






















































