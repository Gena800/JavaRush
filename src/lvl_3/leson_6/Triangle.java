package lvl_3.leson_6;
import java.util.Scanner;

public class Triangle {
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
}
