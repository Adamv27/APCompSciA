public class Fraction {
    public int num, den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }
    public static void addition(Fraction a, Fraction b) {
        System.out.print(a.num + "/" + a.den + " + " + b.num + "/" + b.den + " = ");

        int newNum = (a.num * b.den) + (b.num * a.den);
        int newDen = a.den * b.den;

        System.out.println(newNum + "/" + newDen);

    }
    public static void subtraction(Fraction a, Fraction b) {
        System.out.print(a.num + "/" + a.den + " - " + b.num + "/" + b.den + " = ");
        int newNum = (a.num * b.den) - (b.num * a.den);
        int newDen = a.den * b.den;
        System.out.println(newNum + "/" + newDen);
    }
    public static void division(Fraction a, Fraction b){
        System.out.print(a.num + "/" + a.den + " / " + b.num + "/" + b.den + " = ");
        int newNum = a.num * b.den;
        int newDen = a.den * b.num;
        System.out.println(newNum + "/" + newDen);
    }
    public static void multiplication(Fraction a, Fraction b) {
        System.out.print(a.num + "/" + a.den + " x " + b.num + "/" + b.den + " = ");
        int newNum = a.num * b.num;
        int newDen = a.den * b.den;
        System.out.println(newNum + "/" + newDen);

    }
}
