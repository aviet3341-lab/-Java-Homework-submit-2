package tangavietanh_3289.HomeW;

import java.util.*;

public class RandomNumberAddition24_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int diem = 0;
        int soCauSai = 0;

        do {

            int soLuong = random.nextInt(4) + 2;
            int tong = 0;

            System.out.print("Tinh: ");

            for (int i = 1; i <= soLuong; i++) {

                int soHang = random.nextInt(10) + 1;
                tong += soHang;
                System.out.print(soHang);
                if (i < soLuong) {

                    System.out.print(" + ");

                }

            }

            System.out.print(" = ");

            int dapAn = scanner.nextInt();
            if (dapAn == tong) {

                System.out.println("Dung!");
                diem++;

            } else {

                System.out.println("Sai! Dap an dung la: " + tong);
                soCauSai++;
                System.out.println("So cau sai: " + soCauSai);
            }

            System.out.println();

        } while (soCauSai < 3);

        System.out.println("GAME OVER!");
        System.out.println("Tong diem cua ban: " + diem);

    }

}
