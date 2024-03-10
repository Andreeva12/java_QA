package GalToLit;

public class GalToLitTable {
    public static void main (String args []) {
        double gallons, liters;
        int counter;
        counter = 0;

        // Счетчик строк инициализируется нулевым значением
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // преобразовать в литры
            System.out.println(gallons + " галлонам соответствует " +
                    liters + " liters.");
            counter++;

            //Увеличивать значение счетчика строк на 1 на каждой итерации цикла
            if (counter == 10) { //Если значение счетчика равно 10, вывести пустую строку
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }

}
