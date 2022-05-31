package tutorials5;

public class Main {
    final static int N = 30;
    final static int M = 15;

    public static void main(String[] args) {
        // 조건문(if문)
        // String a = "I Love You";
        // if (a.contains("Love")) {
        // System.out.println("Me too.");
        // } else {
        // System.out.println("I Hate You.");
        // }

        // int score = 95;
        // if (score >= 95) {
        // System.out.println("A+");
        // } else if (score >= 80) {
        // System.out.println("B+");
        // } else if (score >= 70) {
        // System.out.println("C+");
        // } else {
        // System.out.println("F");
        // }

        // java는 String을 비교할 때 equal()을 이용.
        // 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문.
        // String a = "Man";
        // int b = 0;
        // if (a.equals("man")) {
        // System.out.println("남자입니다.");
        // } else {
        // System.out.println("여자입니다.");
        // }

        // if (b == 3) {
        // System.out.println("b is " + b);
        // } else {
        // System.out.println("3이 아닙니다.");
        // }

        // if (a.equalsIgnoreCase("man") && b == 0) {
        // System.out.println("참입니다.");
        // } else {
        // System.out.println("거짓입니다.");
        // }

        // 반복문
        // int i = 1, sum = 0;
        // while (i <= 1000) {
        // sum += i++;
        // }
        // System.out.println(sum);

        // for (int i = N; i > 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.println("*");
        // }
        // System.out.println();
        // }

        // for (int i = -M; i <= M; i++) {
        // for (int j = -M; j <= M; j++) {
        // if (i * i + j * j <= M * M) {
        // System.out.println("*");
        // } else {
        // System.out.println(" ");
        // }
        // }
        // System.out.println();
        // }

        // 무한루프
        // int count = 0;

        // for (;;) {
        // System.out.println("출력");
        // count++;
        // if (count == 10) {
        // break;
        // }
        // }
    }
}
