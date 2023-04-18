import java.util.Scanner;

/**
 * M4 - Exercise 3:
 * Write a Java program that prompts the user to enter 2 integers and prints the sum of all
 * even numbers between these 2 integers (inclusive). Assume that the first integer is
 * always less than or equal to the second integer. */
public class SumEVEN {
    public static void main(String[] args) {
        int num1,num2,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        num1= input.nextInt();
        num2= input.nextInt();
        for (int i=0;i<=num2;i++){
            if (num1%2==0){
                sum+=num1;
            }
            num1++;
        }
        System.out.println("Sum = "+sum);

    }
}
