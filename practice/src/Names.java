import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String myName, fName = "null";
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please, insert your first name: ");
        myName = input.next();
        System.out.println("Please, insert the first names of your friends" +
                " (enter \"stop\" to stop your program): ");
        while (!fName.equals("stop")) {
            fName = input.next();
            if (myName.equals(fName))
                count++;
        }
        System.out.println(count + " of your friends their first name" +
                " are identical to your first name");
    }
}
