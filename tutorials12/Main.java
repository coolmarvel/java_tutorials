package tutorials12;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("이성현", 26, 181, 81, "2016100952", 4, 3.89);
        Student student2 = new Student("김혜린", 28, 159, 49, "2015101208", 4, 4.4);

        student1.show();
        student2.show();
    }
}
