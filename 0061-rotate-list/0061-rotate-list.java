/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // Empty list or only one node
        if (head == null || head.next == null) {
            return head;
        }

        // 1. Find length and the last node
        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 2. Rotations greater than length are unnecessary
        k = k % length;

        if (k == 0) {
            return head;
        }

        // 3. Find the new tail
        // We need to move length - k nodes from the head
        ListNode newTail = head;

        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }

        // 4. New head is after new tail
        ListNode newHead = newTail.next;

        // 5. Break the list and connect old tail to old head
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}