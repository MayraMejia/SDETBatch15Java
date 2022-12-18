package Replit;

import java.util.Scanner;

public class reptasif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scan.nextBoolean();
        System.out.println("What is your credit score?");
            int credit = scan.nextInt();
        if (loan == true) {
            if (credit < 600) {
                System.out.println("Not eligible");
            }
            if (credit > 600 || credit == 700) {
                System.out.println("Maybe eligible");
            }
            if (credit > 700 || credit == 800) {
                System.out.println("Eligible");
            }
            if (credit > 800) {
                System.out.println("Definitely eligible");
            }
            else {
                System.out.println("unknow");
            }

        } if (loan ==false ) {
            System.out.println("unknown");
        }

    }}

