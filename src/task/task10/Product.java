package task.task10;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Product extends Order {
    private Integer id;
    private String nameProduct;
    private String dateManufacture;
    protected Map<Integer, Product> allProduct = new LinkedHashMap<>();

    public void creatingWarehouseGoods() {
        Product moloko = new Product(123456, "Молоко", "24.11.22");
        Product bread = new Product(147899, "Хлеб", "23.11.22");
        Product apple = new Product(1011144, "Яблоко", "20.11.22");
        Product flour = new Product(155266, "Мука", "19.11.22");
        Product sausage = new Product(1458989, "Колбаса", "20.11.22");
        Product sugar = new Product(14566696, "Сахар", "01.11.22");
        Product salt = new Product(1458996, "Соль", "02.11.22");
        allProduct.put(1, moloko);
        allProduct.put(2, bread);
        allProduct.put(3, apple);
        allProduct.put(4, flour);
        allProduct.put(5, sausage);
        allProduct.put(6, sugar);
        allProduct.put(7, salt);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resources/productall.txt", false))) {
            oos.writeObject(allProduct.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void orderTovar() {
        System.out.println("Ваш заказ");
        System.out.println("Введите 0, что бы удалить заказ и 8 , что бы сохранить заказ");
        Integer number;
        while (true) {
            number = scan.nextInt();

            if (number == 1) {

                orders.add(allProduct.get(1));
                System.out.println(orders);
            }
            if (number == 2) {

                orders.add(allProduct.get(2));
                System.out.println(orders);
            }
            if (number == 3) {

                orders.add(allProduct.get(3));
                System.out.println(orders);
            }
            if (number == 4) {

                orders.add(allProduct.get(4));
                System.out.println(orders);
            }
            if (number == 5) {

                orders.add(allProduct.get(5));
                System.out.println(orders);
            }
            if (number == 6) {

                orders.add(allProduct.get(6));
                System.out.println(orders);
            }
            if (number == 7) {

                orders.add(allProduct.get(7));
                System.out.println(orders);

            }
            if (number == 0) {
                orders.clear();
                System.out.println("Заказ удален");
                System.out.println("Новый заказ ");
            }
            if (number == 8) {
                productOrder();
                System.out.println("Заказ сохранен");
            }
        }
    }

    public String wreateWarehouseGoods() throws Exception {

        File file = Path.of("resources/productall.txt").toFile();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String objects = br.lines()
                    .collect(Collectors.joining("\n"));
            return objects;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Product(Integer id, String nameProduct, String dateManufacture) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.dateManufacture = dateManufacture;
    }

    @Override
    public String toString() {
        return "Продукт{" +
                "id=" + id +
                ", Название продукта='" + nameProduct + '\'' +
                ", Дата изготовления='" + dateManufacture + '\'' +
                '}' + '\n';
    }

    public Product() {

    }
}

