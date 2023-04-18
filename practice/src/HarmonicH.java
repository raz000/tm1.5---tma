import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter an integer n and calculates the
 * harmonic number (𝐻𝑛) according to the following definition: (Assume that n ≥ 1)
 * 𝐻𝑛 = 1 + 1/2 + 1/3 + ... + 1/n
 * */
public class HarmonicH {
    public static void main(String[] args) {
        int n;
        double hn = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        n=input.nextInt();
        for (int i=1;i<=n;i++){
            hn += (1.0/i);
        }
        System.out.printf("%s%.3f","Harmonic number (hn) = ", hn);
    }
}
