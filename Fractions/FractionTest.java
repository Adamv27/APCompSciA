import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class FractionTest {
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 3);

        Fraction.addition(a, b);
        Fraction.subtraction(a, b);
        Fraction.division(a, b);
        Fraction.multiplication(a, b);
    }
}
