package tutorials8;

public class Main {
    // 반복 함수 (팩토리얼)
    public static int factorial(int number) {
        int sum = 1;
        for (int i = 2; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }

    // 재귀 함수 (팩토리얼)
    public static int factorial2(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial2(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("10!은 " + factorial(10) + "입니다.");
        System.out.println("10!은 " + factorial2(5) + "입니다.");
    }
}
