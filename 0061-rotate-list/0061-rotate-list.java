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
        //now count the length of the list
        int count = 1 ;
        ListNode end = head;
        //setting the end to the last node
        while(end.next !=null){
            end = end.next;
            count++;
        }//now end must be at the end and count gives us the length
        
        //now set the end to first to make a loop
        //4->5->1->2->3...
        
        
        //iterations required
        k=k%count; //gives us how many times we need to iterate
        if(k==0){
            return head;
        }

        //now find the new end
        ListNode newEnd = head;
        for(int i=1;i<=count-k-1;i++){
            newEnd = newEnd.next;
        }//newEnd = 3
        ListNode newHead = newEnd.next;//4->head
        newEnd.next =null; //3->null
        end.next = head;
        
        return newHead;
    }
}