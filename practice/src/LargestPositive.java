import java.util.Scanner;

/**
 * M4 - Exercise 8:
 * Write a Java program that prompts the user to enter integers (0 to stop). The program
 * should find and print the largest positive even number of them. If the user did not enter
 * any positive even number, the program should print 0*/
public class LargestPositive {
    public static void main(String[] args) {
        int num, large, largest_even = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (0 to stop): ");
        num = input.nextInt();
        large = num;
        while (num != 0) {
            if (num > 0) {
                if (num >= large) {
                    large = num;
                    if (large % 2 == 0) {
                        largest_even = large;
                    }
                    else
                        largest_even = 0;
                }
            }
            num = input.nextInt();
        }
        System.out.println("Largest positive even number = " + largest_even);

    }

}
