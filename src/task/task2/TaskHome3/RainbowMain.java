package task.task2.TaskHome3;

import java.util.Scanner;

public class RainbowMain {
    public static Scanner scanner = new Scanner(System.in);
    static int colorCount;
    static int numberColor;
    static int numberColorTwo;
    public static Rainbow myRainbow = new Rainbow();

    public static void main(String[] args) {
        colorCount();
        scannerNumber(colorCount);
        myRainbow.printColorTerminal(numberColor, numberColorTwo, colorCount);
    }

    public static void colorCount() {
        int numberScanner = 0;
        while (true) {
            System.out.println("Введите колличество цветов");
            numberScanner = scanner.nextInt();
            if (numberScanner < 1 || numberScanner > 2) {
                System.out.println("Вы ввели неверное количество цветов, повторите ввод\n--------------------------------");
            } else {
                colorCount = numberScanner;
                System.out.println("Введенное кол-во цветов равно: " + colorCount);
                break;
            }

        }
    }

    public static void scannerNumber(int count) {
        System.out.println("Введите номер цвета:\n1.Красный\n2.Оранжевы\n3.Желтый\n4.Зеленый" +
                "\n5.Голубой\n6.Синий\n7.Фиолетовый");
        numberColor = scanner.nextInt();
        if (colorCount == 2) {
            System.out.println("Введите второй номер цвета:\n1.Красный\n2.Оранжевы\n3.Желтый\n4.Зеленый" +
                    "\n5.Голубой\n6.Синий\n7.Фиолетовый");
            numberColorTwo = scanner.nextInt();
        }
    }
}














