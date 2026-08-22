package TCS_NQT_PYQ;
import java.util.*;
public class problem8 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Row");
      int row = sc.nextInt();

      System.out.println("Enter the Coloumn");
      int col= sc.nextInt();

      int[][] mattrix = new int[row][col];

      System.out.println("Enter the Mattrix");
      for(int i=0;i<=row;i++){
          for(int j=0;j<=col;j++){
              mattrix[i][j]=sc.nextInt();
          }
      }
  }

}
