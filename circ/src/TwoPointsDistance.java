import java.util.Scanner;

public class TwoPointsDistance {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x and y coord of the FIRST point P1: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.print("Enter x and y coord of the SECOND point P2: ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("%s%.2f","The distance between the two points = ",distance);


    }
}
