package HomeWork2;

import java.util.Scanner;

//преобразовывать строчные буквы в прописные, а прописные - в строчные
public class Leters {
    public static void main(String [] args) {
        int simbols = 0;
        char ch;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите символ, если хотите завершить ввод введите (.): ");
            ch = scan.next().charAt(0);
            if (ch >= 'a' && ch <= 'z') { //буква большая или маленькая
                ch -= 32; //строчную в прописную
                simbols++;
            } else if (ch >= 'A' && ch <= 'Z') { //прописная ли буква
                ch += 32; //прописную в строчн
                simbols++;
            }
            System.out.println("Результат: " + ch);
        }
        while (ch != '.');

        System.out.println("Число измененных символов =" + simbols);
    }
}
