/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

*/

public class problem7 {
    //this is a swapping function
    private static void swap(int[] nums,int a,int b){
        int temp;
        temp=nums[b];
        nums[b]=nums[a];
        nums[a]=temp;

    }
    public void sortColors(int[] nums) {
        //here we will use dutch national flag algo
        //we have to assume the array like
        // start->0000(low-1)[our unsorted array](high+1)22222->end
        //so from start to low-1 we have 0 and from high+1 to end is 2
        //between that we have all the unsorted array
        //now our goal is to bring all the 0s to low side of the array and all the 2s to the high side of the array
        /* 0s range->( start,low-1)
        1s range->( low,mid-1)
        0s range->( high+1,end)
        problematic/unsorted area->(mid,high)
        */
        //as we traverse the mid through the array 0s will go to towards the low
        //2 will go to the high and thus middle we have all the 1s
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){ //if arr[mid]=0 then we will swap that mid element to low index increse the low counter and mid counter
                swap(nums,mid,low);//swapping the mid to low
                low++;//increasing the low limit
                mid++;//incresing the mid counter
            }
            else if(nums[mid]==1){//this is the optimal case so we leave it and move to next
                mid++;
            }
            else if(nums[mid]==2){//when we get 2 , the problem is when we swap we can get //0,1,2
                swap(nums,mid,high);//after swapping we just adjust the high limit and leave the mid to check if it 0 or 1 or 2
                high--;//then it will do all the required steps above mentioned
            }

        }
        return;
    }
}
