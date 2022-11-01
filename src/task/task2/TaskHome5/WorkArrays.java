package task.task2.TaskHome5;

import java.util.Arrays;

import static task.task2.TaskHome5.RandomNumberAndSymbol.*;

/**
 * Класс выполняет работу с матрицами и ее диагоналями
 */
public class WorkArrays {
    private String[][] stringsMatrix = new String[10][10];
    private String[] oneDiaganal = new String[10];
    private String[] twoDiaganal = new String[10];
    private String[] newStringMatrix = new String[20];
    private String[] finalStringMatrix;
    private StringBuilder builderStringAndArray = new StringBuilder();

    /**
     * Метод создания матрицы
     */
    public void createMatrixDoubleText() {
        int arrayFillNumber = 0;
        for (int i = 0; i < stringsMatrix.length; i++) {
            for (int j = 0; j < stringsMatrix.length; j++) {
                arrayFillNumber++;
                if (arrayFillNumber % 3 == 0) {
                    stringsMatrix[i][j] = String.valueOf(doubleRandom(3)).substring(0, 7);

                } else {

                    stringsMatrix[i][j] = symbolRandomN();
                }
            }
        }
        comparisonOfDiagonals();
    }

    /**
     * Метод извлечения диагоналей для сравнения
     */
    public void comparisonOfDiagonals() {

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
        comparisonOfArrayDiagonals();
    }

    /**
     * Метод сравнения диагоналей
     */
    public void comparisonOfArrayDiagonals() {

        if (Arrays.equals(oneDiaganal, twoDiaganal)) {
            System.out.println("Диагонали равны");
        } else {
            System.out.println("Диагонали не равны");
        }
        copyingDiagonalsNewArray();
    }

    /**
     * Метод копирования диагоналей в новый массив
     */
    public void copyingDiagonalsNewArray() {

        int counter = 0;
        for (int i = 0; i < newStringMatrix.length; i++) {
            if (i < oneDiaganal.length) {
                newStringMatrix[i] = oneDiaganal[i];

            } else {
                newStringMatrix[i] = twoDiaganal[counter];
                counter++;
            }
        }
        printStringsAndDoubles();
    }

    /**
     * Метод извлечения символов и округления с выводом в консоль
     */
    public void printStringsAndDoubles() {

        double tempArrayForDouble[] = new double[newStringMatrix.length];
        int countOfDouble = -1;
        double roundedNumber;
        for (int i = 0; i < newStringMatrix.length; i++) {

            if (!newStringMatrix[i].contains(".")) {
                String substring = newStringMatrix[i].substring(2, 4);
                if (!builderStringAndArray.isEmpty()) {
                    builderStringAndArray.append(", ");
                }
                builderStringAndArray.append(substring);
            } else {
                double doubleOfArray = Double.parseDouble(newStringMatrix[i]);
                if (doubleOfArray > 1.7) {
                    roundedNumber = Math.ceil(doubleOfArray);
                } else {
                    roundedNumber = Math.floor(doubleOfArray);
                }
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
        printFirstMatrix();
    }

    /**
     * Метод вывода в консоль первоначальной матрицы
     */
    public void printFirstMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + stringsMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}








