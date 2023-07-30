import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {

        main = new Main();
    }

    @Test
    void shouldReturnTrueIfNumberIsPalindrome() {

        int number = 123454321;

        assertTrue(main.isPalindrome(number));
    }

}