package ImportantQuestions;
import java.util.*;
public class Pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        int i = 0 ;
        int n=0;
        int j = given.length()-1;
        while(i<=j){
            if(given.charAt(i) != given.charAt(j)){
               n=-1;
            }

                i++;
                j--;

        }
        if(n==-1){
            System.out.println("Not Pallindrom");
        }
            else
            System.out.println("its a pallindrome");
    }
}
