package task.task10;

/**
 * Создание меню Магазина
 */
public class Menu {

    public static void go() throws RuntimeException {
        System.out.println("Добро пожаловать в магазин");
        System.out.println("ПРОДУКТЫ");
        System.out.println("Введите T ,чтобы просмотреть список товаров, чтобы выйти из магазина введите end");
        Shop run = new Shop();
        try {
            run.scannerProduct();
        } catch (RuntimeException e) {
            throw new RuntimeException("Не сработал метод сканнера");
        }
    }

}








