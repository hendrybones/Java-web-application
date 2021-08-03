package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    @org.junit.jupiter.api.Test
    public void shouldCreateContact(){
        ContactManager contactManager=new ContactManager();
        contactManager.addContact("hendry","mwamburi","0791520630");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1,contactManager.getAllContacts().size());

    }
    void addContact() {
    }

    @org.junit.jupiter.api.Test
    void getAllContacts() {
    }
}