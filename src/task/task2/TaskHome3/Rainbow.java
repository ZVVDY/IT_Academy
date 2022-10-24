package task.task2.TaskHome3;

public class Rainbow {
    public static final String RED = "красный";
    public static final String ORANGE = "оранжевый";
    public static final String YELLOW = "желтый";
    public static final String GREEN = "зеленый";
    public static final String BLUE = "голубой";
    public static final String DARK_BLUE = "синий";
    public static final String PURPLE = "фиолетовый";

    public int colorSelection(int number) {
        switch (number) {
            case 1:
                printColor(RED);
                break;
            case 2:
                printColor(ORANGE);
                break;
            case 3:
                printColor(YELLOW);
                break;
            case 4:
                printColor(GREEN);
                break;
            case 5:
                printColor(BLUE);
                break;
            case 6:
                printColor(DARK_BLUE);
                break;
            case 7:
                printColor(PURPLE);
                break;
            default:
                printColor("Такого цвета не существует. Вы ввели не верное число");
        }

        return number;

    }

    public int colorSelectionTwo(int numberTwo) {
        //int numberw=colorSelection();
        if (numberTwo <= 7) {
            colorSelection(numberTwo);
        } else {
            printColor("Вы ввели неверное число.Введите еще раз!");

        }
        return numberTwo;
    }

    public void printColor(String textColor) {
        System.out.println(textColor);
    }
}