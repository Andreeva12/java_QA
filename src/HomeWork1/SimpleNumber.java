package HomeWork1;

public class SimpleNumber {
    public static void main(String[] args) {
        // Перебираем числа от 2 до 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // Предполагаем, что число простое
            // Перебираем числа от 2 до i-1
            for (int j = 2; j < i; j++) {
                // Если i делится нацело на j, то i не является простым числом
                if (i % j == 0) {
                    isPrime = false; // Отмечаем, что число не простое
                    break; // Выходим из цикла, так как уже найден делитель
                }
            }
            // Если число осталось простым после всех проверок, выводим его
            if (isPrime) {
                System.out.println(i + " - простое число");
            }
        }
    }
}
