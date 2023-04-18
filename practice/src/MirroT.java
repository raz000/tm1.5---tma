import java.util.Scanner;

public class MirroT {
    public static void main(String[] args) {
        int number_of_rows;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        number_of_rows=input.nextInt();
        for(int i=1;i<=number_of_rows;i++)
        {
            for(int j=0;j<number_of_rows-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
