package oop.oop1.HomeWorkPhone;

public class PhoneMain {


    public class phoneMain {
        public static void main(String[] args) {
            SmartPhone iPhone = new SmartPhone("10X", "grey", 70000);

            Contacts alisher = new Contacts("Alisher");
            Contacts sumaya = new Contacts("Sumaya");
            Contacts karim = new Contacts("Karim");
            Contacts saida = new Contacts("Saida");
            DataBase dataBase = new DataBase();

            dataBase.createContact(alisher);
            dataBase.createContact(sumaya);
            dataBase.createContact(karim);
            dataBase.createContact(saida);

            System.out.println(dataBase);

            System.out.println(dataBase.checkContactByPhoneNumber(true));


        }
    }
}
