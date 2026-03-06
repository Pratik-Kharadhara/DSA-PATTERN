//16. 3Sum Closest
//Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.


import java.util.Arrays;
public class problem5 {
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums); //first sort the array
            int maxDiff = Integer.MAX_VALUE; //setting maxDiff to the infinity
            int result=nums[0]+nums[1]+nums[2];//result is set to first 3 digit sum
            for(int i=0;i<=nums.length-3;i++){ //its running till i is nums.length-3
                int left=i+1;//intializing left and right
                int right =nums.length-1;
                while(left<right){
                    int sum = nums[i] + nums[left] +nums[right]; //sum is intialized with all the 3 pointer position
                    int diff = Math.abs(sum-target); //diff is calculated
                    if (diff <  maxDiff ){ //checking if current diff is smaller than the previous diff
                        maxDiff = diff;  // it will then assign maxDiff to current diff
                        result = sum; //and result will store the sum
                    }
                    if(sum==target){
                        return sum; //if it matches the target it will send it
                    }
                    else if(sum<target){
                        left++;
                    }
                    else {
                        right --;
                    }

                }
            }

            return result;

        }


}
