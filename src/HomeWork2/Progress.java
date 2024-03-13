package HomeWork2;
/*программу, использующую цикл
for для вывода чисел в геометрической
прогрессии: 1, 2, 4, 8, 16, 32 и т.д.*/
//числа увеличиваются в 2
public class Progress {
    public static void  main(String[] args) {
        int num = 1;
        for (int i = 1; num<100; i++) {
            System.out.println("Elements: " + num);
            num *= 2;
        }
    }
}
