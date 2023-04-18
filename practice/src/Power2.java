import java.util.Scanner;

/** WRONG!
 * M4 - Exercise 6:
 * Write a Java program that prompts the user to enter a number and prints all the
 * positive integer powers of 2 less than or equal that number. Do not use the method
 * Math.pow() in your solution.
 * E.g., if the user enters 9, the output should be:
 * 2 to the power 0 = 1
 * 2 to the power 1 = 2
 * 2 to the power 2 = 4
 * 2 to the power 3 = 8*/
public class Power2 {
    public static void main(String[] args) {
        int num,power_num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        num=input.nextInt();
        int i = 0;
        while (power_num<=num){
            power_num=2*i;
            System.out.println("2 to the power "+i+" = "+power_num);
            i++;
        }
    }
}
