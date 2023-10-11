package oop.oop1.HomeWorkPhone;

public class Contacts {
    public String name;
    public String number;

    public Contacts(String alisher) {

    }

    public class contacts {

        String name;
        String number;

        public contacts(String name, String number) {
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Contacts{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

}
