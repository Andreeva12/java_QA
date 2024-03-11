package HomeWork2;

public class LogicalOpTable {

    public static int toint(boolean b) {
        return b ? 1 : 0;
    }
    public static void main(String args[]) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(toint(p) + "\t" + toint(q) + "\t");
        System.out.print(toint((p & q)) + "\t" + toint((p | q)) + "\t");
        System.out.println(toint((p ^ q)) + "\t" + toint(!p));

        p = true; q = false;
        System.out.print(toint(p) + "\t" + toint(q) + "\t");
        System.out.print(toint((p & q)) + "\t" + toint((p | q)) + "\t");
        System.out.println(toint((p ^ q)) + "\t" + toint(!p));

        p = false; q = true;
        System.out.print(toint(p) + "\t" + toint(q) + "\t");
        System.out.print(toint((p & q)) + "\t" + toint((p | q)) + "\t");
        System.out.println(toint((p ^ q)) + "\t" + toint(!p));

        p = false; q = false;
        System.out.print(toint(p) + "\t" + toint(q) + "\t");
        System.out.print(toint((p & q)) + "\t" + toint((p | q)) + "\t");
        System.out.println(toint((p ^ q)) + "\t" + toint(!p));
    }
}
