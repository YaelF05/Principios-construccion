import javax.swing.*;

import java.util.*;
class Item {

    // se eliminiarion t2 y t3
    boolean t1;
    ArrayList<Data> item;

    //constructor
    public Item ( ) {

        item = new ArrayList<Data>();
    }


    public void addRecord( ) {

        String name = JOptionPane.showInputDialog("Enter name:");
        String address = JOptionPane.showInputDialog("Enter address:");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone number:");

        Data person = new Data(name, address, phoneNumber);

        item.add(person);
    }


    public void searchRecord (){

        if(item.isEmpty()==false){

            String var = JOptionPane.showInputDialog("Enter a name to search: ");

            for (int i=0; i< item.size(); i++) {

                Data person = (Data)item.get(i);
                if ( var.equals(person.name) ){
                    t1=true;

                    person.print();
                }

            } // end for

            if(!(t1==true)){
                JOptionPane.showMessageDialog(null, "Record not found");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Sorry there is no any record");
        }
    } // end searchPerson

    //Delete the specific person from the record

    public void deleteRecord () {

        if(!(item.isEmpty())){

            String var = JOptionPane.showInputDialog("Enter a name to delete: ");

            for (int i=0; i< item.size(); i++) {
                Data person = (Data)item.get(i);

                if ( var.equals(person.name) ) {
                    t1=true;
                    item.remove(i);
                    // se modificó el inputdialog a message dialog
                    JOptionPane.showMessageDialog(null,"Record is deleted");
                }
            }

            if(!(t1==true)){
                JOptionPane.showMessageDialog(null, "Record not found");
            }

        } else{
            JOptionPane.showMessageDialog(null, "Sorry there is no record");
        }
    }

    // TO display all the records

    public void allRecord(){

        if(item.size()==0){
            JOptionPane.showMessageDialog(null, "Sorry there is no record");
        }

        for (int i=0; i< item.size(); i++) {
            Data person = (Data)item.get(i);
            JOptionPane.showMessageDialog(null, " Record No: "+(i+1) +"\n\nName: " + person.name + "\n Address: " + person.address + "\n Phone number: " + person.phoneNumber);
        }
    }

    // Modify records.
    public void modifyRecord() {
        if(item.isEmpty()==false){

            String var = JOptionPane.showInputDialog("Enter a name to modify ");

            for (int i=0; i< item.size(); i++){
                Data person = (Data)item.get(i);

                if ( var.equals(person.name) )
                {
                    t1=true;
                    person.print();

                    // se elimino el remove

                    String name = JOptionPane.showInputDialog("Enter new Name last one is : " + person.name);
                    String address = JOptionPane.showInputDialog("Enter new address last one is : "+ person.address);
                    String phoneNumber = JOptionPane.showInputDialog("Enter new phone number last one is : "+ person.phoneNumber);

                    // se modifico la manera en la que se actualizan los datos del registro
                    person.name = name;
                    person.address = address;
                    person.phoneNumber = phoneNumber;

                    person.print();
                }
            }

            if(!(t1==true)){
                JOptionPane.showMessageDialog(null, "Record not found");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Sorry there is no any record");
        }

    }

}//end of class