package AddTwoNums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumsHelperShould {

    AddTwoNumsHelper helper;

    @BeforeEach
    void setUp() {
        helper = new AddTwoNumsHelper();
    }

    @Test
    void returnAListNodeContainingDigitsOfTheResult() {

        //setup
        ListNode l1 = new ListNode(1, new ListNode(2, null));
        ListNode l2 = new ListNode(3, new ListNode(4, null)); // 21 + 41 = 64

        //execute
        ListNode result = helper.addTwoNumbers(l1, l2);

        //verify
        assertNotNull(result);
        assertEquals(4, result.val);
        assertEquals(6, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void returnSingleNodeWithZeroValueIfBothListNodesAreZero() {

        //setup
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0); // 21 + 41 = 64

        //execute
        ListNode result = helper.addTwoNumbers(l1, l2);

        //verify
        assertNotNull(result);
        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    void returnSameAsListNodeOneIfListNodeTwoIsNull() {

        //setup
        ListNode listNode1 = new ListNode(7);
        ListNode listNode2 = null;

        //execute
        ListNode result = helper.addTwoNumbers(listNode1, listNode2);

        //verify
        assertNotNull(result);
        assertEquals(7, result.val);
        assertNull(result.next);
    }

}