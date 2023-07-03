package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
        public String checkFirstName() {
            String firstName = sc.nextLine();
            if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", firstName)) {
                System.out.println("First Name is Valid---!!");
            } else {
                System.out.println("First Name is Invalid--!!");
                checkFirstName();
            }
            return firstName;
        }

        public String checkLastName() {
            System.out.println("-----------------");
            String lastName = sc.nextLine();
            if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", lastName)) {
                System.out.println("LastName is Valid---!!");
            } else {
                System.out.println("LastName is Invalid--!!");
                checkLastName();
            }
            return lastName;
        }

        public String checkEmail() {
            System.out.println("-----------------");
            String email = sc.nextLine();
            if (Pattern.matches("[a-zA-Z0-9.]{1,}[@]{1}[a-zA-Z]{1,}[.][c]{1}[o]{1}[m]{1}", email)) {
                System.out.println("Email is Valid---!!");
            } else {
                System.out.println("Email is Invalid--!!");
                checkEmail();
            }
            return email;
        }

        public String checkPhoneNumber() {
            System.out.println("-----------------");
            String phoneNumber = sc.nextLine();
            if (Pattern.matches("[9][1][ ]{1}[0-9]{10}", phoneNumber)) {
                System.out.println("PhoneNumber is Valid---!!");
            } else {
                System.out.println("PhoneNumber is Invalid--!!");
                checkPhoneNumber();
            }
            return phoneNumber;
        }

        public String checkPasswordRule1() {
            System.out.println("-----------------");
            String password = sc.nextLine();
            if (Pattern.matches("^[a-zA-z]{8,}", password)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule1();
            }

            return password;
        }

        public String checkPasswordRule2() {
            System.out.println("-----------------");
            String password1 = sc.nextLine();
            if (Pattern.matches("^[A-z]+[A-Za-z]{8,}", password1)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule2();
            }
            return password1;
        }


        public String checkPasswordRule3() {
            System.out.println("-----------------");
            String password2 = sc.nextLine();
            if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{8,}", password2)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule3();
            }
            return password2;

        }

        public String checkPasswordRule4() {
            System.out.println("-----------------");
            String password4 = sc.nextLine();
            if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{7,}[!@#$%^&*()=]+", password4)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule4();
            }
            return password4;
        }

        public String checkEmail2() {
            System.out.println("-----------------");
            System.out.println("Enter Email Id: ");
            String email2 = sc.nextLine();
            if (Pattern.matches("^[a-zA-Z]{3,}[+-.]?[A-za-z0-9]*[@]{1}[a-z]+[.]?[a-z]*[.]?[a-z]", email2)) {
                System.out.println("Email is Valid---!!");
                checkEmail2();
            } else {
                System.out.println("Email is Invalid--!!");
                checkEmail2();
            }
            return email2;

        }



}


