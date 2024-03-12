package org.example;

public class Main {
    public static void main(String[] args) {
        String password = "abcdef";
        passwordLengthIsMin8(password);
        passwordContainsDigits(password);
        passwordContainsUpperAndLowercase(password);
    }

    public static boolean passwordLengthIsMin8(String password) {
        if (password.length() >= 8){
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
    boolean hasUppercase = true;
    boolean hasLowercase = true;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
            else {
                Character.isLowerCase(c);
            }
            {
                return true;
            }
        }
            return false;
        }
    }

