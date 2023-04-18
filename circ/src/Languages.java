import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Languages {
    public static void main(String[] args) {
        String lang;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the language used:");
        lang = input.nextLine();
        if(lang.equals("High Level"))
            System.out.println("You need a Compiler or Interpreter");
        else if (lang.equals("Machine"))
            System.out.println("You do not need a translator");
        else
            System.out.println("Invalid Language");

        /*
        switch (lang){
            case "High Level":
                System.out.println("You need a Compiler or Interpreter");
                break;
            case "Machine":
                System.out.println("You do not need a translator");
                break;
            default:
                System.out.println("Invalid Language");
                break;

        }*/
    }
}
