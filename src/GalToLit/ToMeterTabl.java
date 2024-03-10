package GalToLit;

public class ToMeterTabl {
    public static void main(String args[]) {
        double inch, metr;
        int counter;
        counter = 0;
        for (inch = 1; inch <= 144; inch++) {
            metr = inch / 39.37;
            System.out.println(inch + " дюймов равно " +
                    metr + " метров.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
