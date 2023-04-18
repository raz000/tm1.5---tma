import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter 2 positive integers and displays on
 * the screen a message if the first integer is a multiple of the second one or not.*/

public class Multiple {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        num1=input.nextInt();
        num2=input.nextInt();
        if(num1%num2==0)
            System.out.println(num1 + " is a multiple of " + num2);
        else
            System.out.println(num1 + " is NOT a multiple of " + num2);
    }
}
