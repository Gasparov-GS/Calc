/**
 * движок калькулятора
 *
 * @author Grigory Gasparov
 */
public class Engine {

    /**
     * выполняет арифметические операци
     *
     * @param a
     * @param b
     * @param ch
     * @return результат вычисления
     *
     */
    public static  String eng(int a, int b, char ch) {
        if (a == 0 || b == 0) {
           throw new IllegalArgumentException();
        }

        if (String.valueOf(ch).contains("+")) return String.valueOf(a + b);
        else if (String.valueOf(ch).contains("-")) return String.valueOf(a - b);
        else if (String.valueOf(ch).contains("*")) return String.valueOf(a * b);
        else if (String.valueOf(ch).contains("/")) return String.valueOf(a / b) ;
        else throw new IllegalArgumentException();
    }

}
