public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1231));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {

            return false;
        }

        int originalNumer = x;
        int reversedNumber = 0;

        while (x != 0) {

            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }

        return originalNumer == reversedNumber;
    }
}
