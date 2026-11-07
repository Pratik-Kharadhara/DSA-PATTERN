class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int result = Math.abs(nums[0]);

        if(nums.length==1){
            return Math.abs(nums[0]);
        }
        for(int i=1;i<=nums.length-1;i++){
            int tempMax = maxSum;
            int tempMin = minSum ;
            maxSum = Math.max(nums[i],Math.max(tempMax+nums[i],tempMin+nums[i]));
            minSum = Math.min(nums[i],Math.min(tempMin+nums[i],tempMax+nums[i]));
            
            result = Math.max(result,Math.max(maxSum,Math.abs(minSum)));
        }
        return result;
    }
}