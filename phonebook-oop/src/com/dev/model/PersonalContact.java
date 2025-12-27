package com.dev.model;

public class PersonalContact extends Contact{
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = capitalizeFirstCharacter(family);
    }

    public PersonalContact(String name, String phone) {
        super(name, phone, ContactType.PERSONAL);
    }

    @Override
    public String toString() {
        return "PersonalContact{ " +
                super.toString() +
                " ,family='" + family + '\'' +
                '}';
    }

    private String capitalizeFirstCharacter(String str){
        if (!str.isEmpty()){
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }
}
