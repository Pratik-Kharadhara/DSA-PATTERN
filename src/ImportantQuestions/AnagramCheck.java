package ImportantQuestions;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first String \n");
        String s1 = sc.nextLine();
        System.out.println("enter the second String \n");
        String s2 = sc.nextLine();

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        int n =0;

        arr1 = CountCharector(s1,arr1);
        arr2 = CountCharector(s2,arr2);


//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<=255;i++){
            if(arr1[i]!=arr2[i]){
                n=-1;
            }
            else
                continue;
        }
        if(n==0){
            System.out.println("Its  a anagram");
        }
        else
            System.out.println("Its not a Anagram");

    }

    public static int[] CountCharector(String s ,int[] arr){
        for(int i = 0; i <s.length();i++){
            arr[s.charAt(i)-0]++;
        }
        return arr;
    }
}
