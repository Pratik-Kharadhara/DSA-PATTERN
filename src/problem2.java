//26. Remove Duplicates from Sorted Array
/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
*/
//this is also under two pointer method where we are using two poitner one i another one is j
//where j is 1 box ahead of i so its checks with i weather its same or not if not it replaces the jth element
//with i+1th element

public class problem2 {
        public int removeDuplicates(int[] nums) {
            int i,j;
            i=0;
            j=1;
            int uniqueCount=1;
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    j++;

                }
                else {
                    nums[i+1]=nums[j];
                    i++;
                    uniqueCount++;
                    j++;

                }
            }
            return uniqueCount;
        }
    }


