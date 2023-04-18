import java.util.Scanner;

public class MaxTemp {
    public static void main(String[] args) {
        int n,temp,max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of temperatures you want to enter: ");
        n=input.nextInt();

        System.out.print("Enter the temperature: ");
        temp=input.nextInt();
        max=temp;

        for (int i = 1; i<n; i++){
            if (temp>max)
                max = temp;
            System.out.print("Enter the temperature: ");
            temp=input.nextInt();
        }

        System.out.println("Max  temperatures is: "+max);

    }
}

