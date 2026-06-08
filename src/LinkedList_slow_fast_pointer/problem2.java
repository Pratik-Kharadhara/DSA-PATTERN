//142. Linked List Cycle II
// Given the head of a linked list, return the node where the cycle begins.
// If there is no cycle, return null.


package LinkedList_slow_fast_pointer;

public class problem2 {

     // Definition for singly-linked list.
     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
            next = null;
         }
      }


        public ListNode detectCycle(ListNode head) {
            ListNode slow = head ;
            ListNode fast = head ;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next ;
                if(slow == fast){
                    //now we have to put slow to the head and increas both the fast and slow to one node at time at the meeting point from here will bring us to the starting of the cycle
                    slow = head ;
                    while(slow != fast){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    //we reached here means slow == fast
                    return slow;
                }
            }
            return null;
        }

}
