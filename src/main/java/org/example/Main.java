package org.example;

public class Main {
    public static void main(String[] args) {
        String password = "abcdAsf?sde5f";
        passwordLengthIsMin8(password);
        passwordContainsDigits(password);
        passwordContainsUpperAndLowercase(password);
        passwordIsStrong(password);
        passwordContainsSpecialCharacters(password);

    }

    public static boolean passwordLengthIsMin8(String password) {
        if (password.length() >= 8) {
            System.out.println("Length √");
            return true;
        } else {
            System.out.println("Password too short");
            return false;
        }
    }


    public static boolean passwordContainsDigits(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println("Digits √");
                return true;
            }
        }
        System.out.println("Password should contain at least one digit");
        return false;
    }

    public static boolean passwordContainsUpperAndLowercase(String password) {
        boolean containsUppercase = false;
        boolean containsLowercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            } else if (Character.isLowerCase(c))
                containsLowercase = true;
        }
        if (containsLowercase && containsUppercase) {
            System.out.println("Uppercase and lowercase √");
            return true;
        }
        System.out.println("Please use uppercase and lowercase");
        return false;
    }


    public static boolean passwordIsStrong(String password) {
        String[] weakPasswords = {"Password", "abcdefgh"};
        for (String checkweak : weakPasswords) {
            if (checkweak.equals(password)) {
                System.out.println("Your password is too weak");
                return false;
            }
        }
        System.out.println("Strong password √");
        return true;
    }

    public static boolean passwordContainsSpecialCharacters(String password) {
        String specialCharacters = "!@#$%^&*()-_+=|\\{}[]:;\"'<>,.?/";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                System.out.println("Special character √");
                return true;
            }
        }
        System.out.println("Password should contain a special character");
        return false;
    }
}


