package task.task2.TaskHome5;

import java.util.Random;

/**
 * Класс для выбора рандомных значений double и символов
 */
public class RandomNumberAndSymbol {
    public static String randomSymbol = symbolRandomN();


    public static double doubleRandom(int number) {
        Random random = new Random();
        //numberTextRandom(1,28);
        return random.nextDouble(number);
    }

    private static int numberTextRandom(int startNum, int endNum) {
        Random random = new Random();
        return random.nextInt(endNum - startNum + 1) + startNum;
    }

    public static String symbolRandomN() {

        int length = 7;
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            int charCode = numberTextRandom(97, 122);
            if (i == 0 || i == 4) {
                text[i] = Character.toUpperCase((char) charCode);
            } else {
                text[i] = (char) charCode;
            }
        }
        return new String(text);
    }

}
