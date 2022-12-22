package lesson.lesson9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Card {
    private Integer sumCard;

    public Integer getSumCard() {
        return sumCard;
    }



    private String numberCard;


    public Card() {
    }


    public Card(Integer sumCard, String numberCard) {
        this.sumCard = sumCard;
        this.numberCard = numberCard;
    }
    public void setSumCard(Integer sumCard) {

        this.sumCard = sumCard;
    }

    public String getNumberCard() {

        return numberCard;
    }

    public void setNumberCard(String numberCard) {

        this.numberCard = numberCard;
    }
    @Override
    public String toString() {
        return "Ваша карта{" +
                "Сумма на счете=" + getSumCard() +
                ", номер карты='" + getNumberCard() + '\'' +
                '}';
    }

    public void wreateCard(Card card, String oper, Integer sumCard) {
        try (ObjectOutputStream order = new ObjectOutputStream(new FileOutputStream("resources/card.txt", true))) {
            order.writeObject("\n" + "*******************************");
            order.writeObject(card.toString()+"\n"+ oper+"\n"+sumCard);
            order.writeObject("\n" + "*******************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



