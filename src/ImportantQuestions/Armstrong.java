package ImportantQuestions;
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while(num>0){
            int digit = num % 10 ;// for 153-> 3 ,15-> 5
            sum = sum + (int)Math.pow(digit,length);//3^3 + 5^3 + 1^3
            num = num /10 ;//153/10->15 , 15/10-> 1
        }
        if(sum == original){
            System.out.println(original +" its a armstrong number");
        }
        else
            System.out.println("Its not a armstrong number");
    }
}
