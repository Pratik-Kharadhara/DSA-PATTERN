class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //here the trick is to calculate sum of maxNonCircular array 
        //2 1 3 -5 -8 5  = 6 (2+1+3)
        int maxNonCircularSum = maxSum(nums); // 6 
        //now calculate total sum 
        int sum =0;
        for(int i=0;i<=nums.length-1;i++){
            sum+=nums[i];
        }
        //now calculate min sum
        int minCircularSum = minSum(nums);
        //if total sum is -ve then return the MaxnonCircularSum
        if(maxNonCircularSum < 0){
            return maxNonCircularSum;
        }//else max between maxNonCircular and sum-minCircularsum 
        return Math.max(maxNonCircularSum,(sum - minCircularSum));
    }
    int maxSum(int[] arr){
        int crtSum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            crtSum = Math.max(arr[i]+crtSum , arr[i]);
            maxSum = Math.max(maxSum , crtSum);
        }
        return maxSum;
    }
    int minSum(int[] arr){
        int crtSum = arr[0];
        int minSum = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            crtSum = Math.min(arr[i]+crtSum , arr[i]);
            minSum = Math.min(minSum , crtSum);
        }
        return minSum;
    }
}