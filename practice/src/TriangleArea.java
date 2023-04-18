import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        int a,b,c; //lengths
        double s , area; //semi-perimeter & area

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangle's length: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if (a>0 && b>0 && c>0){
            s=(a+b+c)/2.0;

            area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
            //System.out.printf("%s%.1f\n","Semi-perimeter (s) = ",s);
            System.out.printf("%s%.1f","Area = ",area);
        }else System.out.println("Error! All sides must be positive!");

    }
}
