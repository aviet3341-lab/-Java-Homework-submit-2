package tangavietanh_3289.HomeW;

import java.util.Scanner;

public class BasicStringInfoApp7_9 {
    public static  String trimText(String text) {
        return text.trim();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String text = sc.nextLine();
        String trimmed = trimText(text);
        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Upper: [" + text.toUpperCase() + "]");
        System.out.println("Lower: [" + text.toLowerCase() + "]");
        System.out.println("Original lentgh = " + text.length());
        System.out.println("Lenth after trim = " + trimmed.length());
    }
}
