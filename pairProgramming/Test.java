import javax.swing.*;
class Test {

    public static void main (String args[])
    {
        Item itemObject = new Item();
        String input;
        int switchInt;
        try{
            while (true)
            {
            
                input = JOptionPane.showInputDialog("Enter 1 To Add Record  \n Enter 2 To Search Record \n Enter 3 To Delete Record \n Enter 4 To Modify Record \n Enter 5 To Display All Records \n Enter 6 to Exit");
                switchInt = Integer.parseInt(input);


                switch (switchInt) {

                    case 1:
                        itemObject.addRecord();
                        break;

                    case 2:
                        itemObject.searchRecord();
                        break;

                    case 3:
                        itemObject.deleteRecord();
                        break;

                    case 4:

                        itemObject.modifyRecord();
                        break;

                    case 5:

                        itemObject.allRecord();
                        break;

                    case 6:
                        System.exit(0);
                }
            }//end while
        }catch(Exception e){
            System.out.println(e);
        }
    }// end of main
}// end of class