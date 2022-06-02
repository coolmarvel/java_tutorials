package tutorials11;

public class Node {
    // Class 기본 정의하기
    // 객체지향 프로그래밍 보안측면 설계
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Node getCenter(Node other) {
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }
}
