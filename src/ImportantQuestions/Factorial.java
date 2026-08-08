package ImportantQuestions;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextInt();
        long result = Factorial(n);
        System.out.println("For "+n+" the factorial is: "+result);
    }
    public static long Factorial(long n){
        if(n==0){
            return 1;
        }
        return n * Factorial(n-1);
    }
}
