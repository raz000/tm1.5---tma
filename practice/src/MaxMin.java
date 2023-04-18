import java.util.Scanner;

/** WRONG!
 * Exercise 5:
 * Write a Java program that prompts the user to enter positive integers (0 to stop). The
 * program should count and print the maximum and minimum integers entered by the
 * user.*/
public class MaxMin {
    public static void main(String[] args) {
        int num, max_count=0, min_count=0, max, min;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter positive numbers (0 to stop): ");
        num=input.nextInt();

        max=num;
        min=num;
        while (num!=0) {
            if (num >= max) {
                max = num;
                max_count++;
            }
            if (num <= min) {
                min = num;
                min_count++;
            }
            num=input.nextInt();
        }

            System.out.println("Maximum number= "+max +"\t\tThere are "+max_count+ " max numbers counted");
            System.out.println("Minimum number= "+min+"\t\tThere are "+min_count+ " max numbers counted");

    }
}
