import java.util.Scanner;

/**
 * Write a Java application that reads from the user 2 integers. Then displays on the screen
 * a rectangle of asterisks its number of rows is the first integer and its number of columns
 * is the second integer. Assume that the user will insert positive integers.
 * E.g., if the user enters 3 and 7, the output should be:
 *         *******
 *         *******
 *         *******
 * */
public class RectPattern {
    public static void main(String[] args) {
        int row,col;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row(s): ");
        row=input.nextInt();
        System.out.print("Enter column(s): ");
        col=input.nextInt();
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
