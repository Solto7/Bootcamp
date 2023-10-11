package oop.oop1.HomeWorkPhone;

public abstract class Phone {
    public Phone(String model, String color, int price) {


    }

    public abstract String call(boolean hasBalance);

    public abstract class phone {
//    Создать абстрактный класс телефон с instance variables с разными access modifiers
//    Создать getter & setter для private variables
//    Создать абстрактный метод звонить
//    Унаследовать от него Проводной телефон и Мобильный телефон
//    В «Проводной телефон» переопределить метод «звонить» с реализацией,- если есть ежемесячная оплата, то совершить звонок, если нет, то попросить оплатить
//    В «Мобильный телефон» переопределить метод «звонить»с реализацией,- если есть баланс, то совершить звонок, если нет баланса, то попросить пополнить баланс.
//    Создать обычный метод «sendMessage»
//    Создать обычный метод «useInternet»
//    Создать Main class, создать объекты по шаблонам и вызвать все методы

    public String model;
    private String color;
    protected int price;

    public phone() {

    }

    public phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String call(boolean pay);

    @Override
    public String toString() {
        return "Phone{" + "model='" + model + '\'' + ", color='" + color + '\'' + ", price=" + price + '}';
    }
}
}
