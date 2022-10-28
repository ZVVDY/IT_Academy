package TaskHome4;

import java.util.Random;

public class Cat {
    private int ageCat = 7;
    private String nameCat = "Bars";

    public Cat() {
    }


    public void setNameCat(String randomCatFor) {
        this.nameCat = randomCatFor;
    }

    public void setAgeCat(int ageFor) {
        this.ageCat = ageFor;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public Cat(String nameCreate, int ageCreate) {
        System.out.println("Конструктор сработал для ");
        this.nameCat = nameCreate;
        this.ageCat = ageCreate;
    }

    public String toString() {
        return nameCat + " ," + ageCat;
    }


}





