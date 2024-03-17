package HomeWork3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();
        int res;

        System.out.print("Действие: ");

        scanner.nextLine();

        String action = scanner.nextLine(); // Считываем действие как строку

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.printf("Сумма: %d\n", res);
                break;
            case "-":
                res = num1 - num2;
                System.out.printf("Разность: %d\n", res);
                break;
            case "*":
                res = num1 * num2;
                System.out.printf("Произведение: %d\n", res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.printf("Результат деления: %d\n", res);
                }
                break;
            default:
                System.out.println("Вы что-то не то ввели.");
        }

        // Среднее значение
        double average = (double) (num1 + num2) / 2;
        System.out.printf("Среднее значение: %.2f\n", average);

        // Результат сравнения
        if (num1 > num2)
            System.out.printf("%d больше, чем %d\n", num1, num2);
        else if (num1 < num2)
            System.out.printf("%d меньше, чем %d\n", num1, num2);
        else
            System.out.printf("%d равно %d\n", num1, num2);
    }
}
