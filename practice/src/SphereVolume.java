import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        int r;
        double volume;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of sphere (r): ");
        r = input.nextInt();


        if (r>0) {
            volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
            System.out.printf("%s%.2f","Volume of Sphere = ",volume);
        }else
            System.out.println("Error! Radius must be positive!");
    }
}
