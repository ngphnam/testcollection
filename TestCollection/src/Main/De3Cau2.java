package Main;

import java.util.*;

public class De3Cau2 {
    static Scanner sc = new Scanner(System.in);
    public static void cau2() {
        System.out.println("Chuỗi sau khi xoá các phần tử trùng nhau: " + removeDuplicates(enterString()));
    }
    private static String enterString(){
        System.out.println("Nhập vào một chuỗi: ");
        String input = sc.nextLine();
        return input;
    }
    private static StringBuilder removeDuplicates(String input) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charSet.add(ch)) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder;
        //.toString();


    }
}
