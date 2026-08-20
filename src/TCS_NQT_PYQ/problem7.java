package TCS_NQT_PYQ;
import java.util.*;
public class problem7 {
    public static void main(String[] args){
        HashMap<String,Integer> days = new HashMap<>();
        Scanner sc = new Scanner(System.in);
            days.put("Sun",0);
        days.put("Mon",6);
        days.put("Tue",5);
        days.put("WED",4);
        days.put("THU",3);
        days.put("FRI",2);
        days.put("SAT",1);

        System.out.println("Enter the Start date of the Month: ");
        String startDay = sc.next();

        System.out.println("Enter the no of day:");
        int daysCount = sc.nextInt();
       //System.out.println(days.get(startDay));

        int result = 0;

        if(days.get(startDay)== 0){
            result++;
        }


        if((daysCount - days.get(startDay))>0){
            result++;
            result += (daysCount - days.get(startDay))/7;
        }

        System.out.println("The number of Sundays: "+result);
    }
}
