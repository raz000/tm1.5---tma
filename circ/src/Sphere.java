import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        double r, volume;
        System.out.print("Enter radius: ");
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        volume = (4.0/3.0)*Math.PI*Math.pow(r,3.0);
        System.out.printf("%s%.1f","Volume= ",volume);
    }
}
