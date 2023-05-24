package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class De1Cau2 {
    //    Câu 2: Hãy thực hiện nhập vào 1 số nguyên n, viết các hàm để chuyển số đó sang dạng nhị phân sau đó thêm các phần tử 0 và 1 vào các mảng tương ứng.
//            (4 điểm)
//            ●	Đầu vào: 1 số nguyên n bất kì
//●	Đầu ra: 2 mảng, 1 mảng chứa giá trị 0, 1 mảng chứa giá trị 1 của số n được chuyển sang dạng nhị phân.
    static Scanner sc = new Scanner(System.in);

    public static void cau2() {
        List<Integer> binList = convertToBinary(enterInteger());
        Collections.reverse(binList);
        System.out.println("Convert 10 to 2: " + binList);
        List<Integer> zeroArray = new ArrayList<>();
        List<Integer> oneArray = new ArrayList<>();
        for (int digit:
             binList) {
            if(digit == 0){
                zeroArray.add(digit);
            }
            else {
                oneArray.add(digit);
            }
        }
        System.out.println("Zero Array = " + zeroArray);
        System.out.println("One Array = " + oneArray);
    }
    private static int enterInteger() {
        System.out.print("Enter Integer: ");
        int n = sc.nextInt();
        return n;
    }
    private static List<Integer> convertToBinary(int n){
        List<Integer> binaryList = new ArrayList<>();
        /*
        10 / 2 = 5 0
        5 / 2 = 2 1
        2 / 2 = 1 0
        1 / 2 = 2 1
        1 0 1 0
         */
        while (n > 0){
            int digit = n % 2;
            binaryList.add(digit);
            n /=2;
        }
        return binaryList;
    }
}
