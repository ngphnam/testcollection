package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class De3Cau1 {
    static Scanner sc = new Scanner(System.in);
    public static void cau1() {
        System.out.println("List vừa nhập: " + enterIntegerList());
    }

    private static List<Integer> enterIntegerList() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Nhập số: ");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        return list;
    }
}
