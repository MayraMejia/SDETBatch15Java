package Replit;

import java.util.Scanner;

public class rep28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter month number ");
        int one = scan.nextInt();

        if(one==1){
            System.out.println("January");}
        else if(one==2){
            System.out.println("February");}
        else if(one==3){
            System.out.println("March");}
        else if(one==4){
            System.out.println("April");}
        else if(one==5){
            System.out.println("May");}
        else if(one==6){
            System.out.println("June");}
        else if(one==7){
            System.out.println("July");}
        else if(one==8){
            System.out.println("August");}
        else if(one==9){
            System.out.println("September");}
        else if(one==10){
            System.out.println("October");}
        else if(one==11){
            System.out.println("November");}
        else if(one==12){
            System.out.println("December");}
        else {
            System.out.println("Invalid");
        }
    }
    }
