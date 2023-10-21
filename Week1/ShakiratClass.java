package Online_Code_Samples.Week1;

public class ShakiratClass implements Shakirat{

    @Override
    public double add(int a, int b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }

    public static void main(String[] args) {
        Shakirat shakirat = new ShakiratClass();

        System.out.println(shakirat.add(35, 45));
        System.out.println(shakirat.subtract(99, 2005.50));
        System.out.println(shakirat.multiply(40, 200));
        System.out.println(shakirat.divide(95, 19.0));
    }
}
