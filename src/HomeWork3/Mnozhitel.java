package HomeWork3;

import java.util.Scanner;

public class Mnozhitel {


    public static void main(String[] args) {


        int num;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Введите число:%n");

        num = scan.nextInt();

        System.out.printf("%d is a product of:%n", num);

        boolean hasMultipliers = false;

        // Поиск всех уникальных пар множителей числа
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) { // Проверка, является ли i множителем числа num
                int j = num / i; // Вычисление второго множителя
                if (i <= j) { // Проверка на уникальность пары множителей
                    System.out.printf("%d and %d%n", i, j); // Вывод уникальной пары множителей
                    hasMultipliers = true;
                }
            }
        }

        // Проверка наличия множителей
        if (!hasMultipliers) {
            // Вывод сообщения о том, что число является простым
            System.out.printf("The number %d has no multipliers,"
                    + "so it is a prime number. "
                    + "A prime number (or a prime) is a natural"
                    +" number greater than 1 that is not a product"
                    + "of two smaller natural numbers.%n", num);
        }
    }
}
