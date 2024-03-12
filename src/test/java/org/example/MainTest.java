package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}
