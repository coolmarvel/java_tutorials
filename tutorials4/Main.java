package tutorials4;

public class Main {
    final static int SECOND = 1000;

    public static void main(String[] args) {
        // 연산자
        // int minute = SECOND / 60;
        // int second = SECOND % 60;
        // System.out.println(minute + "분" + second + "초");

        // 증감연산자
        // int a = 10;
        // System.out.println("현재 a는 " + a + "입니다.");
        // a++;
        // System.out.println("현재 a는 " + a + "입니다.");
        // System.out.println("현재 a는 " + ++a + "입니다.");
        // System.out.println("현재 a는 " + a++ + "입니다.");

        // System.out.println(1 % 3);
        // System.out.println(2 % 3);
        // System.out.println(3 % 3);
        // System.out.println(4 % 3);
        // System.out.println(5 % 3);
        // System.out.println(6 % 3);

        // 비교연산자
        // int a = 50;
        // int b = 50;
        // System.out.println("a와 b가 같은가요? " + (a == b));
        // System.out.println("a가 b보다 큰가요? " + (a > b));
        // System.out.println("a가 b보다 작은가요? " + (a < b));
        // System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a == b) && (a > 30)));
        // System.out.println("a가 50이 아닌가요? " + !(a == 50));

        // 삼항연산자
        // int x = 50;
        // int y = 60;
        // System.out.println("최댓값은 " + max(x, y) + "입니다.");

        // pow()
        // double a = Math.pow(3.0, 20.0);
        // System.out.println("3의 20제곱은 " + (int) a + "입니다.");
    }

    // 삼항연산자
    // 반환형, 함수이름, 매개변수
    // static int max(int a, int b) {
    // int result = (a > b) ? a : b; // 조건 ? 참 : 거짓 => 출력
    // return result;
    // }
}
