package task.task9;

public class Menu {
    private int arrayOne[] = {12, 42, 64, 86, 96, 168, 298, 720};
    private int arrayTwo[] = {0, 6, 4, 0, 5, 0};

    public static void runner() {
        Menu start = new Menu();
        start.arrayException();
        start.catchArrayExceptionElement();
    }

    public void arrayException() {
        for (int i = 0; i < arrayOne.length; i++) {
            try {
                System.out.println(arrayOne[i] + " / " +
                        arrayTwo[i] + " is " +
                        arrayOne[i] / arrayTwo[i]);
            } catch (ArithmeticException exc) {
                System.out.println("На ноль делить нельзя!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден.");
            } finally {
                System.out.println("Программа работает");
            }
        }
    }

    public void catchArrayExceptionElement() {
        try {
            arrayIndex();
        } catch (NegativeArraySizeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Создание массива невозможно");
        } finally {
            System.out.println("Программа после ошибки создания массива с отрицательным размером,работает");
        }
    }

    public void arrayIndex() throws NegativeArraySizeException {
        int[] arrayTree = new int[-10];
        throw new NegativeArraySizeException();
    }

}




