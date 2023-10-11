package oop.oop1.HomeWorkPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {
    public void createContact(Contacts saida) {
    }

    public boolean checkContactByPhoneNumber(boolean b) {
        return false;
    }


    public class dataBase {

        List<Contacts> listOfContact = new ArrayList<>();

        public String createContact(Contacts contacts) {
            listOfContact.add(contacts);
            return contacts + " Was added";
        }

        @Override
        public String toString() {
            String result = "";
            for (int i = 0; i < listOfContact.size(); i++) {
                result += "Name: " + listOfContact.get(i).name + "\t\t" + "Number: " + listOfContact.get(i).number + "\n";
            }
            return result;
        }

        public String checkContactByPhoneNumber(boolean hasBalance) {
            System.out.println("Enter the phone number");
            Scanner scan = new Scanner(System.in);
            String phoneNumber = scan.nextLine();
            SmartPhone obj = new SmartPhone();
            String result = "";
            Contacts contact = new Contacts(phoneNumber);
            int i = 0;
            for (i = 0; i < listOfContact.size(); i++) {
                if (listOfContact.get(i).number.equals(phoneNumber)) {
                    result = obj.call(hasBalance) + phoneNumber;
                    break;
                }
            }if(i==listOfContact.size()){
                return createContact(contact);
            }
            return result;
        }
    }

    }
