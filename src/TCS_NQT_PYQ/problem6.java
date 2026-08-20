package TCS_NQT_PYQ;
import java.util.*;
public class problem6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of String:");
        int n = sc.nextInt();
    String[] s = new String[n];
    for(int i=0;i<n;i++){
        s[i] = sc.next();
    }
        System.out.println("the common prefix is :" + LongestCommon(s));
    }
    public static String LongestCommon(String[] s){
        StringBuilder result = new StringBuilder();
        Arrays.sort(s);
        char[] first = s[0].toCharArray();
        char[] last= s[s.length-1].toCharArray();
        //now see how many things are in common
        for(int i=0;i<=first.length-1;i++){
            if(first[i]==last[i]){
                result.append(first[i]);
            }
            else
                continue;
        }
        return result.toString();
    }
}
