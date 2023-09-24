package task;

import java.util.Scanner;

public class Hello8 {
    // Reverse the integer
    public static void main(String[] args) {
        System.out.println("wRITE MORE THATN ONE INTEGER OF REVERSE: ");
        Scanner ints = new Scanner(System.in);
        int intss = ints.nextInt();
        String str = Integer.toString(intss);
        System.out.println(str);
        System.out.println(((Object) str).getClass());
        String bk = "";
        for (int a = 0; a < str.length(); a++) {
            bk = str.charAt(a) + bk;

        }
        System.out.println(bk);

    }

}
