public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(3, 4);

        System.out.println("Дробь: " + fraction);
        System.out.println("intValue: " + fraction.intValue());
        System.out.println("longValue: " + fraction.longValue());
        System.out.println("floatValue: " + fraction.floatValue());
        System.out.println("doubleValue: " + fraction.doubleValue());

        Fraction simplified = new Fraction(12, 16).simplify();
        System.out.println("Упрощенная дробь: " + simplified);
    }
}