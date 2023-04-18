import java.util.Scanner;

public class MaxCreditHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student GPA: ");
        double gpa = input.nextDouble();
        int max_cred=0;
        if (gpa <0 || gpa > 4)
            System.out.println("Wrong GPA");
        else if (gpa >=2 ){
            max_cred = 21;
            System.out.println("Max cred hours: "+max_cred);
        }
        else{
            max_cred = 16;
            System.out.println("Max cred hours: "+max_cred);
        }
    }
}
