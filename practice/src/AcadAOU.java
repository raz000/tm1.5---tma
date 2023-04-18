import java.util.Scanner;

/** M3 - Exercise 13
 * Academic status of AOU students could be:
 * - "regular" if their GPA ≥ 2
 * - "warned" if their GPA < 2 and number of warnings they received < 5
 * - "dismissed" if their GPA < 2 and number of warnings they received = 5
 * Write a Java application that reads from user the GPA of a student as a real number and
 * number of warnings he/she received, then prints the academic status of the student.*/

public class AcadAOU {
    public static void main(String[] args) {
        double gpa;
        int warning;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        gpa = input.nextDouble();

        if (gpa>=2)
            System.out.println("Regular");
        else {
            System.out.print("Enter number of warnings received: ");
            warning=input.nextInt();
            if (gpa < 2 && warning < 5)
                System.out.println("Warned");
            else
                System.out.println("Dismissed");
        }
    }
}
