/*Write a Java class called Ellipse that reads from the user 2 integers (a and b) that represent lengths
of the semi-major axis and the semi-minor axis of an ellipse.
Then calculates and prints the area of this ellipse (rounded to 1 decimal place) according to the following formula:

area = Π a b

In addition, a message indicates if the ellipse is large or small should be printed.
The ellipse is considered to be large if its area is greater than 150, otherwise it is considered to be small.*/


import java.util.Scanner;

public class Ellipse {
    public static void main(String[] args) {
        int a,b;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a=input.nextInt();
        System.out.print("Enter b: ");
        b=input.nextInt();

        area=Math.PI*a*b;
        System.out.printf("%s%.1f\n","Area= ",area);
        if (area>150)
            System.out.println("Ellipse is large");
        else
            System.out.println("Ellipse is small");
    }
}
