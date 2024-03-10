package GalToLit;

import java.util.Scanner;

public class GalToLit {
    public static void main(String args[]) {
        double gallons; //  значение объем в галлонах
        double liters; // значение объем в литрах

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число > 0, которое вы хотите преобразовать в литры:");
        gallons = scan.nextDouble(); // Ввод значения в галлонах
            // gallons = 10; // начальное значение соответствует 10 галлонам
        liters = gallons * 3.7854; // перевести в литры
        System.out.println(gallons + " галлонам соответствует " +
                    liters + " литров");

    }
}
