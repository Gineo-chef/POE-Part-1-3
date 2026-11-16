/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationlogin;
import java.util.Scanner;
/* package registrationloginapp;*/
/**
 *
 * @author Student
 */
public class RegistrationLoginApp {
 




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        RegistrationLogin login = new RegistrationLogin();
        
        System.out.println("Enter the username");
        String user = input.nextLine();
        if (login.checkUsername(user)) {
            System.out.println("Correct format");
        } else {
            System.out.println("Incorrect format");
        }

        System.out.println("Enter the password");
        String pass = input.nextLine();
        if (login.checkPasswordComplexity(pass)) {
            System.out.println("Correct format");
        } else {
            System.out.println("Incorrect format");
        }
        System.out.println("Enter the CellphoneNumber");
        String number = input.nextLine();
        if (login.checkCellphoneNumber(number)) {
            System.out.println("Correct Format");
        } else {
            System.out.println("Inorrect Format");
        }
        System.out.println("Welcome back to the chatapp");
        System.out.println("Enter the username you have resgistered in with");
        String newUser = input.nextLine();
        System.out.println("Enter the password you have registered with");
        String newPass = input.nextLine();

        if (login.loginUser(user, pass, newUser, newPass)) {
            System.out.println("User login succesful");
            
            
        } else {
            System.out.println("login unsuccesful");
        }
        Messages mess = new Messages();
        mess.mainOriginal();
    }
}