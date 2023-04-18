import java.util.Scanner;

/**
 * Write a Java program that reads from the user a real number that
 * represents the length of the side opposite the 30 degree angle in a
 * 30-60-90 triangle.
 * The program then calculates and prints the area of this triangle
 * (rounded to 2 decimal places) according to the following formula:
 * area = 1/2(√3𝑥^2)
 * */

public class AreaTrig {
    public static void main(String[] args) {
        double length,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of triangle: ");
        length=input.nextDouble();
        area=1.0/2.0*(Math.sqrt(3)*Math.pow(length,2));
        System.out.printf("%s%.2f","Area = ",area);

    }
}
