package com.dev;

public class Contact {
    private String name;
    private String phone;

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

    public Contact() {
    }

    public Contact(String name, String phone) {
        this.name = capitalizeFirstCharacter(name);
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    private String capitalizeFirstCharacter(String str){
        if (!str.isEmpty()){
            //return Character.toUpperCase(str[0]) + str.substring(1);
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str;
    }
}
