class Solution {
    public int maxSubArray(int[] nums) {
        //kaden's algo will be used 
        int bestEnding= nums[0];
        int result = nums[0];
        for(int i=1;i<=nums.length-1;i++){
            int res1 = bestEnding+nums[i];
            int res2 = nums[i];
            bestEnding = Math.max(res1,res2);
            result = Math.max(result,bestEnding);
        }
        return result;
    }
}