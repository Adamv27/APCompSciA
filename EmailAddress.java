/*
Adam Vinch
9/23/2020
A program to give a student an email and password from the information entered
 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class EmailAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first_name = input.nextLine();

        System.out.println("Enter your middle name");
        String middle_name = input.nextLine();

        System.out.println("Enter your last name");
        String last_name = input.nextLine();

        System.out.println("Enter your birthday in the format mm-dd-yyyy");
        String birthday = input.nextLine();
        while (birthday.length() != 10) {
            System.out.println("Please enter your birthday in the format mm-dd-yyyy");
            birthday = input.nextLine();
        }

        String password = get_password(birthday);

        String student_email = get_email(first_name, middle_name, last_name);

        System.out.println("Email: " + student_email);
        System.out.println("Temp Password: " + password);
        System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
    }

    static String get_password(String birthday) {
        String password = "";
        for (int i = 0; i < birthday.length(); i++) {
            if (birthday.charAt(i) != '-') {
                password += birthday.charAt(i);
            }
        }
        return password;
    }

    static String get_email(String first_name, String middle_name, String last_name) {
        String email = "";
        String ending = "@sharkmail.com";

        email += last_name.toLowerCase();
        email += first_name.substring(0, 1).toUpperCase();
        email += middle_name.substring(0, 1).toUpperCase();
        email += ending;

        return email;
    }
}


