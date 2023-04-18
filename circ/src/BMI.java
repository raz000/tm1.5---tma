import java.util.Scanner; // import the Scanner class

public class BMI {
    public static void main(String[] args) {
        double bmi, w, h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight (kilograms): ");
        w = input.nextDouble();
        System.out.print("Enter your height (meters): ");
        h = input.nextDouble();
        bmi = w/Math.pow(h,2);
        System.out.printf("%s%.2f\n","Your BMI value = ",bmi);
        if (bmi <18.5 )
            System.out.println("under");
       else if (bmi >=18.5 && bmi<=25)
            System.out.println("ideal");
       else if (bmi>25 && bmi<=30)
            System.out.println("over");
       else
            System.out.println("obese");


    }
}