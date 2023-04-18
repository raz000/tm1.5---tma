import java.util.Scanner;
/** WHILE LOOP
 * Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/

public class ReverseInt {
    public static void main(String[] args) {
        int num, reverse=0,og_num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of numbers: ");
        num =input.nextInt();
        og_num=num;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse of "+ og_num + " = " +reverse);
    }
}
