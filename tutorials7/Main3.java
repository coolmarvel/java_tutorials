package tutorials7;

import java.util.Scanner;

public class Main3 {
    // 사용자 정의 함수
    // 문자열에서 마지막 단어를 반환하는 함수
    public static char function(String input) {
        return input.charAt(input.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력해주세요 : ");
        String i = sc.nextLine();
        System.out.println("입력하신 단어의 마지막 단어는 : " + function(i));
        sc.close();
    }
}
