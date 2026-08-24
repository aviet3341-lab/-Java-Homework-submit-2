package tangavietanh_3289.HomeW;

import java.util.Scanner;

public class KtraDat18_8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem kiem tra:");
        double a = scanner.nextDouble();
        if (a < 0 || a > 10) {
            System.out.println("Ket qua loi!!");
        }else if (a >= 5.0){
            System.out.println("Dat");
        }else { 
            System.out.println("Khong dat!!");
        }
    }
}
