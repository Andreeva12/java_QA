import java.util.Scanner;

public class Sound {
    public static void main(String args[]) {
        double speed = 1100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время до прихода эха (в сек): ");
        double echo = scanner.nextDouble();
        double dist = (speed * echo) /2;
        System.out.println("Расстояние до  скалы " +
                "составляет " + dist + " футов.");
    }
}

