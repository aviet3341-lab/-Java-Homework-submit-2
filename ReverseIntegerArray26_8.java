package tangavietanh_3289.HomeW;

import java.util.*;

public class ReverseIntegerArray26_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //dung mang phu de doi cho 
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[n - 1 - i];
        }
        
        System.out.println("Method 1:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        //doi cho bang bien tam
        for (int i = 0; i < n / 2; i++) {
        int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
                
        System.out.print("\nMethod 2: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        //in nguoc ve sau
        System.out.print("\nMethod 3: ");
        for (int i = n - 1; i >= 0; i--) {
        System.out.print(a[i] + " ");
        }
    }
}
