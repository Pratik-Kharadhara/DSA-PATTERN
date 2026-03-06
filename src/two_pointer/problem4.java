//15. 3Sum
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.

import java.util.Arrays;
public class problem4 {

        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums); //sorting the array
            int i=0;
            List<List<Integer>> result = new ArrayList<>(); //making a new array list
            for(i=0;i<=nums.length-3;i++){ //initial loop for iteriting "i" all over the array except last 3 points for right and left pointer
                if(i>0 && nums[i]==nums[i-1]){
                    continue; //if the current ith number and previous ith number is same we skip that to avoid duplicates
                }
                int left=i+1; //intiliaze left
                int right=nums.length-1;//intiliaze right
                while(left<right){ //we gonna run untill left < right
                    if(nums[left]+nums[right]==-(nums[i])){ //if sum is same with target
                        result.add(Arrays.asList(nums[i],nums[left],nums[right])); //added in the list
                        left ++;
                        right--;
                        while(left<nums.length  && nums[left]==nums[left-1] ){ //its to avoid duplicates in the left pointer
                            left++;//it checks if the left pointer is running till length and its previous value is same then increse
                        }
                        //same with right too
                        while(right>=0 && nums[right]==nums[right+1]){
                            right --;
                        }
                    }
                    else if((nums[left]+nums[right]) < -nums[i] ){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }

            return result;
        }
    }

