package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class De2Cau1 {
    static Scanner sc = new Scanner(System.in);
    public static void cau1(){
        System.out.println("Các phần tử lẻ trong mảng là: " + addOddNumber(enterArray()));
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

    private static List<Integer> addOddNumber(int[] a) {
        List<Integer> oddNumber = new ArrayList<>();
        for (int odd:
             a) {
            if(odd % 2 != 0){
                oddNumber.add(odd);
            }
        }
        return oddNumber;
    }
}
