package task;

import java.util.Scanner;

public class Hello10 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int b = aa.nextInt();
        int track =0;
        for (int a = b; a > 0; a--) {
            track +=a;
        }
        System.out.println(track);
    }

}
