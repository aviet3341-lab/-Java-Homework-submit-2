package tangavietanh_3289.HomeW;

import java.util.Scanner;

public class KtrChanLe18_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so bat ki:");
        int a = scanner.nextInt();
        
        if (a%2==0){
            System.out.println(a + " Day la so chan");
        }else {
            System.out.println(a + " Day la so le");
        }
    }
}
