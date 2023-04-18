import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double n,temperatures,average,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of temperatures you want to enter: ");
        n=input.nextDouble();

        System.out.print("Enter the temperatures:");
        for (int i = 0; i<n; i++){
            temperatures=input.nextDouble();
            sum+=temperatures;
        }
        average= sum/n;
        System.out.printf("%s%.2f","Average of temperatures is: ",average);
    }
}
