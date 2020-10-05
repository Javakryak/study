package com.artem;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addContact (Contact contact){
        contacts.add(contact);
        System.out.println("Contact has been successfully created");
    }

    public void removeContact (Contact contact){
        int position = findContact(contact);
        if (position >= 0) {
            contacts.remove(position);
            System.out.println("Contact has been successfully removed");
        }
    }

    public void editContact (Contact oldContact, Contact newContact){
        int oldPos = findContact(oldContact);
        contacts.set(oldPos, newContact);
        System.out.println("Contact has been successfully edited. \n"+
                "New name: " + newContact.getContactName() + "\n" +
                "New phone number: "+ newContact.getContactPhone());
    }

    public void printContactList (){
        System.out.println("You have " + contacts.size() + " contacts in your phone book:");
        for (int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". Name: " + contacts.get(i).getContactName() + "\n" +
                                "Phone: " + contacts.get(i).getContactPhone());
        }
    }

    private int findContact (Contact contact) {
        return contacts.indexOf(contact);
    }

    public Contact searchByName (String name){
        for(int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().equals(name)){
                return contacts.get(i);
            }
        } return null;
    }
}
