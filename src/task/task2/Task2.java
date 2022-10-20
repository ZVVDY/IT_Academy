package task.task2;

public class Task2 {
    private int globalInt;
    private double globalDouble;
    private char globalChar;
    private boolean globalBoolean;
    //создание глобальных приметивных переменных
    private Integer nameNumInt;
    private Double nameNumDouble;
    private Character nameSimCharacter;
    private Boolean nameSBoolean;


    // создание обверток для приметивных переменных
    public static void main(String[] args) {
        int globalInt = 52345;
        double globalDouble = 3.524569875;
        char globalChar = 'A';
        boolean globalBoolean = true;

//инициализация примитивных переменных
        Integer nameNumInt = 112;
        Double nameNumDouble = 125.78;
        Character nameSimCharacter = 'G';
        Boolean nameSBoolean = false;
        //инициализация обверток

//присвоение переменных друг в друга и превидение типов Пример
        byte oneNumber = 123;
        short twoNumber = oneNumber;
        int threeNumber = oneNumber + twoNumber;
        long fourNumber = threeNumber;
        float fiveNumber = 153.5478f;
        double sixNumder = fiveNumber;// присвоение переменных друг в друга

        oneNumber = (byte) fourNumber;
        threeNumber = (int) fourNumber;
        threeNumber = (int) fiveNumber;// приведение типов

        //short a=nameInt; //ошибка копиляции размер int 32bit , short 16bit разные размеры памяти
        //float b=nameDabl; //ошибка копиляции размер float 32bit ,а double 64bit разные размеры памяти
//Установка и получения значений в геттерах и сеттерах
        Task2_1 task = new Task2_1();
        task.setNameByte((byte) 99);
        task.setNameShort((short) 154);
        task.setNameInt(1987);
        task.setNameLong(125000);
        task.getNameFloat(154.5);
        task.setNameDouble(123.5);
        task.setNameChar('D');
        task.setNameBoolean(false);
        System.out.println("Переменные:");
        System.out.println(globalInt);
        System.out.println(globalDouble);
        System.out.println(globalChar);
        System.out.println(globalBoolean);
        System.out.println();
        System.out.println("Обвертки:");
        System.out.println(nameNumInt);
        System.out.println(nameNumDouble);
        System.out.println(nameSimCharacter);
        System.out.println(nameSBoolean);
        System.out.println("Геттеры и сеттеры:");
        System.out.println(task.getNameByte());
        System.out.println(task.getNameShort());
        System.out.println(task.getNameInt());
        System.out.println(task.getNameLong());
        System.out.println(task.getNameFloat());
        System.out.println(task.getNameDouble());
        System.out.println(task.getNameChar());
        System.out.println(task.isNameBoolean());
    }
}
