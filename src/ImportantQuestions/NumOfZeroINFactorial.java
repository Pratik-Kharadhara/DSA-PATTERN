package ImportantQuestions;
import java.util.*;
public class NumOfZeroINFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for factorial");
        int num =sc.nextInt();
        int count =0;
        //using Legendre's formula
        //For n!, the number of factors of 5 is:
        //
        //⌊n/5⌋+⌊n/5^2⌋+⌊n/5^3⌋+⋯
        while(num>=5){
            num = num/5;
            count += num;

        }
        System.out.println("the number of trailing zero is: "+count);
    }
}
