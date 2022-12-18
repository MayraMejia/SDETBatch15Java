package Replit;

import java.util.Scanner;

public class rep31 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Is sunny outside?");
        boolean isSunny = scan.nextBoolean();
       /*
         System.out.println("What the temperature outside ?");
        int temp = scan.nextInt();
        */
        if(isSunny);{
            System.out.println("Its sunny outside i should go somewhere!");}
        System.out.println("What the temperature outside ?");
        int temp = scan.nextInt();
         if (temp>=85) {
            System.out.println("im going to the beach ");
        } else if (temp<85) {
             System.out.println("im going to the park ");
         }
         else System.out.println();
    }


    }

