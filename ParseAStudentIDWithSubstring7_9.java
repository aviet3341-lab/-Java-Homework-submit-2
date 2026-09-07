package tangavietanh_3289.HomeW;

import java.util.*;

public class ParseAStudentIDWithSubstring7_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID, for exmaple SE123456: ");
        String studentID = sc.nextLine();
        String majorCode = studentID.substring(0, 2);
        String numbericPart = studentID.substring(2);
        System.out.println("Major code = " + majorCode);
        System.out.println("Numberic part = " + numbericPart);
    }
}
