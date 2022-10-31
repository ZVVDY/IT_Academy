package task.task2.TaskHome5;

import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

import static task.task2.TaskHome5.RandomNumberAndSymbol.*;

public class WorkArrays {

    public static String[][] stringsMatrix = new String[10][10];
    public static String[] oneDiaganal = new String[10];
    public static String[] twoDiaganal = new String[10];
    public static String[] newStringMatrix = new String[20];
    public static String[] finalStringMatrix;
    public static StringBuilder builderStringAndArray = new StringBuilder();

    public static void runnerProgram() {
        createMatrixDoubleText();
        comparisonOfDiagonals();
        comparisonOfArrayDiagonals();
        copyingDiagonalsNewArray();
        printStringsAndDoubles();
        printFirstMatrix();
    }

    public static void createMatrixDoubleText() {
        int arrayFillNumber = 0;
        for (int i = 0; i < stringsMatrix.length; i++) {
            for (int j = 0; j < stringsMatrix.length; j++) {
                arrayFillNumber++;
                if (arrayFillNumber % 3 == 0) {
                    stringsMatrix[i][j] = String.valueOf(doubleRandom());

                } else {

                    stringsMatrix[i][j] = symbolRandomN();
                }
            }
        }
    }

    public static void comparisonOfDiagonals() {

        int counterNumberDiaganal = 0;
        for (int i = 0; i < stringsMatrix.length; i++) {
            for (int j = 0; j < stringsMatrix.length; j++) {
                if (i == j) {
                    oneDiaganal[counterNumberDiaganal] = stringsMatrix[i][j];
                }
            }
            counterNumberDiaganal++;
        }
        counterNumberDiaganal = 0;
        for (int i = 0; i < stringsMatrix.length; i++) {
            for (int j = 0; j < stringsMatrix.length; j++) {
                if (i == i && j == 9 - counterNumberDiaganal) {
                    twoDiaganal[counterNumberDiaganal] = stringsMatrix[i][j];
                }
            }
            counterNumberDiaganal++;
        }
    }

    public static void comparisonOfArrayDiagonals() {

        if (Arrays.equals(oneDiaganal, twoDiaganal)) {
            System.out.println("Диагонали равны");
        } else {
            System.out.println("Диагонали не равны");
        }
    }

    public static void copyingDiagonalsNewArray() {

        int counter = 0;
        for (int i = 0; i < newStringMatrix.length; i++) {
            if (i < oneDiaganal.length) {
                newStringMatrix[i] = oneDiaganal[i];

            } else {
                newStringMatrix[i] = twoDiaganal[counter];
                counter++;
            }
        }
    }

    public static void printStringsAndDoubles() {

        double tempArrayForDouble[] = new double[newStringMatrix.length];
        int countOfDouble = -1;
        for (int i = 0; i < newStringMatrix.length; i++) {

            if (!newStringMatrix[i].contains(".")) {
                String substring = newStringMatrix[i].substring(2, 4);
                if (!builderStringAndArray.isEmpty()) {
                    builderStringAndArray.append(", ");
                }
                builderStringAndArray.append(substring);
            } else {
                double doubleOfArray = Double.parseDouble(newStringMatrix[i]);
                double roundedNumber = Math.round(doubleOfArray);
                countOfDouble++;
                tempArrayForDouble[countOfDouble] = roundedNumber;
            }
        }
        finalStringMatrix = new String[countOfDouble + 1];
        for (int i = 0; i <= countOfDouble; i++) {
            finalStringMatrix[i] = String.valueOf(tempArrayForDouble[i]);
        }
        System.out.println(builderStringAndArray);
        System.out.println();
        System.out.println(String.join("_", finalStringMatrix));
        System.out.println();
    }

    public static void printFirstMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + stringsMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}








