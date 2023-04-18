import java.util.Scanner;

/**
 * Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/



public class SumEvenOdd {
    public static void main(String[] args) {
        int num,evenSum=0,oddSum=0,n;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter: ");
        n=input.nextInt();
        System.out.print("Enter " + n +" number(s): ");
        for (int i=0;i<n;i++){
            num=input.nextInt();
            if (num % 2 == 0)
                evenSum+=num;
            else
                oddSum+=num;
        }
        System.out.println("Sum = "+ evenSum);
        System.out.println("Sum = "+ oddSum);

    }
}
