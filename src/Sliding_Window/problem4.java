//904. Fruit Into Baskets
//You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
//
//You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
//
//You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
//Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
//Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//Given the integer array fruits, return the maximum number of fruits you can pick.


package Sliding_Window;
import java.util.HashMap;
public class problem4 {
        public int totalFruit(int[] fruits) {
            int low = 0 ;
            int high;
            int result = 0 ;
            HashMap<Integer,Integer> basket = new HashMap<>();//it will map int to int
            //we will loop over the array to see our sliding window
            for(high=0;high<fruits.length;high++){
                int fruit = fruits[high];
                basket.put(fruit,basket.getOrDefault(fruit,0)+1);//if we see a new fruit add the +1 to the hash map
                if(basket.size() > 2){
                    int leftFruit = fruits[low];
                    basket.put(leftFruit, basket.get(leftFruit)-1);

                    if(basket.get(leftFruit)==0){
                        basket.remove(leftFruit);//if 0 then remove
                    }
                    low++;
                }

                //else we have only two cases basket.size()<2 and basket.size()==2 so for both the cases we gonna have the answer so
                result = Math.max(result, high-low+1); // we are directly having the answer

            }
            return result;
        }
    }

