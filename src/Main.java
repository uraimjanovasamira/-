import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle triangle = new Triangle();
        System.out.println("Введите сантиметр сторон треугольника-");
        triangle.a = scanner.nextInt();
        triangle.b = scanner.nextInt();
        triangle.c = scanner.nextInt();
        triangle.area();


    }
}