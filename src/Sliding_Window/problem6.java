//424. Longest Repeating Character Replacement
/*
You are given a string s and an integer k.
 You can choose any character of the string and change it to any other uppercase English character.
You can perform this operation at most k times.
Return the length of the longest substring containing the same letter
you can get after performing the above operations.
*/



package Sliding_Window;
public class problem6 {
        public static int FindMax(int arr[]){
            int max = arr[0];

            for(int i=0; i<arr.length; i++){
                max= Math.max(arr[i],max);
            }
            return max;
        }


        public int characterReplacement(String s, int k) {
            //this array will keep track for the all the char we gonna encounter during our loop
            int[] charec =new int[26]; //26 beacuse we have 26 alphabets
            int low=0;
            int result= Integer.MIN_VALUE;

            for(int high= 0; high< s.length();high++){
                /* In ASCII value
                A-A=0;
                B-A=1;
                C-A=2..
                so we will take the current high postion and substract it from A
                and increase it to 1 for that position
                */
                charec[s.charAt(high)-'A']++;

                int len = high-low+1;
                int maxC = FindMax(charec);
                int diff = len - maxC;
                    /*Diff is the main thing that we are calculating as we
                want our diff to be 0 means all the charectors are same
                or to be lower than K , like our substring AAA or AAB
                */
                while(diff>k){
                    charec[s.charAt(low)-'A']--;//dcreasing the low freq
                    low++;
                    len = high-low+1;
                    maxC = FindMax(charec);
                    diff = len - maxC;
                }

                //for any other case like diff<K or diff==0

                len= high-low+1;
                result = Math.max(len,result);


            }
            return result;



        }
    }
