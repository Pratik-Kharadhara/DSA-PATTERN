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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //we need a before which indicates the before node of  the starting of the reversal eg 1 cause 2 is the reversal starting
       ListNode dummy = new ListNode(0);
dummy.next = head;

ListNode before = dummy;
        ListNode starter =head;
        int iterations = right-left+1; // total number of reversal required
        if(iterations==1){
            return head;
        }
        
        for(int i=1;i<left;i++){
            before = starter ;
            starter = starter.next;
        } //now starter should be on the starting point
        // if(iterations==1){
        //     return head;
        // }
        ListNode prev = null;
        ListNode curr = starter;
        while(iterations!=0){
            //do the reversal
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            iterations--;
        } 
        //now arranging the List correctly 
        before.next = prev;
        starter.next = curr;

        return dummy.next;
        }
}