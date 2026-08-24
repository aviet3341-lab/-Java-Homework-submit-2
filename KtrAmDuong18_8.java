package tangavietanh_3289.HomeW;

import java.util.Scanner;

public class KtrAmDuong18_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so bat ki:");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("So duong");
        } else if (a < 0) {
            System.out.println("So am");
        } else {
            System.out.println("So 0");
        }
    }
}
