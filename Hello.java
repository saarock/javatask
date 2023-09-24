package task;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String name_ = name.nextLine();
        for(int a=1;a<=5;a++) {
            System.out.println("Hello "+ name_);
        }

    }
    }
