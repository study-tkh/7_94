import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static long result;

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        long x = enteringNumber();
        System.out.println("Введите натуральное число");
        long n = enteringNumber();
        System.out.println("Ответ: " + involution(x, n));
    }

    private static long involution(long a, long n) {
        if(n == 0) {
            result = 1;
        } else if(n < 0) {
            System.out.println("Ошибка. Введена отрицательная степень");
            System.exit(0);
        } else if (n % 2 == 0) {
            result = involution(a, n / 2) * result;
        } else {
            result = involution(a, (n - 1) / 2) * result * a;
        }
        return result;
    }

    private static int enteringNumber() {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введено недопустимое значение");
            System.exit(0);
        }
        return number;
    }
}
