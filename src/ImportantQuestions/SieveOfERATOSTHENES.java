package ImportantQuestions;
import java.util.*;
import java.util.Arrays;
public class SieveOfERATOSTHENES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term :");
        int n = sc.nextInt();
        int[] storage = new int[n+1];
        for(int i=2;i<=storage.length-1;i++){
            storage[i]=1;
        }
        for(int i=2;i<=storage.length-1;i++){
            if(storage[i]==1){
                for(int y = i*i ;y<=storage.length-1;y+=i){
                    storage[y] = 0;
                }
            }
        }
        for(int i=2 ; i <= storage.length-1;i++){
            if(storage[i]==1){
                System.out.println(i);
            }
        }
    }

}
