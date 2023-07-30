package AddTwoNums;

import java.math.BigInteger;

public class AddTwoNumsMain {

    public static void main(String[] args) {

        AddTwoNumsHelper helper = new AddTwoNumsHelper();
//        ListNode l1 = generateFromNumber(342);
//        ListNode l2 = generateFromNumber(465);

        ListNode l1 = generateFromNumber(new BigInteger("9"));
        ListNode l2 = generateFromNumber(new BigInteger("9999999991"));

        ListNode result = helper.addTwoNumbers(l1, l2);

        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }

    private static ListNode generateFromNumber(BigInteger number) {

        ListNode head = null;
        ListNode tail = null;

        long numberLong = number.longValue();

        while (numberLong > 0) {

            long digit = numberLong % 10;

            if (head == null) {

                head = new ListNode((int) digit);
                tail = head;
            } else {

                tail.next = new ListNode((int) digit);
                tail = tail.next;
            }

            numberLong /= 10;
        }

        return head;
    }
}
