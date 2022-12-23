package mobileArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {


    ArrayList<Contacts> contacts = new ArrayList<>();
    Scanner addName=new Scanner(System.in);
    Scanner addPhone=new Scanner(System.in);
    Scanner choiceMenu=new Scanner(System.in);
    Scanner modifyName=new Scanner(System.in);
    Scanner modifyPhone=new Scanner(System.in);
    Scanner modifyPhone2=new Scanner(System.in);
    Scanner findIndex=new Scanner(System.in);
    Scanner findContact=new Scanner(System.in);


    // add contact
    public void addContact(Contacts c) {
        if (contacts.contains(c)) {
            System.out.println("deja existant ");
        } else
            contacts.add(c);

        System.out.println("contact ajouter avec succés");
    }

    // modify contact name
    public void modifyContactName( Contacts c,String nameToModify ) {

        System.out.println("saisir le nom pour avoir l'index");
        nameToModify = findIndex.nextLine();
        contacts.set(findIndex(nameToModify),c);
        System.out.println("modifier avec succès ");
    }

    // modify contact phone
    public void modifyContactPhone( String nom,String nphone) {
        for (int i = 0; i <contacts.size() ; i++) {
            if (contacts.get(i).name.equals(nom))
                contacts.get(i).phone=nphone;
        }
;
    }

    // modifiy contact
    public void modifyContact( Contacts c) {

        System.out.println("saisir le nom pour avoir l'index");
        contacts.set(findIndex(findIndex.nextLine()),c );
        System.out.println("modifier avec succès ");
       
    }

    // find the index based on name
    public int findIndex(String nom){
        for (Contacts c:contacts) {

       if (c.name.equals(nom)){
           //System.out.println(contacts.indexOf(c));
           return contacts.indexOf(c);
               }
        }
       return -1;
    }

    //delete contact
    public void removeContact(String nom) {
        int itemToRemove=findIndex(nom);
        contacts.remove(itemToRemove);
        System.out.println("supprimer avec succès ");
    }

    //search contact by name
    public void searchContact(String nom) {
        for (int i = 0; i <contacts.size() ; i++) {
            if (contacts.get(i).name.equals(nom)){
                System.out.println(contacts.get(i));
            }

        }
    }

    // menu logic
    public void menu(){
        System.out.println("||====================||");
        System.out.println("||0- show menu        ||");
        System.out.println("||1- add contact      ||");
        System.out.println("||2- modify contact   ||");
        System.out.println("||3- modify contact Name  ||");
        System.out.println("||4- modify contact Phone  ||");
        System.out.println("||5- delete contact   ||");
        System.out.println("||6- search item      ||");
        System.out.println("||7- afficher list    ||");
        System.out.println("||8- quit menu        ||");
        System.out.println("||====================||");

       int choice=choiceMenu.nextInt();

        while (choice!=8){

            switch (choice){
                case 0:
                    menu();
                case 1:
                    System.out.println("enter nom");
                    String contactName=addName.nextLine();
                    System.out.println("entrer phone");
                    String phone=addPhone.nextLine();
                    Contacts contacts1=new Contacts(contactName,phone);
                    addContact(contacts1);

                    break;
                case 2:
                    System.out.println("pret a modifier");
                    System.out.println("enter nouveau nom");
                    String newName=modifyName.nextLine();
                    System.out.println("entrer  nouveau phone");
                    String newPhone=modifyPhone.nextLine();
                    Contacts contacts2=new Contacts(newName,newPhone);
                    modifyContact(contacts2);
                    break;
                case 3:

                   /* System.out.println("pret a modifier");
                    String newName3=modifyName.nextLine();
                    Contacts contacts3=new Contacts(newName3,null);

                    modifyContactName(contacts3,);*/
                    break;
                case 4:
                    System.out.println("pret a modifier");

                    modifyContactPhone(findContact.nextLine(),modifyPhone2.nextLine());

                    break;
                case 5:
                    System.out.println("entrer le nom du contact a supprimer");
                    removeContact(findIndex.nextLine());
                    break;
                case 6:
                    searchContact(findContact.nextLine());
                    break;
                case 7:
                    afficher();
                    break;
                case 8:
                    break;
            }
            choice=choiceMenu.nextInt();
        }


    }

    public void   afficher(){

        for (Contacts c:contacts) {
            System.out.println(c);
        }
    }


}
