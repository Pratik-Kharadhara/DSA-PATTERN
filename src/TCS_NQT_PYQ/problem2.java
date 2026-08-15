package TCS_NQT_PYQ;
import java.util.*;
public class problem2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
    int size = sc.nextInt();
    int[] array = new int[size];
    for(int i=0;i<=size-1;i++){
        System.out.println("enter the "+i+"th element: ");
        int element = sc.nextInt();
        array[i]=element;
    }
//        System.out.println( Arrays.toString(array));
    int lock = array[0];
    int count=0;
    int[] result = new int[size];
    for(int i=0; i<= array.length-1;i++){
        if(array[i]>lock){
            count++;
            result[i]=array[i];
        }
    }
        System.out.println(count+Arrays.toString(result));
    }
}
