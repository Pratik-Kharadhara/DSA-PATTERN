package TCS_NQT_PYQ;
import java.util.*;
public class problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ballons: ");
        int num = sc.nextInt();
        char[] array = new char[num];
        for(int i=0;i<=num-1;i++){
            //important note that how to take a input for a char
            char input = sc.next().charAt(0);
            array[i]=input;
        }

        int[] storage =new int[256];

        for(int i=0;i<=num-1;i++){
          storage[array[i]]++;
        }
        int oddCount = 0;
        for(int i=0;i<=255;i++){
        if(storage[i]%2 ==0){
            continue;
        }
        else
            oddCount++;
        }
        System.out.println("The number of Odd color is: "+oddCount);
    }
}
