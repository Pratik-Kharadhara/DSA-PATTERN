//3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without duplicate characters.


package Sliding_Window;
import java.util.HashMap;
public class problem5 {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int res= 0 ;
        HashMap<Character , Integer> charList = new HashMap<>();
        for(int high= 0 ; high<s.length();high++){
            char leftChar = s.charAt(high);
            charList.put(leftChar,charList.getOrDefault(leftChar,0)+1);
            int k = high -low +1 ; //this k will keep a track of the what is the length of the charectors and the hashMAp
            //as this qs not mentioned about the k so we have to keep a track
            //now comes the tricky part
            //now hashMap size have to be small can't be grater than k as
            //k = len of the current window and the hashmaps tells how many different char is present
            //how can it be greater than k ? which means in a 3 size window there will be 4 char? never possible
            // now our goal is to make the size of the hashmap and k same
            //which means there are all the distinct char with out repetations
            while(charList.size()<k){
                char lowChar = s.charAt(low);//keeps the lowest index char which will be removed as we move forward
                charList.put(lowChar,charList.get(lowChar)-1);
                if(charList.get(lowChar)==0){
                    charList.remove(lowChar);
                }
                low++;
                //now as low is increased we now have to calculate the k again
                //as its low ++ k -- so
                k = high - low +1;
            }
            //exiting the loop when the hashMap size is equal to the k
            int len = high - low +1;
            res = Math.max(res,len);
        }
        return res;
    }
}