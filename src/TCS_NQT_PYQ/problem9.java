package TCS_NQT_PYQ;
import java.util.*;
public class problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        int result = 0;
        System.out.println("Enter the 3 digits: ");
        for(int i=0;i<=nums.length-1;i++){
            nums[i] = sc.nextInt();
        }
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            System.out.println("Already Matching Number");
        }
        else if(countSteps(nums)==-1){
            System.out.println("Not Possible");
        }
        else {
            result = countSteps(nums);
            System.out.println("To Match the Number we need to do :"+ result);
        }


    }
    public static int countSteps(int[] nums){

        Arrays.sort(nums);
        int countStepss=0;
        while(true){
            nums[0]=nums[0]+1;
            nums[1]=nums[1]+1;
            nums[2]=nums[2]-1;
                countStepss++;
            if(nums[0]==nums[1] && nums[1]==nums[2]){
            return countStepss;
            }
            Arrays.sort(nums);
            if(nums[1]==nums[2] && nums[0]+1==nums[1] ||
            nums[0]==nums[1] && nums[2]+1==nums[1] ||
                    nums[0]==nums[2] && nums[1]+1==0){
                return -1;
            }
        }
    }
}
