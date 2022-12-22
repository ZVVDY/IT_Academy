package lesson.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankMachine extends Card {
    private static Integer sumBank = 1000_000;
    private Scanner scanner = new Scanner(System.in);
    private Map<String, Card> allCard = new HashMap<>();
    private String scanNumberCard;

    protected void runMenu() {
        createCard();
        System.out.println("Банкомат");
        System.out.println("Ведите номер карты в формате ХХХХ-ХХХХ-ХХХХ-ХХХХ");
        System.out.println("Что бы выйти введите 0");
        while (true) {
            scanNumberCard = scanner.nextLine();
            if (scanNumberCard.equals("1111-1111-1111-1111")) {
                System.out.println("Ваша карта " + scanNumberCard);
                System.out.println("Введите пинкод");
                jobBankMachine();
            }
            if (scanNumberCard.equals("2222-2222-2222-2222")) {
                System.out.println("Ваша карта " + scanNumberCard);
                System.out.println("Введите пинкод");
                jobBankMachine();
            }
            if (scanNumberCard.equals("3333-3333-3333-3333")) {
                System.out.println("Ваша карта " + scanNumberCard);
                System.out.println("Введите пинкод");
                jobBankMachine();
            }
            if (scanNumberCard.equals("0")) {
                System.out.println("Вы вышли из программы");
                break;
            }

        }
    }

    private void createCard() {
        Card viktor = new Card(12000, "1111-1111-1111-1111");
        Card vlad = new Card(24000, "2222-2222-2222-2222");
        Card sveta = new Card(36000, "3333-3333-3333-3333");
        allCard.put("1234", viktor);
        allCard.put("1237", vlad);
        allCard.put("5678", sveta);

    }

    private void jobBankMachine() {
        String scanPinKog;
        int numberPin = 3;

        while (numberPin > 0) {
            scanPinKog = scanner.nextLine();
            Card card = allCard.get(scanPinKog);
            boolean keyCard = allCard.containsKey(scanPinKog);
            if (keyCard) {
                System.out.println("Пин-код верный");
                withdrawalOfFunds(card);
            } else {
                System.out.println("Пин-код  не верный");
                System.out.println("осталось попыток" + (numberPin - 1));
                numberPin--;
                System.out.println("Введите пинкод еще раз");
                if (numberPin == 0) {
                    System.err.println("Карта заблокирована");
                    runMenu();
                }
            }

        }
    }

    private void withdrawalOfFunds(Card card) {
        System.out.println("Введите 1- посмотреть баланс");
        System.out.println("Введите 2- пополнить баланс");
        System.out.println("Введите 3- снять средства");
        System.out.println("Введите 0- выйти из программы");
        while (true) {
            int numberMenu = scanner.nextInt();
            if (numberMenu == 1) {
                System.out.println(card.getSumCard());
            }
            if (numberMenu == 2) {
                System.out.println("Введите сумму пополнения");
                Integer sum = scanner.nextInt();
                if (sum == 1000_000) {
                    System.err.println("Привышен лимит пополнения");
                }
                Integer popl = card.getSumCard() + sum;
                card.setSumCard(popl);
                wreateCard(card, "Пополнено на  сумму", sum);
                System.out.println("На вашем счете " + card.getSumCard());
            }
            if (numberMenu == 3) {
                System.out.println("Введите сумму снятия");
                Integer sumOperation = scanner.nextInt();
                if (sumOperation <= card.getSumCard()) {
                    Integer snat = card.getSumCard() - sumOperation;
                    card.setSumCard(snat);
                    wreateCard(card, "Снято сумма", sumOperation);
                    System.out.println("На вашем счете " + card.getSumCard());

                }
                if (sumOperation > card.getSumCard()) {
                    System.out.println("Недостаточно средств");
                    runMenu();
                }
            }
            if (numberMenu == 0) {
                System.out.println("Заберите карту ");
                break;
            }
        }

    }
}






