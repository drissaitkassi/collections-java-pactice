package mobileArrayList;

public class Contacts extends MobilePhone {
    String name;
    String phone;

    public Contacts(String name, String phone) {
        this.name = name;
        this.phone=phone;

    }
    public Contacts(){

    };
    public String  toString(){

        return ""+this.name+" : "+ this.phone;
    }

}
