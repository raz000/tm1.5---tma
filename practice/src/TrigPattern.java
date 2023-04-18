import java.util.Scanner;

public class TrigPattern {
    public static void main(String[] args) {
        int row,col;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row(s): ");
        row=input.nextInt();
       // System.out.print("Enter column(s): ");
       // col=input.nextInt();
        for (int i=0;i<row;i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
                //System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
