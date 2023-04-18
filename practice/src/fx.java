import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter 2 positive integers (say x and y)
 * and prints on the screen the result of the following mathematical function: (Try to write
 * the result to the standard output without using any additional variables except x and y)
 *  */


public class fx {
    public static void main(String[] args) {
        int x,y;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        x= input.nextInt();
        System.out.print("Enter y: ");
        y= input.nextInt();

        result = Math.ceil( (Math.sqrt( Math.abs( (Math.pow(x,5) - Math.pow(y,5) ))) + (x*y)) / (x+y)) + 2.0;
        System.out.println("f(x,y) = "+result);
    }
}
