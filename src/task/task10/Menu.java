package task.task10;

public class Menu extends Shop {

    public static void go() throws RuntimeException {
        System.out.println("Добро пожаловать в магазин");
        System.out.println("ПРОДУКТЫ");
        System.out.println("Введите T ,чтобы просмотреть список товаров, чтобы выйти из магазина нажмите end");
        Shop run = new Shop();
        run.scannerProduct();

    }

}








