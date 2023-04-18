import java.util.Scanner;

public class TriangleAreaPerimeter {
    public static void main(String[] args) {
        int l,m,n;
        double area,perimeter,s;
        System.out.print("Enter 3 sides of a triangle: ");
        Scanner input = new Scanner(System.in);
        l= input.nextInt(); 
        m= input.nextInt();
        n= input.nextInt();
        s=(l+m+n)/2;
        area=Math.sqrt(s*(s-l)*(s-m)*(s-n));
        perimeter=s*2;
        if (l<0 || m<0 || n<0)
             System.out.println("Invalid inputs");
        else {
            System.out.printf("%s%.2f\n","Area= ", area);
            System.out.printf("%s%.2f","Perimeter= ", perimeter);
        }
    }
}
