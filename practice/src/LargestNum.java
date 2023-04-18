/**Write a Java program that prompts the user to enter 3 integers and print on the screen
 the largest of them.
 */
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        int a,b,c,largest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        largest = a;
        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;

        System.out.println("The largest number is: "+largest);
    }
}
