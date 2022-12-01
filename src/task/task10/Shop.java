package task.task10;

import java.util.Scanner;

public class Shop extends Product {
    public Scanner scanner = new Scanner(System.in);
    public String stringScanner;

    public void scannerProduct() throws RuntimeException {
        creatingWarehouseGoods();
        while (true) {
            stringScanner = scanner.nextLine();
            if (stringScanner.equals("T")) {
                try {
                    printText(wreateWarehouseGoods());
                    printText("Введите номер товара для добавления в заказ, " +
                            "чтобы выйти на данном этапе из меню  магазина введите end: ");
                    orderProduct();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (!stringScanner.equals("T") && !stringScanner.equals("end")) {
                printText("Введено не верный символ");
            }
            if (stringScanner.equals("end")) {
                scanner.close();
                printText("Вы вышли из программы");
                break;
            }
        }
    }
}

