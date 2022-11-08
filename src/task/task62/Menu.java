package task.task62;

/**
 * Программа принятия звонков и отправки сообщений
 */
public class Menu {
    public void runPhone() {
        Phone menu = new Phone();
        Phone samsung = new Phone();
        Phone lg = new Phone();
        Phone siemens = new Phone();
/**
 * Инициализирую поля телефонов
 */
        samsung.setNumber(291247589);
        lg.setNumber(335678890);
        siemens.setNumber(336548790);
        samsung.setModel("Samsung");
        siemens.setModel("Simens");
        lg.setModel("Lg");
        samsung.setWeight(150);
        siemens.setWeight(200);
        lg.setWeight(205);

        /**
         * Вывод на консоль значения переменных
         *
         */
        System.out.println(samsung);
        System.out.println(lg);
        System.out.println(siemens);
/**
 * Передача имени в метод
 *
 */
        samsung.receiveCall("Владимир");
        lg.receiveCall("Ольга");
        siemens.receiveCall("Сергей");
/**
 * Передача параметров в метод имя и номер
 */
        samsung.receiveCall("Владимир", samsung.getNumber());
        lg.receiveCall("Ольга", lg.getNumber());
        siemens.receiveCall("Сергей", siemens.getNumber());
/**
 * Принятие номера телефона и отправка сообщения
 */
        menu.sendMessage(lg.getNumber(), samsung.getNumber(), siemens.getNumber());
    }
}
