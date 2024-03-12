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
}
