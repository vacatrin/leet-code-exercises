package IsPalindrome;

public class PalindromeHelper {

    boolean isPalindrome(int number) {

        if (number < 0) {

            return false;
        }

        int originalNumer = number;
        int reversedNumber = 0;

        while (number != 0) {

            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        return originalNumer == reversedNumber;
    }
}
