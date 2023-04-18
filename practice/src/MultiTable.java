import java.util.Scanner;

/**
 * Write a program that prompts the user to input a positive integer.
 * It should then print the multiplication table of that number. */

public class MultiTable {
    public static void main(String[] args) {
        int num,result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print multiplication table: ");
        num = input.nextInt();
        for (int i=0;i<=10;i++){
            result=num*i;
            System.out.println(i + " * " + num + " = " + result);
        }

    }
}
