package TCS_NQT_PYQ;
import java.util.*;
public class problem8 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int maxOne = Integer.MIN_VALUE;
      System.out.println("Enter the Row");
      int row = sc.nextInt();

      System.out.println("Enter the Coloumn");
      int col= sc.nextInt();

      int[][] mattrix = new int[row][col];

      System.out.println("Enter the Mattrix");
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              mattrix[i][j]=sc.nextInt();
          }
      }
    int rowNo = 0;
      for(int i=0;i<row;i++){
          int crtOne = 0;
          for(int j=0;j<col;j++){
              if(mattrix[i][j]==1){
                  crtOne++;
                  maxOne = Math.max(crtOne ,maxOne);
              }
          }
          if(maxOne > crtOne){
              continue;
          }
          else if(crtOne >= maxOne){
              rowNo = i+1;
          }

      }
      System.out.println(maxOne+" and the row is : "+ rowNo);
  }

}
