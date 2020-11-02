import java.util.Scanner;

/**
 * @author Grigory Gasparov
 */
public class Calculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение");
        String text = sc.nextLine().toUpperCase();

        try {
            if (Validation.isArOrRom(text)) {
                Func.metodRome(text);
            } else {
                Validation.count = 0;
                Func.metodArab(text);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Вы ввели значение не правильно");
        }
    }
}



