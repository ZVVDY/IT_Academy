package task.task62;

public class Phone {
    private String model;
    private int number;
    private int weight;

    /**
     * Метод вывода имени звонящего
     */

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
        System.out.println();
    }

    /**
     * Метод вывода имени звонящего и его номера
     */
    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " номер телефона " + number);
        System.out.println();
    }

    /**
     * Метод рассылки сообщения
     */
    public void sendMessage(int... number) {
        for (int s : number) {
            System.out.println(" Не достаточный баланс лицевого счета,пополните во избежаниии блокировки");
            System.out.println("Сообщение отправлено на номер: " + s);
        }
    }

    /**
     * Конструкторы
     */
    public Phone() {
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, int number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Переопределение метода toString
     */
    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", weight=" + weight +
                '}';
    }
}


