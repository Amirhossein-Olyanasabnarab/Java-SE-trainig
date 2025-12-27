package com.dev.model;

public class BusinessContact extends Contact{

    private String fax;

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "BusinessContact{ " +
                super.toString() +
                " ,fax='" + fax + '\'' +
                '}';
    }

    public BusinessContact(String name, String phone) {
        super(name, phone, ContactType.BUSINESS);
    }
}
