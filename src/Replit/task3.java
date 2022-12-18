package Replit;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        double total=0;

        for (int i = 0; i <3; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What item do you want to buy and the price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            System.out.println("How much do you have");
            double money = scan.nextDouble();
            double remainder = 0;

            if (itemPrice > money) {
                System.out.println("You don't have enough money your remaining balance is " + (itemPrice - money));
            } else if (itemPrice < money) {
                System.out.println("You give more money here is your change " + (money - itemPrice));
            } else {
                System.out.println("thank you for shopping ");
            }
        }
    }
}