import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_4 {

    public void RLNA() {
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        do {
            System.out.println("\nВиберіть дію:");
            System.out.println("1. Ввести значення");
            System.out.println("2. Перейти до іншого завдання");
            System.out.print("\nВаш вибір: ");

            int choice;
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        enterValues(scanner);
                        break;
                    case 2:
                        System.out.println(" ");
                        continueInput = false;
                        break;
                    default:
                        System.out.println("\nНевідома опція. Спробуйте ще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНекоректний ввід. Будь ласка, введіть номер вибору.");
                scanner.next();
            }
        } while (continueInput);
    }

    private void enterValues(Scanner scanner) {
        int size;
        do {
            try {
                System.out.println("\nВведiть розмiр масиву: ");
                size = scanner.nextInt();
                if (size <= 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                scanner.next();
            }
        } while (true);

        int[] array = new int[size];

        System.out.println("\nВведiть елементи масиву:");
        for (int i = 0; i < size; i++) {
            do {
                try {
                    System.out.print("Елемент " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                    scanner.next();
                }
            } while (true);
        }

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nНайбiльше число в масивi: " + max);
    }
}