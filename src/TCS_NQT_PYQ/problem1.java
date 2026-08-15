package TCS_NQT_PYQ;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] container = new int[256];
        for (int i = 0; i <= input.length() - 1; i++) {
            container[input.charAt(i) - 0]++;
        }
        System.out.println(conditionCheck(container));
    }

    public static int conditionCheck(int[] arr) {
        char ch1 = '*';
        char ch2 = '#';
        int star = ch1;
        int hash = ch2;

        if (arr[star] == arr[hash]) {
            return 0;
        } else
            return (arr[hash] - arr[star]);
    }
}