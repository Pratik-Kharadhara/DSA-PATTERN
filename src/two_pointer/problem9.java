//283. Move Zeroes
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/
//in this question instead of pushing all the zeros to right push all the non zero to the left
//then automatically the 0 will be sent to the right

package two_pointer;
public class problem9 {
        public void moveZeroes(int[] nums) {
            int i= 0;
            int j =0;//we are intializing it to 0 so that we can test all the edge cases too
            while(j <= nums.length-1){
                if(nums[j]!=0){ // when its a non zero we will do the swap and increase the indices
                    //swap
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j++;
                }
                else {//if its a zero then just increase the j and keep the i to replace the next non zero
                    j++;
                }
            }

            return;
        }

}
