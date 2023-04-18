import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter an integer and displays on the
 * screen a message if this integer is positive or not.*/
public class PositiveINT {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = input.nextInt();
        if(num>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
