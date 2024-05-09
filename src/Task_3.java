import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {

    public void OAA() {

        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("\nВиберіть дію:");
            System.out.println("1. Ввести значення");
            System.out.println("2. Перейти до іншого завдання");
            System.out.print("\nВаш вибір: ");

            int choice;

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть 1 або 2.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    processInput(scanner);
                    break;
                case 2:
                    continueInput = false;
                    break;
                default:
                    System.out.println("\nНевідома опція. Спробуйте ще раз.");
            }
        }

        System.out.println(" ");
    }

    private void processInput(Scanner scanner) {
        System.out.println("\nВведiть розмiр масиву:");
        int size = 0;
        boolean isValidInput = false;


        while (!isValidInput) {
            try {
                size = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                scanner.nextLine();
            }
        }

        int[] array = new int[size];

        System.out.println("\nВведiть елементи масиву:");
        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            isValidInput = false;

            while (!isValidInput) {
                try {
                    array[i] = scanner.nextInt();
                    isValidInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                    scanner.nextLine();
                }
            }
        }

        System.out.println("\nВведений масив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}