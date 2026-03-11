//Container With Most Water
/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i])
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
*/
package two_pointer;
public class problem8 {
    public int maxArea(int[] height) {
        // we are using two pointer method here
        int i =0 ;
        int j=height.length-1;
        int maxArea = 0;//this will check our maxArea/maxWater which is required in the question
        while(i<j){ //this is our main constraint
           //if i is smaller than j then
            //i == j then we do nothing as it will give us 0
                //we simply calculate the area
                int crtArea = Math.min(height[i] ,height[j])*(j-i);
                //if the current area is bigger only when we update that to maxArea
                if(crtArea > maxArea){
                    maxArea = crtArea;
                }
            //if ith element is smaller than jth element we do i++
                if(height[i]<height[j]){
                    i++;
                }
                //else we do j--
                else {
                    j--;
                }

        }
        return maxArea;
    }
}
