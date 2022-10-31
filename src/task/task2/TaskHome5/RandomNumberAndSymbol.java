package task.task2.TaskHome5;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumberAndSymbol {
    public static String randomNumber = doubleRandom();
    public static String randomSymbol = symbolRandomN();

    public static String doubleRandom() {
        Random random = new Random();

        double numRand = random.nextDouble() + 1;
        String formattedDouble = new DecimalFormat("#0.00000").format(numRand);
        //System.out.println(formattedDouble);
        return formattedDouble;

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
