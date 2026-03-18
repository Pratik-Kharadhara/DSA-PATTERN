//Longest Substring with K Uniques
/*
You are given a string s consisting only lowercase alphabets and an integer k.
 Your task is to find the length of the longest substring that contains exactly
 k distinct characters.

Note : If no such substring exists, return -1.
*/
package Sliding_Window;
import java.util.HashMap;
public class problem3 {
        public int longestKSubstr(String s, int k) {
            //length of the string
            int low = 0,res = -1; //if not found result must be -1
            HashMap<Character, Integer> freq = new HashMap<>();//hashMap freq declare

            for (int high = 0; high < s.length(); high++) { //as its a variable window qs , high will move from
                //start to end and acoording to that we will move low
                char c = s.charAt(high);
                //this c is the Charecter that has been added currently
                //as high moves from start->end
                freq.put(c, freq.getOrDefault(c, 0) + 1);//this line means
            /*
            freq.getOrDefault(c, 0) if c is present in freq hashMap get the
            value if not then 0 and then add 1;

            freq.put(c, freq.getOrDefault(c, 0) + 1);
            as c is the charecter that has been added so if its already presnt
            then its value = value +1;
            if not present value =0+1;

            */

                // now we have 3 cases
            /* freq.size > k then shrink low
                freq.size < k then expand which we are already doing int he loop
                freq.size == k then count the lenght
                res = Math.max(res, high - low + 1);

            */
                // shrink window if more than k unique
                while (freq.size() > k) {
                    char leftChar = s.charAt(low);//take a new char at the low of the string
                    freq.put(leftChar, freq.get(leftChar) - 1);//take the value of leftChar and make the value
                    //value=value-1 in the hashMap
                    if (freq.get(leftChar) == 0) //if its 0 means it was its empty, remove it
                        freq.remove(leftChar);
                    low++;//other wise low++ and shrink the window
                }

                // if exactly k unique, update answer
                if (freq.size() == k) { //its the answer
                    res = Math.max(res, high - low + 1);//takes the number of distinct element of the string
                }
            }

            return res;


        }

}
