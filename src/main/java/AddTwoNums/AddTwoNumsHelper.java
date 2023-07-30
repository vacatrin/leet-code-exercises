package AddTwoNums;

public class AddTwoNumsHelper {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long firstNumber = generateNumberFromListNode(l1);
        long secondNumber = generateNumberFromListNode(l2);

        long sumOfNumbers = firstNumber+secondNumber;

        return convertLongIntoListNode(sumOfNumbers);

    }

    private ListNode convertLongIntoListNode(long sumOfNumbers) {

        if (sumOfNumbers == 0) {

            return new ListNode((int) sumOfNumbers);
        }

        String sumOfNumbersString = String.valueOf(sumOfNumbers);

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < sumOfNumbersString.length(); i++) {

            char digitChar = sumOfNumbersString.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            ListNode listNode = new ListNode(digit);

            if (head == null) {
                head = listNode;
                tail = listNode;
            } else {

                tail.next = listNode;
                tail = listNode;
            }

        }

        return head;
    }

    private long generateNumberFromListNode(ListNode l1) {

        if (l1.next == null) {

            return l1.val;
        }

        long result = l1.val;
        ListNode pointer = l1.next;

        long i = 10;

        do {
            result = pointer.val * i + result;
            pointer = pointer.next;
            i = i*10;
        } while (pointer != null);

        return result;
    }
}
