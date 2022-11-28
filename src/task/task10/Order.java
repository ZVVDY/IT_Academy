package task.task10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;


public class Order {
    private Integer idOrder;
    private Date dateOrder;
    public static Scanner scan = new Scanner(System.in);
    public List<Product> orders = new ArrayList<Product>();

    public void productOrder() {
        Random random = new Random();
        idOrder = random.nextInt(1, 100);
        dateOrder = new Date();
        try (ObjectOutputStream order = new ObjectOutputStream(new FileOutputStream("resources/orderall.txt", true))) {
            order.writeObject(orders.toString());
            order.writeObject("\n" + "Дата заказа: " + dateOrder + "\n" + "Номер заказа:" + idOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}


