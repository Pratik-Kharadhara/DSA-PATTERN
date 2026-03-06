//Triplets with Smaller Sum
//Given an array arr[] of distinct integers of size n and a value sum, the task is
//to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.
import java.util.Arrays;
public class problem6 {
    long countTriplets(long n, long sum,long arr[]) {
            long count=0;
            Arrays.sort(arr);//sorted array
            for(int i=0;i<=arr.length-2;i++){
                int j=i+1;
                int k=arr.length-1;
                while(j<k){
                    long total=arr[i]+arr[j]+arr[k]; //total = all the indices sum
                    if(total<sum){ //its satisfies the condition
                        count=count+(k-j);//if total < sum then all the values between k and j sum gonna be < sum
                       //example:
                        /*
                        arr = [1, 2, 3, 4, 5]
                        target = 8
                        if i is fixed and then j is 1 and k is at 4
                        so 1+2+5 = 8 which is same to 8
                        now k--
                        1+2+4 = 7 which is < 8
                        so what about 1+2+3 its also < 8
                        so if we satisfies i+j+k < 8
                        so between j & k everthing will satisfy
                        so count = count+(k-j)
                       */
                        j++; //bcz its <sum so we are increasing j
                    }
                    else{
                        k--;//if its greater than sum decrese k
                    }
                }

            }
            return count;
        }
    }
