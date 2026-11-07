class Solution {
    public int maxProduct(int[] nums) {
        //kaden's algo 
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int result = nums[0];
        for(int i=1 ;i <=nums.length-1;i++){
            int tempMax = maxEnding;
            int tempMin = minEnding;
            maxEnding = Math.max(Math.max(tempMax*nums[i],tempMin*nums[i]),nums[i]);
            minEnding = Math.min(Math.min(tempMax*nums[i],tempMin*nums[i]),nums[i]);
            //bestEnding = Math.max(result1,result2);
        result = Math.max(result, Math.max(minEnding,maxEnding));           }
        return result;
    }
}