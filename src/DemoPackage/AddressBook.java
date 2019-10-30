package DemoPackage;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> addresses=new ArrayList<String>();
        System.out.println("Addresses book app \nSelect an option:\n1.Add contact" +
                "; 2.Deleted contact; 3.Show contact; 4.Edit Contact");

        char option = scanner.next().charAt(0);
        switch (option){
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            default: System.out.println("Wrong option! Program is finished!!!");
        }






    }
}