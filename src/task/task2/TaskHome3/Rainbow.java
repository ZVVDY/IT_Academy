package task.task2.TaskHome3;

public class Rainbow {
    public static final String RED = "red";
    public static final String ORANGE = "orange";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";
    public static final String INDIGO = "indigo";
    public static final String VIOLET = "violet";

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
                printColor(INDIGO);
                break;
            case 7:
                printColor(VIOLET);
                break;
            default:
                printColor("Такого цвета не существует. Вы ввели не верное число");
        }

        return number;

    }

    public void printColor(String textColor) {
        System.out.print(textColor);
    }
    public void printColorTerminal(int numberPrint, int numberPrintTwo, int numberColors) {
        if (numberColors == 1 || numberPrint==numberPrintTwo) {
            colorSelection(numberPrint);}
        else {
            colorSelection(numberPrint);
            System.out.print(" - ");
            colorSelection(numberPrintTwo);
        }

    }
}