package ImportantQuestions;
import java.util.*;
public class PrimeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(PrimeCheck(num)== true){
            System.out.println("its a Prime");
        }
        else
            System.out.println("Its not a prime");

    }
    public static boolean PrimeCheck(int num){
        if(num <= 1) {
            return false;
        }
            for(int i=2;i*i<=num;i++){
                if(num % i == 0){
                    return false;
                }


            }

        return true;
    }
}
