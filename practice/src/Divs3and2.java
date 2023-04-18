import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter an integer and displays on the
 * screen a message if this integer is divisible by both 2 and 3 or not.*/

public class Divs3and2 {
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        num= in.nextInt();
        if (num%2==0 && num%3==0)
            System.out.println(num+" is divisible by both 2 and 3");
        else
            System.out.println(num+" is NOT divisible by both 2 and 3");

    }
}
