package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class De3Cau3 {
    static Scanner sc = new Scanner(System.in);
    public static void cau3() {
        int[] a = enterArray();
        System.out.println("Mảng số nguyên tố: " + addPrime(a));
        System.out.println("Mảng số bình thường: " + addNumbers(a));
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
    private static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    private static List<Integer> addPrime(int[] a) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int num:
                a) {
            if (isPrime(num)){
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    private static List<Integer> addNumbers(int[] a) {
        List<Integer> normalNumber = new ArrayList<>();
        for (int num:
             a) {
            if (!isPrime(num)) {
                normalNumber.add(num);
            }
        }
        return normalNumber;
    }

}
