import java.util.Scanner;

/**
 * Write a program to find the factorial value of any number entered through the keyboard. */

public class Factorial {
    public static void main(String[] args) {
        int num, fact=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find the factorial: ");
        num = input.nextInt();
        for (int i=0; i<=num;i++){
            fact+=i;
        }
        System.out.println("Factorial of " + num +" = " + fact);
    }
}
