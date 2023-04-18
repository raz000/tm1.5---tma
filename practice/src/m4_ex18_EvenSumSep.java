import java.util.Scanner;

/**
 *  M4 - Exercise 9:
 *  * Write a Java program that prompts the user to enter a positive integer.
 *  * Then separates the integer into its individual digits and prints a message indicating if the
 *  * sum of its digits is odd or even.
 *  * E.g., if the user enters 35271, the output should be: The sum of the digits of 35271 is
 *  * 18, which is even.
 *  * Explanation:
 *  * 3 + 5 + 2 + 7 + 1 = 18 which is even.
 *  */

public class m4_ex18_EvenSumSep {
    public static void main(String[] args) {
        int num,sum=0,digit = 0,og_num;
        System.out.print("Enter positive number: ");
        Scanner input= new Scanner(System.in);
        num =input.nextInt();

        og_num=num;
        while (num>0){
            digit = num % 10;
           // System.out.println("digit = "+digit);
            sum +=digit;
            num/=10;
           // System.out.println("num = "+num);
        }
        /*if (sum % 2==0)
            System.out.println("The sum of the digits of " + og_num + " is " + sum+", which is even");
        else
            System.out.println("The sum of the digits of " + og_num + " is " + sum+", which is odd");
        */
        System.out.println("The sum of the digits of " + og_num + " is " + sum + ", which is " +(sum%2==0? "even":"odd") +"." );
    }
}
