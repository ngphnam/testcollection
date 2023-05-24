package Main;

import java.util.*;

public class De2Cau2 {
    static Scanner sc = new Scanner(System.in);
    public static void cau2() {
        System.out.println("Nhập mảng 1:");
        int[] a1 = enterArray();
        System.out.println("Nhập mảng 2:");
        int[] a2 = enterArray();
        System.out.println("Mảng các phần tử không trùng nhau: " + getNonRepeatedElements(a1, a2));
    }
    private  static int[] enterArray() {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }

    private static Set<Integer> getNonRepeatedElements(int[] a1, int[] a2) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int element:
             a1) {
            uniqueElements.add(element);
        }
        for (int element:
                a2) {
            uniqueElements.add(element);
        }
        return uniqueElements;
    }

}
