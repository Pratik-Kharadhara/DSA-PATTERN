package TCS_NQT_PYQ;
import java.util.*;
public class problem4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Monkeys: ");
        int n = sc.nextInt();

        System.out.println("Each Monkey can eat Bananas: ");
        int k = sc.nextInt();

        System.out.println("Each Monkey can eat Penuts: ");
        int j = sc.nextInt();

        System.out.println("Traveler have total Banana:");
        int m = sc.nextInt();

        System.out.println("Traveler have total penuts: ");
        int p = sc.nextInt();

        int total = n-((m/k)+(p/j));

        System.out.println("Total Monekey Remained:"+total);

    }
}
