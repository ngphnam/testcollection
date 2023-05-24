package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class De1Cau3 {
    //Câu 3: nhập vào 1 list mảng số nguyên trả ra 1 list chứa giá trị trung bình từng phần tử của list đầu vào
    static Scanner sc = new Scanner(System.in);
    public static void cau3(){
        System.out.print("Nhập vào số lượng list: ");
        int n = sc.nextInt();
        List<Double> averageList = calculateAvrList(enterIntegerList(n));
        System.out.println("List giá trị trung bình của mảng là: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Mảng " + (i + 1) + ": " + averageList.get(i));
        }

    }

    public static List<int[]> enterIntegerList(int n) {
        List<int[]> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào số lượng phần tử của list %d: ", i+1);
            int length = sc.nextInt();
            int[] arrayList = new int[length];
            for (int j = 0; j < length; j++) {
                System.out.printf("arrayList[%d] = ", j);
                arrayList[j] = sc.nextInt();
            }
            integerList.add(arrayList);
        }
        return integerList;
    }
    private static List<Double> calculateAvrList(List<int[]> integerList){
        List<Double> avrList = new ArrayList<>();

        for (int[] array:
             integerList) {
            int sum = 0;
            for (int num: array){
                sum += num;
            }
            double avr = (double)sum / array.length;
            avrList.add(avr);
        }
        return avrList;
    }
}
