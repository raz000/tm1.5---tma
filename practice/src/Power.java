import java.util.Scanner;

/**
 * Two numbers are entered through the keyboard.
 * Write a program to find the value of one number raised to the power of another.
 * (Do not use Java built-in method)*/

public class Power {
    public static void main(String[] args) {
        int a,b,result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a=input.nextInt();
        System.out.print("Enter b: ");
        b=input.nextInt();
        
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(a+" power of "+b+" = "+result);
    }
}
