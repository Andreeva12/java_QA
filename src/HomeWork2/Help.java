package HomeWork2;

//import java.util.Scanner;

public class Help {
    public static void main(String args[]) {
        char choice;
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Bыбepитe: ");
//        Scanner scan = new Scanner(System.in);
//        char choice = scan.next().charAt(0);

        choice = (char) System.in.read();
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Oпepaтop if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            default:
                System.out.print("Зaпpoc не найден.");
        }
    }
}
