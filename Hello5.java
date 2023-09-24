package task;
import java.util.Scanner;


public class Hello5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a positive non-zero integer: ");
            int n = s.nextInt();
            int sum = cal(n);

            System.out.println("Sum of 1 to " + n + " is " + sum);

            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            choice = s.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }

    public static int cal(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
