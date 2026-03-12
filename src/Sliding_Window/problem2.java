//209. Minimum Size Subarray Sum
/*
Given an array of positive integers nums and a positive integer target,
 return the minimal length of a subarray whose sum is greater than or equal to target.
 If there is no such subarray, return 0 instead.
*/

package Sliding_Window;
class problem2 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int low =0 ;//low and high start fromm starting
        int high=0;
        int sum=0;
        while(high<nums.length){ //running the algo till high reaches to last element
            sum = sum +nums[high];
            while(sum>=target){ //satisfying our req.
                int now = high-low+1;//counting how many elemeent currently present to satisfy the problem
                result = Math.min(result,now);//checking which is smaller current no of elements or previous no of elements
                sum = sum - nums[low]; //firing / removing element to check what is the min. requirements
                low++;
            }
            high++;
        }
        if(result==Integer.MAX_VALUE){ //checking if the algo couldn't find any solution so the result will be same as we intiliazed so we return 0
            return 0;
        }
        else
            return result;

    }
}
