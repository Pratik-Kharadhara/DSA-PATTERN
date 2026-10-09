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
    public ListNode reverseKGroup(ListNode head, int k) {
        //so basically we need to break the nodes into group of k
        //and take the left & right of the group and reverse them and move to the nexr group
        //for that we need left , right , nextLeft and previousLeft
        //1->2->3->4->5
        //first 1 is the left and 2 is the right
        //after reverse it becomes 1<-2 3->4
        //so next left becomes 3
        if (head == null || k == 1) {
            return head;
        }
        
        ListNode left = head;
        ListNode right = null;
        ListNode prevLeft = null;
        ListNode res = null;
        //calculate how many nodes will be there what will be the left and right
        
        while(true){
            right=left;//left and right at the same place
            for(int i=0;i<k-1;i++){
            //if k=3 then right needs to move 2 time
            //1->2->3 then left is fixed at 1 and we move right to 3(which is done after moving 2 times) thats why k-1
            if(right==null){   
                //at the last case when the last element we will reacch it will end
                break;
            }
            right = right.next;
        }

            if(right != null){//if right is present 
            //reverse function will reverse the left and how many times
           ListNode nextLeft = right.next; //next pair left 1->2->3 then 2=right & 3 is the left
            reverse(left,k);
            left.next = nextLeft;
            if(prevLeft != null){
                prevLeft.next = right;
            }
                prevLeft=left;
            if(res == null){
                res = right;
            }
            left = nextLeft;

            }

            else{
                //we have reached the last node 
                //so there is no right only left
                if(prevLeft != null){
                    prevLeft.next = left;
                }
                if(res == null){
                    res = left;
                }
                break;
            }
        }

        return res;
    }
    public void reverse(ListNode head,int times){
            ListNode prev = null;
            ListNode curr =head ;
            while(times != 0 ){
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
                times--;
            }
            return;
        }
}