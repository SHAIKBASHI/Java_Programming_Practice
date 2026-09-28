import java.util.*;

public class ReverseOrderOfWords {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String result = "";

        for(int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println("Reverse order: " + result);
    }
}