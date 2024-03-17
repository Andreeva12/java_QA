package HomeWork3;

import java.util.Scanner;

public class Numbers {
    //ввод вывод чисел пользователем с клавиатуры
    //определить вводимое число на /2
    //использовать метод System.out.printf()
    public static void main(String[] args) {
        int num;
        
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число:%n");
        
        // Считывание числа, введенного пользователем
        num = scan.nextInt();

        // Проверка на четность введенного числа и вывод соответствующего сообщения
        if (num % 2 == 0) {
            System.out.printf("Ваше число %d четное\n", num);
        } else {
            System.out.printf("Ваше число %d нечетное\n", num);
        }
    }
}
