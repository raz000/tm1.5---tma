import java.util.Scanner;

/**
 * M4 - Exercise 4:
 * Write a Java program that prompts the user to enter integers (0 to stop). The program
 * should count and print the number of positive integers and the number of negative
 * integers.*/

public class PosNeg {
    public static void main(String[] args) {
        int num = 1,pos_count=0,neg_count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers (0 to stop): ");

        while (true){
            num=input.nextInt();
            if (num>0)
               pos_count++;
            else  if (num<0)
                neg_count++;
            else
                break;
        }
        System.out.println("Positive integers = "+pos_count);
        System.out.println("Negative integers = "+neg_count);
    }
}
