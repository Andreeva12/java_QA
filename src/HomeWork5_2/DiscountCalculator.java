package HomeWork5_2;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAmount = 0;
        System.out.println("Введите цены купленных товаров (для завершения введите 0): ");

        while (true) {
            double price = scanner.nextDouble();
            if (price == 0) {
                break;
            }
            totalAmount += price;
        }

        System.out.printf("Первоначальная  сумма купленных товаров без скидки: %.2f lei\n", totalAmount);

        double discount = 0;
        if (totalAmount > 10000) {
            discount = 0.20; // 20% скидка
        } else if (totalAmount > 1000) {
            discount = 0.10; // 10% скидка
        }

        double savings = totalAmount * discount;
        double finalAmount = totalAmount - savings;

        if (discount > 0) {
            System.out.printf("Поздравляем! Вы сэкономили %.2f lei\n", savings);
            System.out.printf("Сумма к оплате с учетом скидки: %.2f lei\n", finalAmount);
        } else {
            double amountRequiredForDiscount = totalAmount <= 1000 ? 1000 - totalAmount : 10000 - totalAmount;
            System.out.printf("Потратьте ещё %.2f lei, чтобы получить %s скидку. Хотите продолжить?%n", amountRequiredForDiscount, totalAmount <= 1000 ? "свою первую" : "большую");
        }

        scanner.close();
    }
}
