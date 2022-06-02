package tutorials16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("바나나 : 1, 복숭아 : 2 \n => 확인 하고 싶은 정보의 index를 입력해주세요 \n: ");
        int input = sc.nextInt();
        Fruit fruit;
        if (input == 1) {
            fruit = new Banana();
            fruit.show();

        } else if (input == 2) {
            fruit = new Peach();
            fruit.show();
        }
        ;
        sc.close();
    }
}
