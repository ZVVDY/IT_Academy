package task.task10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Order {
    private Integer idOrder;
    private Date dateOrder;
    public static Scanner scan = new Scanner(System.in);
    public List<Product> orders = new ArrayList<>();

    public void productOrder() {
        Random random = new Random();
        setIdOrder(random.nextInt(1, 100));
        setDateOrder(new Date());
        try (ObjectOutputStream order = new ObjectOutputStream(new FileOutputStream("resources/orderall.txt", true))) {
            order.writeObject("\n" + "*******************************");
            order.writeObject(orders.toString());
            order.writeObject("\n" + "Дата заказа: " + getDateOrder() + "\n" + "Номер заказа:" + getIdOrder());
            order.writeObject("\n" + "*******************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }
}




