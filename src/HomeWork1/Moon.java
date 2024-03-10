package HomeWork1;

import java.util.Scanner;

public class Moon {
    public static void main(String args[]) {
        double earthw;
        double moonw;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш вес: ");
        earthw = scan.nextDouble();
        moonw = earthw * 0.17;
        System.out.println(earthw + " кг. Значит на луне вы будете весить: " + moonw);


    }
}
