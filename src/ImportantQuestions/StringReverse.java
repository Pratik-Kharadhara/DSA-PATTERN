

package ImportantQuestions;
import java.util.*;
public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String rev = "";
        for(int i = given.length()-1;i>=0; i--){
            rev = rev + given.charAt(i);
        }
        System.out.println(rev);
    }
}
