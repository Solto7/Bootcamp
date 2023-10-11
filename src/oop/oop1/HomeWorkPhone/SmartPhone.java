package oop.oop1.HomeWorkPhone;

public class SmartPhone {
    public SmartPhone(String s, String grey, int i) {

    }

    public SmartPhone() {

    }

    public String call(boolean hasBalance) {
        return null;
    }

    public class smartPhone extends Phone {

        public smartPhone(){
            super("sd", "color", 12
            );
        }

        public smartPhone(String model, String color, int price) {
            super(model, color, price);
        }

        @Override
        public String call (boolean hasBalance){
            if (hasBalance == true) {
                return "Calling ";
            } else {
                return "Top up the balance";
            }
        }

        public String sendMassage () {
            return "Sending massage";
        }

        public String useInternet () {
            return "Use internet";
        }


        }
    }

