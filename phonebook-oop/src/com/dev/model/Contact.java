package com.dev.model;

public abstract class Contact {
    private String name;
    private String phone;
    private ContactType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirstCharacter(name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ContactType getType() {
        return type;
    }

    public Contact(String name, String phone, ContactType type) {
        this.name = capitalizeFirstCharacter(name);
        this.phone = phone;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' ;
    }

    private String capitalizeFirstCharacter(String str){
        if (!str.isEmpty()){
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str;
    }
}
