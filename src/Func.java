public class Func {

    /**
     * метод для арабских цифр
     *
     * @param text строка введенная с клавиатуры
     */
    public static void metodArab(String text) {
        int x;
        int y;

        String calculate = text;
        calculate = calculate.replace(" ", "" );
        char[] value = calculate.toCharArray();
        String delimetr = String.valueOf(Validation.getDel(value));
        String spdel = Validation.splitDel(delimetr.toCharArray()[0]);

        String[] afterDelim = calculate.split(spdel);
        x = Integer.parseInt(afterDelim[0]);
        y = Integer.parseInt(afterDelim[1]);


        if ((x > 0 &x < 11)&(y > 0 & y < 11)) {
            System.out.print("Результат: ");
            System.out.println(Engine.eng(x, y, delimetr.toCharArray()[0]));
        }
        else System.out.println( "Число превышает допустимые значения");
    }

    /**
     * метод если цифры римские
     *
     * @param text строка введенная с клавиатуры
     */
    public static void metodRome(String text) {
    Validation.count = 0;
    Validation.countRome = 0;
    if (Validation.isArOrRom(text)) {
        String [] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        int x = 0;
        int y = 0;
        text = text.replaceAll(" ", "");
        char[] value = text.toCharArray();
        Validation.count = 0;
        String delimetr = String.valueOf(Validation.getDel(value));
        String spdel = Validation.splitDel(delimetr.toCharArray()[0]);
        String[] afterDelim = text.split(spdel);

        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(afterDelim[0])) {
                x = i + 1;
            }
            if (rome[i].equals(afterDelim[1])) {
                y = i + 1;
            }
        }
      
        if ((x > 0 &x < 11)&(y > 0 & y < 11)) {
            System.out.print("Результат: ");
            System.out.println(Validation.convertIntegerToRoman(Integer.parseInt(Engine.eng(x, y, delimetr.toCharArray()[0]))));
        }
        else System.out.println( "Число превышает допустимые значения");
    } else {
        throw new IllegalArgumentException();
    }
    }
}
