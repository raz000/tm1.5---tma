import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter a word and displays on the screen
 * a message if this word starts with the letter 'A' or not.*/

public class LetterA {
    public static void main(String[] args) {
        String word;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a word: ");
        word=input.next();
        if (word.charAt(0)=='A')
            System.out.println("The word starts with A");
        else
            System.out.println("The word DOES NOT start with A");
    }
}
