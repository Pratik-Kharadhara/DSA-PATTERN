import java.util.Arrays;
class Solution {
    //merge interval pattern topic
    public int[][] merge(int[][] intervals) {
     //first sort the array using the starting element 
     //eg [8,10], [1,3]
     //sort it so it became [1,3],[8,10] 
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //take 2 int ones takes the starting1 and another ending1
        int start1 = intervals[0][0]; //1
        int end1 = intervals[0][1]; //3
        //its a arrayList as we have to add intervals
        List<int[]> result = new ArrayList<>();
        for(int i=1; i<intervals.length; i++){
            int start2 = intervals[i][0]; //2
            int end2= intervals[i][1]; //6
            //if 3 > 2 that means it will be merge and the range will be [1,6]
            if(end1>=start2){
                start1 = start1; //1
                end1 = Math.max(end1,end2);//6
                continue;
            }
            else //if its not mergable then we have to add the current interval to the result beacuse its a distinct interval which is not mergable
         result.add(new int[]{start1, end1});

            //and move to the next interval
            start1 = start2;
            end1 = end2;

        }
        //here we are adding all the pending interval
         result.add(new int[]{start1, end1});
        return result.toArray(new int[result.size()][]);
    }
}