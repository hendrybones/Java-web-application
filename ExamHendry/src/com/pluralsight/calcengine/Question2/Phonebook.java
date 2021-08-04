package com.pluralsight.calcengine.Question2;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Phonebook {
    public static void main(String args[]) throws IOException, ParseException {

        Scanner scanner=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        Map<String, Contacts> list=new ConcurrentHashMap<String, Contacts>();
        File file = new File("contact.txt");
        FileOutputStream op = null;
        FileInputStream ip = null;
        ListIterator li = null;

        int choice=-1;

        do {
            System.out.println(
                    "\n1. add number to phone book\n" +
                    "2. search contacts\n" +
                    "0. Exit\n");
            scanner = new Scanner(System.in);
            scan2=new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    userInputs(scanner, scan2, list);
                        FileOutputStream fileOutputStream = new FileOutputStream("contact.txt", true);
                        list = new ConcurrentHashMap<String, Contacts>();
                    file = new File("fileOne.txt");
                    FileReader fileReader=new FileReader(file);
                    BufferedReader bufferedReader=new BufferedReader(fileReader);
                    String line;
                    while ((line=bufferedReader.readLine())!=null)
                    {
                        String[]  personData=line.split(",");
                        Contacts s = new Contacts(personData[0].trim(),personData[1].trim(),personData[2].trim());
                        list.put();

                    }
                    for (Contacts x: list){
                        System.out.println(x);
                    }


                    break;
                case 2:
//                    System.out.println("-----------------------------------------");
////
//                    while (itr.hasNext()) {
//                        Contacts a = (Contacts) itr.next();
//                        System.out.println(a);
//                    }
//                    System.out.println("-----------------------------------------");

                    break;
            }

        }while (choice!=0);



    }

    private static void userInputs(Scanner scanner, Scanner scan2, Map<String, Contacts> list) {
        System.out.println("enter number of contacts to add");
        int num= scan2.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("enter first-name ");
            String firstName= scanner.nextLine();
            System.out.println("enter last-name ");
            String lastName= scanner.nextLine();
            System.out.println("enter phone number ");
            String phoneNumber= scanner.nextLine();
            Contacts s=new Contacts(firstName,lastName,phoneNumber);
//          list.put(new Contacts(firstName,lastName,phoneNumber));
        }
        while (scanner.hasNext()){

            System.out.println("name");

        }
        ContactManager contactManager=new ContactManager();
        contactManager.addContact("hendry","mwamburi","079167353");


    }
}
