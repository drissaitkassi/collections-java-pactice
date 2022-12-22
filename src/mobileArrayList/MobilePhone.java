package mobileArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {


    ArrayList<Contacts> contacts = new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    Scanner scanner2=new Scanner(System.in);
    Scanner scanner3=new Scanner(System.in);
    Scanner scanner4=new Scanner(System.in);
    Scanner scanner5=new Scanner(System.in);
    Scanner scanner7=new Scanner(System.in);


    // add contact
    public void addContact(Contacts c) {
        if (contacts.contains(c)) {
            System.out.println("deja existant ");
        } else
            contacts.add(c);

        System.out.println("contact ajouter avec succés");
    }

    // modify contact
    public void modifyContact( Contacts c) {
       // if (contacts.contains(c)) {

            System.out.println("modifier avec succès ");
       // } else
            //System.out.println("contact  inexistant ");
    }
    public void modifyContact2( Contacts c) {
        // if (contacts.contains(c)) {
        System.out.println("saisir le nom pour avoir l'index");
        contacts.set(findIndex(scanner7.nextLine()),c );
        System.out.println("modifier avec succès ");
        // } else
        //System.out.println("contact  inexistant ");
    }
    public int findIndex(String nom){
        for (Contacts c:contacts) {

       if (c.name.equals(nom)){
           System.out.println(contacts.indexOf(c));
           return contacts.indexOf(c);
               }
       else System.out.println("pas d'index");
        }

       return -1;
    }

    //delete contact
    public void removeContact(int position) {
        if (contacts.contains(contacts.get(position))) {
            contacts.remove(position);
            System.out.println("supprimer  avec succès ");
        } else

            System.out.println("contact  inexistant ");
    }

    //search contact by index
    //todo modify to exercice requirments

    public void searchContact(int position) {
        if (contacts.contains(contacts.get(position))) {

            System.out.println("le contact numero" + position + 1 + contacts.get(position));
        } else

            System.out.println("contact  inexistant ");
    }
    public void menu(){
        System.out.println("||====================||");
        System.out.println("||0- show menu        ||");
        System.out.println("||1- add contact      ||");
        System.out.println("||2- modify contact   ||");
        System.out.println("||3- delete contact   ||");
        System.out.println("||-4 search item      ||");
        System.out.println("||-6 afficher list    ||");
        System.out.println("||-5 quit menu        ||");
        System.out.println("||====================||");

       int choice=scanner3.nextInt();

        while (choice!=5){

            switch (choice){
                case 0:
                    menu();
                case 1:
                    System.out.println("enter nom");
                    String contactName=scanner.nextLine();
                    System.out.println("entrer phone");
                    String phone=scanner2.nextLine();
                    Contacts contacts1=new Contacts(contactName,phone);
                    addContact(contacts1);

                    break;
                case 2:
                    System.out.println("pret a modifier");
                    System.out.println("enter nouveau nom");
                    String newName=scanner4.nextLine();
                    System.out.println("entrer  nouveau phone");
                    String newPhone=scanner5.nextLine();
                    Contacts contacts2=new Contacts(newName,newPhone);
                    modifyContact2(contacts2);
                    break;
                case 3:
                    System.out.println("choix 3");
                    break;
                case 4:
                    System.out.println("choix 4");
                    break;
                case 5:

                    break;
                case 6:
                        afficher();
                    break;
            }
            choice=scanner3.nextInt();
        }


    }

    public void   afficher(){

        for (Contacts c:contacts) {
            System.out.println(c);
        }
    }


}
