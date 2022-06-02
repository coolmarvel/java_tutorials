package tutorials12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Student student1 = new Student("이성현", 26, 181, 81, "2016100952", 4, 3.89);
        // Student student2 = new Student("김혜린", 28, 159, 49, "2015101208", 4, 4.4);

        // Teacher teacher = new Teacher("이창희", 44, 175, 79, "2011151511", 275, 5);

        // student1.show();
        // student2.show();
        // teacher.show();

        // Student[] students = new Student[100];
        // for (int i = 0; i < 100; i++) {
        // students[i] = new Student("홍길동", 20, 180, 75, i + " ", 1, 4.5);
        // students[i].show();
        // ;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("총 몇명의 학생이 존재합니까?");

        int number = sc.nextInt();
        Student[] students = new Student[number];

        for (int i = 0; i < number; i++) {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double gPA;

            System.out.print("학생의 이름을 입력하세요 : ");
            name = sc.nextLine();
            System.out.print("학생의 나이를 입력하세요 : ");
            age = sc.nextInt();
            System.out.print("학생의 키를 입력하세요 : ");
            height = sc.nextInt();
            System.out.print("학생의 몸무게를 입력하세요 : ");
            weight = sc.nextInt();
            System.out.print("학생의 학번을 입력하세요 : ");
            studentID = sc.next();
            System.out.print("학생의 학년을 입력하세요 : ");
            grade = sc.nextInt();
            System.out.print("학생의 학점을 입력하세요 : ");
            gPA = sc.nextDouble();

            students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
            sc.close();
        }

        for (int i = 0; i < number; i++) {
            students[i].show();
        }
    }
}
