//1004. Max Consecutive Ones III
/*
 Given a binary array nums and an integer k, return the maximum number of
  consecutive 1's in the array if you can flip at most k 0's.

*/



package Sliding_Window;
public class problem7 {
    public int freq(int arr[]){
        return arr[0];
    }
    public int longestOnes(int[] nums, int k) {
        int numArray[] = new int[1];//as we are looking for zeros so we want only one space to track the zero
        //and look for it if it greater than or lower than k
        int low= 0;
        int res = Integer.MIN_VALUE;

        for(int high = 0;high<nums.length; high++){
            if(nums[high]==0){
                numArray[0]++; //we are increasing the freq for 0 in the array
            }
            int crtFreq = freq(numArray);//checking the freq of 0 \
            if(crtFreq>k){ //if the freq is greater than k
                //then we will decrease the low
                if(nums[low]==0){ //and if the lowth element is the 0
                    numArray[0]--; // then we will decrease the freq in the array
                }
                low++;//otherwise we will increase the low
            }
            //and if freq is smaller equal to k
            int len = high - low +1;
            res = Math.max(len,res);

        }
        return res;
    }
}
