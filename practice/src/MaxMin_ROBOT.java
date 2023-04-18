
import java.util.Scanner;

public class MaxMin_ROBOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min;
        int max;
        int minCount = 0;
        int maxCount = 0;

        System.out.print("Enter a positive integer (0 to stop): ");
        int num = input.nextInt();

        max = num;
        min = num;
        while(num != 0) {
            if(num > max) {
                max = num;
                maxCount = 1;
            }
            else if(num == max) {
                maxCount++;
            }

            if(num < min) {
                min = num;
                minCount = 1;
            }
            else if(num == min) {
                minCount++;
            }

            //System.out.print("Enter a positive integer (0 to stop): ");
            num = input.nextInt();
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Maximum count: " + maxCount);
        System.out.println("Minimum number: " + min);
        System.out.println("Minimum count: " + minCount);
    }
}