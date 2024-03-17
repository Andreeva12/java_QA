package HomeWork3;

import java.util.Scanner;

public class Language {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Choose one language:");
            System.out.println("  1. English");
            System.out.println("  2. French");
            System.out.println("  3. Russian");
            System.out.println("  4. Italian");
            System.out.println("  5. Polish\n");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while( choice < '1' | choice > '5');

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.printf("'Hello' there will be in English:\n%s\n", "Hello");
                break;
            case '2':
                System.out.printf("'Hello' there will be in French:\n%s\n", "Bonjour");
                break;
            case '3':
                System.out.printf("'Hello' there will be in Russian:\n%s\n", "Привет");
                break;
            case '4':
                System.out.printf("'Hello' there will be in Italian:\n%s\n", "Ciao");
                break;
            case '5':
                System.out.printf("'Hello' there will be in Polish:\n%s\n", "Cześć");
                break;
        }
    }
}
