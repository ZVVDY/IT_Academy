package task.task2.TaskHome3;

import java.util.Scanner;

public class RainbowMain {
    public static void main(String[] args) {
        printTitle();
        scannerNumber();
    }
    public static void scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        int numberColor = scanner.nextInt();
        int numberColorTwo = scanner.nextInt();
        Rainbow myRainbow = new Rainbow();
        //myRainbow.numberColor();
        if (numberColor <= 7 && numberColorTwo <= 7 && numberColor > 0) {

            if (numberColor == numberColorTwo) {
                myRainbow.colorSelection(numberColor);
            }
            else if (numberColor <= 7) {
                myRainbow.colorSelection(numberColor);
            } else if (numberColorTwo <= 7) {
                myRainbow.colorSelectionTwo(numberColorTwo);
            } else {
                System.out.println("Вы ввели не верное число");
            }
        }
    }
    public static void printTitle() {
        System.out.println("Программа Радуга" + "\nВведите цифру цвета, через пробел, для вывода на консоль:");
        System.out.println("1.Красный" + "\n2.Оранжевы" + "\n3.Желтый" + "\n4.Зеленый");
        System.out.println("5.Голубой" + "\n6.Синий" + "\n7.Фиолетовый");

    }
}









