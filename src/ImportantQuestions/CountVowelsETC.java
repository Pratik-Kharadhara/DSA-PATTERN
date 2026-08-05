package ImportantQuestions;
import java.util.*;
public class CountVowelsETC {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        int vowelsCount = 0;
        int consulants = 0;
        int coutnSpaces = 0;
        for (int i = 0; i <= s.length() - 1; i++) {

            if (haveVowels(s.charAt(i), vowels)) {
                vowelsCount++;
            }
            else if(s.charAt(i) == ' '){
                coutnSpaces++;
            }
            else
                consulants++;

        }

        System.out.println("vowels "+vowelsCount+" consulants "+consulants+" spcaes:"+coutnSpaces);


    }
    public static boolean haveVowels ( char c, char[] vowels){
        int n = 0;
        for (int i = 0; i <= vowels.length - 1; i++) {
            if (vowels[i] == c) {
                n = 1;
            }
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }

    }
}