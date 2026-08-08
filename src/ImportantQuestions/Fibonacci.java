package ImportantQuestions;
import java.util.*;
import java.util.Arrays;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term upto : ");
        int length = sc.nextInt();
            int[] nums = new int[length];
            for(int i=0;i<length;i++){
                if(i==0){
                    nums[i] = 0;
                }
                else if(i==1){
                    nums[i]=1;
                }
                else
                    nums[i] = nums[i-1] + nums[i-2];
            }
        System.out.println("The Fibonnaci series is : \n");
        System.out.println( Arrays.toString(nums));
    }
}
