//76. Minimum Window Substring
/*  Given two strings s and t of lengths m and n respectively, return the minimum window substring
 of s such that every character in t (including duplicates) is included in the window.
If there is no such substring, return the empty string "".

 */


package Sliding_Window;

public class problem8 {
        public boolean rightCondition(int[] having , int[] needed){
            for(int i = 0 ;i < 256 ; i++){
                if(having[i]<needed[i]){
                    return false ;
                }
            }
            return true;
        }


        public String minWindow(String s, String t) {
            int low = 0 ;
            int res = Integer.MAX_VALUE ;
            int start = 0 ;


            //empty array for the s which is the having array
            int[] having = new int[256];

            //another one for what we need to do
            int[] needed = new int[256];


            //traverse and store the what we need
            for(int i=0;i<t.length();i++){

                needed[t.charAt(i)]++ ;//this will increase the count for that char at the array

            }
            //we will shrink when the answer we right and will increase the window whenver the answer is wrong
            for(int high= 0;high<s.length();high++){
                having[s.charAt(high)]++; //add the freequency in the having array
                while(rightCondition(having , needed)){
                    int len = high - low +1; //finds the lenght
                    if(res>len){
                        res = len ;
                        start = low ; //we store the low to make the sub array
                    }
                    having[s.charAt(low)]--;
                    low ++ ;
                }
            }
            if(res == Integer.MAX_VALUE){return "";}
            return s.substring(start,start+res);
        }
}
