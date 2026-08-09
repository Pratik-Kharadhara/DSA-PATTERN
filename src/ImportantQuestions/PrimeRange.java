package ImportantQuestions;
import java.util.*;
public class PrimeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        System.out.println("Stating point:");
        int start = sc.nextInt();
        System.out.println("Ending point:");
        int end = sc.nextInt();

        int[] range = new int[end+1];
        for(int i=2;i<=range.length-1;i++){
            range[i]=1;
        }
        for(int i=2;i <= range.length-1;i++){
            if(range[i]==1){
                for(int j=i*i;j<=range.length-1;j+=i){
                    range[j]=0;
                }
            }else
                continue;
        }
        for(int i=start;i<=end;i++){
            if(range[i]==1){
                System.out.println(i+"\t");
            }
        }

    }
}
