package org.example;

public class Main {
    public static void main(String[] args) {
        String password = "abcdef";
        passwordLengthIsMin8(password);
        passwordContainsDigits(password);
        passwordContainsUpperAndLowercase(password);
        passwordIsStrong(password);

    }

    public static boolean passwordLengthIsMin8(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            System.out.println("Password too short");
            return false;
        }
    }


    public static boolean passwordContainsDigits(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordContainsUpperAndLowercase(String password) {

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
            else if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean passwordIsStrong(String password) {
        String[] weakPasswords = {"Password", "abcdefgh", "HalloWelt", "DominicIstDerCoolste123"};
        for (String element : weakPasswords) {
            if (element.equals(password)) {
                return false;
            }
        }
        return true;
    }
}


