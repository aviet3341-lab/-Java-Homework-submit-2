package tangavietanh_3289.HomeW;

import java.util.Scanner;

public class CheckPrefixSuffix7_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.println("Starts with report: " + fileName.startsWith("report"));
        System.out.println("Ends with .pdf: " + fileName.endsWith(".pdf"));
        System.out.println("First character = " + fileName.charAt(0));
        System.out.println("Last character = " + fileName.charAt(fileName.length() - 1));

        sc.close();
    }
}
