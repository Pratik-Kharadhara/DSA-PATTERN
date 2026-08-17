package TCS_NQT_PYQ;
import java.util.*;
public class problem5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Bag items: ");
        int size = sc.nextInt();
        int[] container = new int[size];

        System.out.println("Enter the Item with Risk : 0->low 1->medium 2->severe");
        for(int i=0;i<=container.length-1;i++){
            System.out.println("For item "+i);
            int risk=sc.nextInt();
            container[i]=risk;
        }
        Arrays.sort(container);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(container));

    }
}
