import java.util.Scanner;

/**
 * The area of a triangle is computed using the following formula: area = 1/2bh
 * Where h and b are the lengths of the base and the height of the triangle, respectively.
 * Write a Java program that prompts the user to enter the lengths of the bases and the
 * heights for two triangles (as integers). Then it should print a message indicates which
 * triangle has a larger area or indicates if they have the same area.*/
public class LargerTrig {
    public static void main(String[] args) {
        double area1,area2;
        int h1,h2,b1,b2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 lengths of 2 triangles: ");
        h1=input.nextInt();
        h2=input.nextInt();

        System.out.print("Enter 2 heights of 2 triangles: ");
        b1=input.nextInt();
        b2=input.nextInt();

        area1 = (1.0/2.0) *b1*h1;
        area2 = (1.0/2.0) *b2*h2;

        if (area1 > area2)
            System.out.println("Triangle 1's area is larger");
        else if (area1 == area2)
            System.out.println("Both equal");
        else
            System.out.println("Triangle 2's area is larger");
    }
}
