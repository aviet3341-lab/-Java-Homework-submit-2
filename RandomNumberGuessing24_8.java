package tangavietanh_3289.HomeW;

import java.util.*;

public class RandomNumberGuessing24_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int SerectNumber = random.nextInt(20) + 1;
        int doan = 0;
        int soLanDoan = 0;
        do {
            System.out.println("Doan so d (1-20): ");
            doan = scanner.nextInt();
            soLanDoan++;
            if (doan < SerectNumber) {
                System.out.println("Sai!! Nhap so lon hon");
            } else if (doan > SerectNumber) {
                System.out.println("Sai!! Nhap so nho hon");
            } else {
                System.out.println("Ban da trung phan thuong 5.000.000 de nuoi con!!!!");
                System.out.println("So lan ban da doan: " + soLanDoan);
            }
        } while (doan != SerectNumber);
    }
}
