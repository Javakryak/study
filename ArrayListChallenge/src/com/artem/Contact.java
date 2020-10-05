package com.artem;

public class Contact {
    private String contactName;
    private String contactPhone;

    public Contact(String contactName, String contactPhone) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }
}

