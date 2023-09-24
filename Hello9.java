package task;
import java.util.Scanner;

public class Hello9 {
    public static void main(String[] args) {
        int avgLess = 0, cntLess = 0, avgMore = 0, cntMore = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 50) {
                avgLess += num;
                cntLess++;
            } else {
                avgMore += num;
                cntMore++;
            }
        }
        if (cntLess > 0) {
            avgLess = avgLess / cntLess;
            System.out.println("Avg of numbers less than 50: " + avgLess);
        } else {
            System.out.println("No numbers less than 50 entered.");
        }
        if (cntMore > 0) {
            avgMore = avgMore / cntMore;
            System.out.println("Avg of numbers greater than or equal to 50: " + avgMore);
        } else {
            System.out.println("No numbers greater than or equal to 50 entered.");
        }
        sc.close();
    }
}
