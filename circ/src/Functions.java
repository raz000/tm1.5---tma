import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int x;
        double fx;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x= input.nextInt();
        if (x>=0)
            fx=Math.sqrt(x)+1.0;
        else
            fx=Math.pow(x,2)-1.0;
        System.out.printf("%s%d%s%.1f","f(",x,") = ",fx);
    }
}
