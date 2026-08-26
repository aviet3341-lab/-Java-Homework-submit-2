package tangavietanh_3289.HomeW;

import java.util.*;

public class ReadandDisplayArray26_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(a));
    }
}
