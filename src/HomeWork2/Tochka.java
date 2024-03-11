package HomeWork2;

import java.util.Scanner;

public class Tochka {
    public static void main(String [] args) {
        int space = 0;
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа (если хотите завершить ввод введите (.): ");
        while (true){
            ch = scan.next().charAt(0);
            if (ch == '.') {
                break;
            } else {
                space++;
            }

        }
        System.out.println("Пробелов=" + space);
                }
    }


