class Solution {
    public boolean isHappy(int n) {
        //so as the question says if it contains a cycle
        //it won't be a happy number
        //to check cycle we will use slow and fast
        int slow = n;
        int fast =n ;
        //at first slow == fast that's  why do while loop
        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(slow != fast);
    //if there is a cycle then the number will not be happy
    //if the slow is 1 then it's happy number
        return slow == 1;
    }
    public int squareSum(int num){
            int sum= 0;
            while(num>0){
                int remainder = num %10;
                sum += remainder * remainder;
                num /= 10;
            }

            return sum;
    }
}