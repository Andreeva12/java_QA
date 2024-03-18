package HomeWork5_1;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите значение стороны квадрата:");
        int side = scan.nextInt();

        Square square = new Square(side);

        System.out.println("Площадь квадрата со стороной " + side + ": " + square.calculateArea());
    }
}