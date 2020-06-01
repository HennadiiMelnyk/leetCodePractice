package ua.melnyk.leetCodePractice.addTwoNumbers;

import java.math.BigInteger;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    /**
     * /**
     * * Definition for singly-linked list.
     * * public class ListNode {
     * *     int val;
     * *     ListNode next;
     * *     ListNode() {}
     * *     ListNode(int val) { this.val = val; }
     * *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * * }
     */

    /**
     * Singly-linked list
     */
    private static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers.addTwoNumbers(l1, l2));
    }

    private ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        StringBuilder firstRes = new StringBuilder();
        BigInteger firstRes1 = getNumberFromListNode(listNode1, firstRes);
        StringBuilder secondRes = new StringBuilder();
        BigInteger secondRes2 = getNumberFromListNode(listNode2, secondRes);
        BigInteger result = firstRes1.add(secondRes2);
        //result.flipBit()
        //ListNode finalResult = new ListNode(reverseBigInteger(result).intValue());
        ListNode resultNode = getListNodeFromNumber(result);
        return resultNode;
    }

/*    public static BigInteger reverseBigInteger(BigInteger n) {
        String s = n.toString();
        StringBuilder sb = new StringBuilder(s);
        return new BigInteger(sb.reverse().toString());
    }*/

    private BigInteger getNumberFromListNode(ListNode listNode, StringBuilder result) {
        if (listNode.next != null) {
            getNumberFromListNode(listNode.next, result);
        }
        result.append(listNode.val);
        //BigInteger bigInteger = new BigInteger(result.toString());
        return new BigInteger(result.toString());
    }

    /**
     *  result number converting to result ListNode
     * @param number
     * @return ListNode
     */
    private ListNode getListNodeFromNumber(BigInteger number) {
        ListNode result = new ListNode();
        ListNode last = result;
        int counter = 0;
        String numberAsString = String.valueOf(number);
        char[] digits = numberAsString.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            last.val = Character.getNumericValue(digits[i]);
            if (counter != digits.length - 1) {
                last.next = new ListNode();
                last = last.next;
            }
            counter++;
        }
        return result;
    }
}
