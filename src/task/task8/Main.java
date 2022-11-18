package task.task8;

/**
 * Моя реализация MyArrayList
 */
public class Main {
    public static void main(String[] args) {

        MyList<Object> list = new MyArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Table");
        list.add("Father");
        list.add("Tiger");
        list.add("Elephant");
        list.add("Car");
        list.add("Hospital");
        list.add("Glass");
        list.add("Cup");
        list.add("TV");
        list.add("Computer");

        System.out.println("Количество элементов коллекции:");
        System.out.println(list.size());
        System.out.println("Проверка на наличие элементов, метод возвращает true, если список пустой," +
                "false в обратном случае : ");
        System.out.println(list.isEmpty());
        System.out.println("Содержиться элемент: ");
        System.out.println(list.contains("Hospital"));
        System.out.println("Добавление элемента Book в конец списка: ");
        list.add("Book");
        System.out.println("Добавление элемента по индексу 11, Son: ");
        list.add(11, "Son");
        System.out.println("Удаление элемента Car: ");
        System.out.println(list.remove("Car"));
        System.out.println("Возвращение элемента по индексу: ");
        System.out.println(list.get(10));
        System.out.println("Присваивание значения по индексу и обьекту: ");
        list.set(4, "Wife");
        System.out.println("Удаление элемента по индексу 2 и возвращение элемента: ");
        System.out.println(list.remove(2));
        System.out.println("Возвращение индекса первого вхождения элемента: ");
        System.out.println(list.indexOf("Dog"));
        System.out.println();
        System.out.println("Печать оканчательной колллекции: ");
        System.out.println(list);
    }
}


