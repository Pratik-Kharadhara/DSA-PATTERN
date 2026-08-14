//287. Find the Duplicate Number
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

package LinkedList_slow_fast_pointer;

public class problem3 {
        public int findDuplicate(int[] nums) {
            int slow =0;
            int fast =0;
            //check and find where the two pointer meet in the loop
            while(true){
                slow = nums[slow];
                fast = nums[fast];
                fast=nums[fast];
                if(slow == fast){
                    slow = 0;
                    break;
                }
            }
            //after getting meeting point check what is the starting point of the loop there will be the duplicate

            while(slow != fast){
                slow= nums[slow];
                fast = nums[fast];
            }
            //reaching here means we found the starting point of the loop
            return slow;


        }


}
