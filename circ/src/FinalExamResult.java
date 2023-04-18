import java.util.Scanner;
public class FinalExamResult {
    public static void main(String[] args) {
        float TMAscore, MTAscore, finalscore, totalscore;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter TMA score: ");
        TMAscore = input.nextFloat();
        System.out.print("Enter MTA score: ");
        MTAscore = input.nextFloat();
        System.out.print("Enter FINAL exam score: ");
        finalscore = input.nextFloat();

        totalscore = TMAscore + MTAscore + finalscore;

        if (TMAscore > 20 || MTAscore > 30 || finalscore > 50) {
            System.out.println("Invalid Inputs");
        }
        else if(totalscore>=50){
            System.out.printf("%s%.2f\n","Total score = ",totalscore);
            System.out.println("The student PASSED the course");
        }
        else {
            System.out.printf("%s%.2f\n","Total score = ",totalscore);
            System.out.println("The student did NOT PASS the course");
        }

    }
}
