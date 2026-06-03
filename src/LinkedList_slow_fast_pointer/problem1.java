//141. Linked List Cycle
/* Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node that
tail's next pointer is connected to. Note that pos is not passed as a parameter.
*/

package LinkedList_slow_fast_pointer;

public class problem1 {

//      Definition for singly-linked list.
      class ListNode {
         int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            //slow and fast both are starting from head
            ListNode fast = head ;
            while(fast != null && fast.next != null){
                slow = slow.next; //moving slow pointer to 1 node
                fast = fast.next.next; //moving fast pointer to 2 nodes
                if(slow == fast){
                    return true;
                }
            }
            //if we reach here that mean fast is null that means linklist doesn't have loop
            return false;
        }

}
