package lvl_3;
import java.util.Scanner;

public class Lesson_6 {
    public void triangleTrue() {
        String TRIANGLE_EXISTS = "треугольник существует";
        String TRIANGLE_NOT_EXISTS = "треугольник не существует";
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean first = x < y + z;
        boolean second = y < x + z;
        boolean third = z < y + x;

        if (first && second && third) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
    public void workOrNot() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60)
            System.out.println("можно не работать");

    }
    public void coordinateQuarters() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        }
        if (x < 0 && y > 0) {
            System.out.println("2");
        }
        if (x < 0 && y < 0) {
            System.out.println("3");
        }
        if (x > 0 && y < 0) {
            System.out.println("4");
        }
    }
}
