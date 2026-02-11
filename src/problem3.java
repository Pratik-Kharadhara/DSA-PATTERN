//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//the main challenge was  to do it in 0(n) time complexity
//where it takes  nlogn if we do normal sorting


//so here we are dyanmically sqr the element then checking and putting to the array

public class problem3 {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int[] result= new int[nums.length];
        int j=nums.length-1;
        int k=nums.length-1;

        while(i<=j){//it checks if the array is bounded between these limits
            if(nums[i]*nums[i]<nums[j]*nums[j]){//here we are dynamically sqr and comapring and string to the result array
                result[k]=nums[j]*nums[j];
                j--;
                k--;
            }
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                result[k]=nums[i]*nums[i];
                i++;
                k--;
            }
            if(nums[i]*nums[i]==nums[j]*nums[j]){
                result[k]=nums[i]*nums[i];
                i++;
                k--;
            }

        }
        return result;
    }
}
