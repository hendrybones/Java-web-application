package com.pluralsight.calcengine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {
    Map<String, Contacts> list=new ConcurrentHashMap<String, Contacts>();
    public void addContact(String firstName,String lastName,String phoneNumber){
        Contacts contacts=new Contacts(firstName,lastName,phoneNumber);
        validateContact(contacts);
        checkIfContactAlreadyExist(contacts);
        list.put(generateKey(contacts),contacts);

    }
    public Collection<Contacts> getAllContacts(){
        return list.values();
    }

    private String generateKey(Contacts contacts) {
        return String.format("%s-%s",contacts.getFirstName(),contacts.getLastName());

    }

    private void checkIfContactAlreadyExist(Contacts contacts) {
        if (list.containsKey(generateKey(contacts)))
            throw new  RuntimeException("contacts already exist");
    }

    private void validateContact(Contacts contacts) {
        contacts.validateFirstName();
        contacts.validateLastName();
        contacts.validatePhoneNumber();

    }
}
