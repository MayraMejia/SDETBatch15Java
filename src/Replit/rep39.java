package Replit;

import java.util.Scanner;

public class rep39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int grade = scan.nextInt();

        if ( grade<25){
            System.out.println("Your grade is F");}
        else if (grade>25 && grade<=45){
            System.out.println("Your grade is E");}
        else if (grade>45 && grade<=50){
            System.out.println("Your grade is D");}
        else  if (grade>50 && grade<=60){
            System.out.println("Your grade is C");}
        else if (grade>60 && grade<=79){
            System.out.println("Your grade is B");}
        else  if (grade> 80){
            System.out.println("Your grade is A");}
        else {
            System.out.println("Please enter valid mark");

        }
    }
}
