package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {


    @Test
    void passwordLengthIsMin8_shouldReturnTrue_whenLengthBigger8() {
        //GIVEN
        String password = "abcdefghi";
        //WHEN
        boolean actual = Main.passwordLengthIsMin8(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void passwordLengthIsMin8_shouldReturnFalse_whenLengthSmaller78() {
        //GIVEN
        String password = "abc";
        //WHEN
        boolean actual = Main.passwordLengthIsMin8(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void passwordContainsDigit_shouldReturnTrue_whenContains5() {
        //GIVEN
        String password = "abcdef5";
        //WHEN
        boolean actual = Main.passwordContainsDigits(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void passwordContainsDigit_shouldReturnFalse_whenNotContains5() {
        //GIVEN
        String password = "abcdef";
        //WHEN
        boolean actual = Main.passwordContainsDigits(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void passwordContainsUpperAndLowercase_shouldReturnTrue_whenContainsA() {
        //GIVEN
        String password = "Abc";
        //WHEN
        boolean actual = Main.passwordContainsUpperAndLowercase(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void passwordContainsUpperAndLowercase_shouldReturnFalse_whenNotContainsA() {
        //GIVEN
        String password = "abd";
        //WHEN
        boolean actual = Main.passwordContainsUpperAndLowercase(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void passwordContainsUpperAndLowercase_shouldReturnTrue_whenContainsAanda() {
        //GIVEN
        String password = "Aabc";
        //WHEN
        boolean actual = Main.passwordContainsUpperAndLowercase(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void passwordContainsUpperAndLowercase_shouldReturnFalse_whenNotContainsa() {
        //GIVEN
        String password = "ABC";
        //WHEN
        boolean actual = Main.passwordContainsUpperAndLowercase(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void passwordIsStrong_ShouldReturnTrue_whenPasswordContains1() {
        //GIVEN
        String password = "ABcde1";
        //WHEN
        boolean actual = Main.passwordIsStrong(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    void passwordIsStrong_ShouldReturnFalse_whenPasswordNotContains1() {
        //GIVEN
        String password = "Password";
        //WHEN
        boolean actual = Main.passwordIsStrong(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    void passwordIsStrong_ShouldReturnTrue_whenNotContainsAa345678() {
        //GIVEN
        String password = "ABcde";
        //WHEN
        boolean actual = Main.passwordIsStrong(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    void passwordIsStrong_ShouldReturnFalse_whenContainsAa345678() {
        //GIVEN
        String password = "Aa345678";
        //WHEN
        boolean actual = Main.passwordIsStrong(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    void passwordContainsSpecialCharacters_ShouldReturnTrue_whenContainsQuestionmark() {
        //GIVEN
        String password = "Aa34567?";
        //WHEN
        boolean actual = Main.passwordContainsSpecialCharacters(password);
        //THEN
        Assertions.assertTrue(actual);
    }
}