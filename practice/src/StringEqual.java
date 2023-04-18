import java.util.Scanner;

/**
 * Write a Java program that prompts the user to enter 2 words and displays on the screen
 * a message if the 2 words are identical or not.*/

public class StringEqual {
    public static void main(String[] args) {
        String word1,word2;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 2 words: ");
        word1=input.next();
        word2=input.next();
        if (word1.equals(word2))
            System.out.println("Equal");
        else
            System.out.println("NOT equal");
    }
}
