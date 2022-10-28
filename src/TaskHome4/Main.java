package TaskHome4;

import java.util.Random;

public class Main {
    public static int quantityCat = 0;
    public static Cat[] matroskin = new Cat[10];

    public static void main(String[] args) {
        oneCreateCat();
        twoCreateCat();
        threeCreateCat();
        fourCreateCat(matroskin);
    }

    public static void oneCreateCat() {
        System.out.println("Вывод котов с помощью while: ");
        while (quantityCat < 10) {
            Cat basrsik = new Cat();
            System.out.println(basrsik);
            quantityCat++;
        }
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
    }

    public static void threeCreateCat() {
        System.out.println("Вывод 10 котов созданных с помощью do while: ");
        do {
            Cat basrsik = new Cat(newRandomName(), ageRandom(1, 28));
            matroskin[quantityCat] = basrsik;//записываю в массив котов
            System.out.println(basrsik);
            quantityCat++;

        }
        while (quantityCat < 10);
        quantityCat = 0;
    }

    public static void fourCreateCat() {
//Cat [] vasil=new Cat[5];
////vasil[0]=new Cat();
////vasil[1]=new Cat();
////vasil[2]=new Cat();
////vasil[3]=new Cat();
////vasil[4]=new Cat();
////vasil[5]=new Cat();
        for (quantityCat:
             vasil) {
            System.out.println([matroskin]);

        }
    }

    {
        System.out.println(Main.matroskin[0]);
    }

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
