package tutorials14;

public class Main extends Parent {

    // 오버라이딩 상속 받아서 함수 재정의
    // 부모에서 final을 정의하면 상속 받아서 오버라이딩 불가능
    // public void show() {
    // System.out.println("Hello");
    // }

    public static void main(String[] args) {
        final int number = 10;
        Main main = new Main();
        main.show();
    }
}
