package tangavietanh_3289.HomeW;

import java.util.Scanner;

public class CensorWord7_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to censor: ");
        String word = sc.nextLine();

        String stars = "*".repeat(word.length());
        String censored = sentence.replace(word, stars);

        System.out.println("Censored: " + censored);

        sc.close();
    }
}
