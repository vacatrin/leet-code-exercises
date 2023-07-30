package IsPalindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeHelperShould {

    PalindromeHelper helper;

    @BeforeEach
    void setUp() {

        helper = new PalindromeHelper();
    }

    @Test
     void returnTrueIfNumberIsPalindrome() {

        int number = 112343211;

        assertTrue(helper.isPalindrome(number));
    }

    @Test
    void returnFalseIfNumberIsNotPalindrome() {

        int number = 123;
        assertFalse(helper.isPalindrome(number));
    }
}