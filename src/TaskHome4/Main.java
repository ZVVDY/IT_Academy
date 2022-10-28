package TaskHome4;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static int quantityCat = 0;
    //public static Cat[] matroskin = new Cat[10];
    public static ArrayList cats = new ArrayList();

    public Main() {
        this.cats.add(this);// добавление "кота" в список при вызове конструктора
    }

    public static void main(String[] args) {
        oneCreateCat();
        twoCreateCat();
        threeCreateCat();
        fourCreateCat();
    }

    public static void oneCreateCat() {
        System.out.println("Вывод котов с помощью while: ");
        while (quantityCat < 10) {
            Cat basrsik = new Cat();
            System.out.println(basrsik);
            quantityCat++;
        }
        System.out.println();
    }

    public static void twoCreateCat() {
        System.out.println("Вывод 10 котов созданных с помощью for: ");
        for (quantityCat = 0; quantityCat < 10; quantityCat++) {
            Cat barsik = new Cat();
            int age = ageRandom(1, 28);
            barsik.setAgeCat(age);
            String name = newRandomName();
            barsik.setNameCat(name);
            System.out.println("Name: " + barsik.getNameCat() + " Age: " + barsik.getAgeCat());
        }
        quantityCat = 0;
        System.out.println();
    }

    public static void threeCreateCat() {
        System.out.println("Вывод 10 котов созданных с помощью do while: ");
        do {
            Cat basrsik = new Cat(newRandomName(), ageRandom(1, 28));
            cats.add(basrsik);//записываю в массив котов
            System.out.println(basrsik);
            quantityCat++;
        }
        while (quantityCat < 10);
        quantityCat = 0;
        System.out.println();
    }

    public static void fourCreateCat() {
        for (Object i : cats) {
            System.out.println("Вывод котов с помощью fori: ");
            System.out.println(i);
            if (quantityCat == 4) {
                return;
            }
            quantityCat++;
        }
        System.out.println("Программа выполнена!Спасибо.");
    }

    private static int ageRandom(int startNum, int endNum) {
        Random random = new Random();
        return random.nextInt(endNum - startNum + 1) + startNum;
    }

    public static String newRandomName() {
        int length = ageRandom(3, 8);
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            int charCode = ageRandom(97, 122);
            text[i] = (char) charCode;
        }
        return new String(text);
    }
}