import java.util.Arrays;
import java.util.Scanner;

public class ScannwithArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers ");
        int [] number=new int[5];
        /* below code manually store the numbers in the array
         number [0]=40;
         number [1]=50;
         number [2]=60;
         number [3]=70;
         number [4]=80;
         */
        // below code take the numbers from the user and store them in the array its good but a lot of code
         /*
        number [0]= scan.nextInt();
        number [1]= scan.nextInt();
        number [2]= scan.nextInt();
        number [3]= scan.nextInt();
        number [4]= scan.nextInt();
          */

        for (int i = 0; i < number.length; i++) {
            number[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(number));

    }
}
