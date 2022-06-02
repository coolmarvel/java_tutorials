package tutorials14;

// final class로 정의하면 어떠한 class에서도 상속받을 수 없게 된다.
public class Parent {
    public final void show() {
        System.out.println("Hi");
    }
}
