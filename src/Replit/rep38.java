package Replit;

import java.util.Scanner;

public class rep38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it weekend?");
        String day = scan.nextLine();

        if (day.equals("true")) {
            System.out.println("Today you will be learning manual testing");
        }
        else  {
            System.out.println("Today you will be learning Java");
        }
    }
}