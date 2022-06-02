package tutorials15;

public class Main implements Dog, Cat {
    // interface는 상속 받을때 extends를 안쓰고 implements를 사용
    // interface는 다중 상속이 가능 / abstract로 extends를 사용하면 단일상속
    public static void main(String[] args) {

        Main main = new Main();
        main.crying();
        main.show();
        main.two();
        main.one();

    }

    @Override
    public void crying() {
        System.out.println("멍멍!");
    }

    @Override
    public void show() {
        System.out.println("Hello World!");
    }

    @Override
    public void two() {
        System.out.println("냐옹~");
    }

    @Override
    public void one() {

    }
}
