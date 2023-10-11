package oop.phone;

public interface Internet {

    String usingInternet(int balance);

    default String keyboard() {
        return "QWERTY keyboard" + t9();
    }

    private String t9() {
        return "Check the word";
    }

}
