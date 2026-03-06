package Sliding_Window;
//Max Sum Subarray of size K
//sliding window
//Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
//
//Note: A subarray is a contiguous part of any given array.
public class problem1 {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0;
        int high=k-1;
        int sum = 0;
        for(int i = low;i<=high;i++){
            sum=sum+arr[i]; //intial sum calcullating
        }
        int crtSum =0 ;
        while(high<arr.length){//base condition to run the loop
            crtSum = Math.max(crtSum,sum); //keep track of the max sum
            low++;// 0 -> 1
            high++;//1 -> 2

            if(high == arr.length)//cross the array bound
            {
                break ;
            }
            else {
                sum = sum - arr[low-1]+arr[high];
            }

        }

        return crtSum;

    }
}
