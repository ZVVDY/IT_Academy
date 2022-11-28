package task.task10;

import java.util.Scanner;

public class Shop extends Product {
    public Scanner sc = new Scanner(System.in);
    public String str;

    public void scannerProduct() throws RuntimeException {
        Product clients = new Product();
        clients.creatingWarehouseGoods();

        while (true) {
            str = sc.nextLine();
            if (str.equals("T")) {
                try {
                    System.out.println(clients.allProduct);
                    System.out.println("Введите номер товара для добавления в заказ, " +
                            "чтобы выйти из магазина нажмите end: ");
                    clients.orderTovar();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (!str.equals("T") && !str.equals("end")) {
                System.out.println("Введено не верное число");
            }
            if (str.equals("end")) {
                break;
            }
        }
    }
}

