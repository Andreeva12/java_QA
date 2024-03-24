package HomeWork5_2;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        System.out.println("Введите ваш пол (F - женщина, M - мужчина):");
        char gender = scanner.next().charAt(0);

        int retirementAge = (gender == 'F') ? 65 : 70; // определяем пенсионный возраст в зависимости от пола

        if (age < retirementAge) {
            int yearsLeft = retirementAge - age;
            System.out.println("До выхода на пенсию осталось " + yearsLeft + " лет.");
        } else {
            int yearsAgo = age - retirementAge;
            System.out.println("Вы вышли на пенсию " + yearsAgo + " лет назад.");
        }
    }
}

