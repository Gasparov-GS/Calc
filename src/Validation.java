/**
 * Содержит методы для валидации строки
 *
 * @author Grigory Gasparov
 */
public class Validation {
    static int count = 0;
    static int countRome = 0;

    /**
     * перевести арабскую цифру в римскую
     *
     * @param number арабская цифра
     * @return римская цифра
     */
    static String convertIntegerToRoman(int number) {
        int[] numbers = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
        String[] letters = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
        StringBuilder romanValue = new StringBuilder();
        int n = number;

        while (n > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (n < numbers[i]) {
                    n -= numbers[i - 1];
                    romanValue.append(letters[i - 1]);
                    break;
                }
            }
        }
        return romanValue.toString();
    }

    /**
     * проверить являються ли все числа римскими
     *
     * @param text строка введенная с клавиатуры
     * @return boolean
     */
    public static boolean isArOrRom(String text) {
        String [] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        int x = 0;
        int y = 0;

        char[] value = text.toCharArray();
        String delimetr = String.valueOf(Validation.getDel(value));
        String spdel = Validation.splitDel(delimetr.toCharArray()[0]);
        String[] afterDelim = text.split(spdel);
        boolean isArOrRom = false;

        for (String s : rome) {
            if (s.equals(afterDelim[0])) {
                Validation.countRome++;
            }
            if (s.equals(afterDelim[1])) {
                Validation.countRome++;
            }

            if (countRome == 2) {
                isArOrRom = true;
            }
        }
      return isArOrRom;
    }

    /**
     * если арифметический символ введен один раз, то получим его из строки
     *
     * @param value массив символов, полученный из строки
     * @return символ
     */

    public static char getDel(char[] value) {
        char result = '9';

        for (char c : value) {
            switch (c) {
                case ('+'), ('-'), ('/'), ('*') -> {
                count++;
                    result = c;
                }
            }
        }
        if (count == 1) return result;
        else throw new IllegalArgumentException();
    }
    /**
     * экранировать символы для разделителя строки
     *
     * @param ch символ со строки
     * @return арифметический знак
     */
    public static String splitDel(char ch) {
        if (String.valueOf(ch).contains("+"))  return "\\+";
        else if (String.valueOf(ch).contains("-"))return "-";
        else if (String.valueOf(ch).contains("*")) return "\\*";
        else if (String.valueOf(ch).contains("/")) return "/";
        else throw new IllegalArgumentException();
    }
}



