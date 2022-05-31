package tutorials6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수를 입력하세요 : ");
        // int i = sc.nextInt();
        // System.out.println("입력된 정수는 : " + i + "입니다.");
        // sc.close();

        File file = new File("input.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 100);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽어오는 도중 에러 발생");
        }
    }
}
