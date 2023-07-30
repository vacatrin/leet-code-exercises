package AddTwoNums;

import java.math.BigInteger;

public class AddTwoNumsMain {

    public static void main(String[] args) {

        AddTwoNumsHelper helper = new AddTwoNumsHelper();
//        ListNode l1 = generateFromNumber(new BigInteger("342"));
//        ListNode l2 = generateFromNumber(new BigInteger("465"));

        ListNode l1 = generateFromNumber(new BigInteger("465"));
        ListNode l2 = generateFromNumber(new BigInteger("1000000000000000000000000000001"));

        ListNode result = helper.addTwoNumbers(l1, l2);

        displayListNodeResultDigits(result);
    }

    private static void displayListNodeResultDigits(ListNode result) {
        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }

    private static ListNode generateFromNumber(BigInteger number) {

        ListNode head = null;
        ListNode tail = null;

        while (number.compareTo(BigInteger.valueOf(0)) == 1) {

            BigInteger digit = number.mod(BigInteger.valueOf(10));

            if (head == null) {

                head = new ListNode(digit.intValue());
                tail = head;
            } else {

                tail.next = new ListNode(digit.intValue());
                tail = tail.next;
            }

            number = number.divide(BigInteger.valueOf(10));
        }

        return head;
    }
}
