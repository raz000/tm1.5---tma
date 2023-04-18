import java.util.Scanner;

public class LoopDivis {
    public static void main(String[] args) {
        int n,num,count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        n=input.nextInt();
        System.out.print("Enter the values: ");

        for (int i=0;i<n;i++){
            num=input.nextInt();
            if (num%2==0 || num%3==0)
                count++;
        }

        System.out.println("There are "+count+" values divisible by 2 or 3 or both");
        /*
        int i=0;
        while (i<n){
            num=input.nextInt();
            if (num%2==0 || num%3==0)
                count++;
            i++;
        }*/ //while loop implementation
    }
}
