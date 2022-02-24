package com.example.warimano.exercises.section.eight.mobilephone;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) return false;

        myContacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean success = false;
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.set(index, newContact);
            success = true;
        }
        return success;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0) return false;

        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String contactName) {
        int wantedContactIndex = -1;
        for (int i = 0; i < myContacts.size(); i++) {
            if (Objects.equals(myContacts.get(i).getName(), contactName)) {
                wantedContactIndex = i;
            }
        }
        return wantedContactIndex;
    }

    public Contact queryContact(String name) {
        return myContacts.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
