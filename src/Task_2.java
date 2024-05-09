import java.util.InputMismatchException;
import java.util.Scanner;
public class Task_2 {

    public static int findMinimum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
    public void OAR() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nОберіть дію:");
            System.out.println("1. Ввести значення");
            System.out.println("2. Перейти до іншого завдання");
            System.out.print("\nВаш вибір: ");

            int choice;
            try {
                choice = scanner.nextInt();
                if (choice == 1) {
                    int num1, num2, num3;
                    while (true) {
                        try {
                            System.out.println("\nВведіть перше число: ");
                            num1 = scanner.nextInt();

                            System.out.println("\nВведіть друге число: ");
                            num2 = scanner.nextInt();

                            System.out.println("\nВведіть третє число: ");
                            num3 = scanner.nextInt();

                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("\nНеправильний ввід! Будь ласка, введіть число.");
                            scanner.next();
                        }
                    }

                    int minNumber = findMinimum(num1, num2, num3);
                    System.out.println("\nНайменше число: " + minNumber);
                } else if (choice == 2) {
                    System.out.println(" ");
                    break;
                } else {
                    System.out.println("\nНевідома опція. Спробуйте ще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть число від 1 до 2.");
                scanner.next();
            }
        }
    }
}