package AddTwoNums;

import java.math.BigInteger;

public class AddTwoNumsHelper {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger firstNumber = generateNumberFromListNode(l1);
        BigInteger secondNumber = generateNumberFromListNode(l2);
        BigInteger sumOfNumbers;

        if (firstNumber == null && secondNumber == null) {
            return null;
        } else if (firstNumber == null) {
            return convertBigIntegerToListNode(secondNumber);
        } else if (secondNumber == null) {
            return convertBigIntegerToListNode(firstNumber);
        }

        sumOfNumbers = firstNumber.add(secondNumber);

        return convertBigIntegerToListNode(sumOfNumbers);
    }

    private ListNode convertBigIntegerToListNode(BigInteger number) {

        if (number.compareTo(BigInteger.ZERO) == 0) {

            return new ListNode(number.intValue());
        }

        String sumOfNumbersString = String.valueOf(number);

        ListNode head = null;
        ListNode tail = null;

        for (int i = sumOfNumbersString.length()-1; i >= 0; i--) {

            char digitChar = sumOfNumbersString.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            ListNode listNode = new ListNode(digit);

            if (head == null) {

                head = listNode;
            } else {

                tail.next = listNode;
            }
            tail = listNode;
        }

        return head;
    }
    private BigInteger generateNumberFromListNode(ListNode listNode) {

        if (listNode == null) {

            return null;
        }

        if (listNode.next == null) {

            return BigInteger.valueOf(listNode.val);
        }

        BigInteger result = BigInteger.valueOf(listNode.val);
        ListNode pointer = listNode.next;

        BigInteger i = BigInteger.TEN;

        do {
            result = BigInteger.valueOf( pointer.val).multiply(i).add(result);
            pointer = pointer.next;
            i = i.multiply(BigInteger.TEN);
        } while (pointer != null);

        return result;
    }
}
