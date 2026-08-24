package tangavietanh_3289.HomeW;

import java.util.*;

public class SentinelNumberStatistics24_8 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double tong = 0;
        int soLuong = 0;
        double x = 0;
        do {
            System.out.println("Nhap so (Nhap so 0 de ket thuc!!): ");
            x = console.nextDouble();
            tong += x;
            soLuong++;
            if (soLuong == 0) {
                System.out.println("Chua co du lieu!!");
            } else {
                double trungBinh = tong / soLuong;
                System.out.println("Tong: " + tong);
                System.out.println("So Luong: " + soLuong);
                System.out.println("Trung Binh: " + trungBinh);
            }
        } while (x != 0);
    }
}
