package task.task2;

public class Task2_1 {
    private byte nameByte;
    private short nameShort;
    private int nameInt;
    private long nameLong;
    private float nameFloat;
    private double nameDouble;
    private char nameChar;
    private boolean nameBoolean;

    //создание глобальных приметивных переменных
    private Byte warByte;
    private Short warShort;
    private Integer warInt;
    private Long warLong;
    private Float warFloat;
    private Double warDouble;
    private Character warCharacter;
    private Boolean warBoolean;
    // создание обверток для приметивных переменных

    // создание геттеров и сетторов для каждой переменной


    public void setNameByte(byte nameByte) {
        this.nameByte = nameByte;
    }


    public void setNameShort(short nameShort) {
        this.nameShort = nameShort;
    }

    public int getNameInt() {
        return nameInt;
    }

    public void setNameInt(int nameInt) {
        this.nameInt = nameInt;
    }


    public void setNameLong(long nameLong) {
        this.nameLong = nameLong;
    }

    public void getNameFloat(double v) {
    }

    public void setNameFloat(float nameFloat) {
        this.nameFloat = nameFloat;
    }

    public void setNameDouble(double nameDouble) {
        this.nameDouble = nameDouble;
    }


    public void setNameChar(char nameChar) {
        this.nameChar = nameChar;
    }

    public boolean isNameBoolean() {
        return nameBoolean;
    }

    public void setNameBoolean(boolean nameBoolean) {
        this.nameBoolean = nameBoolean;
    }


    public char getNameChar() {
        return nameChar;
    }

    public double getNameDouble() {
        return nameDouble;
    }

    public float getNameFloat() {
        return nameFloat;
    }

    public long getNameLong() {
        return nameLong;
    }

    public short getNameShort() {
        return nameShort;
    }

    public byte getNameByte() {
        return nameByte;
    }
}
