import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static double calculateArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

    public void AOAC() {
        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\nОберіть опцію:");
            System.out.println("1. Ввести значення");
            System.out.println("2. Перейти до іншого завдання");

            int choice = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("\nВаш вибір: ");
                    choice = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nНеправильний ввід! Будь ласка, введіть число від 1 до 2.");
                    scanner.next();
                }
            }

            switch (choice) {
                case 1:
                    double radius = 0;
                    validInput = false;

                    while (!validInput) {
                        try {
                            System.out.print("\nВведіть радіус кола: ");
                            radius = scanner.nextDouble();
                            validInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("\nНеправильний ввід! Будь ласка, введіть число.");
                            scanner.next();
                        }
                    }

                    double area = calculateArea(radius);
                    System.out.println("\nПлоща кола з радіусом " + radius + " дорівнює:\n " + area);
                    break;

                case 2:
                    System.out.println(" ");
                    continueLoop = false;
                    break;

                default:
                    System.out.println("Невідома опція. Спробуйте ще раз.");
                    break;
            }
        }
    }
}