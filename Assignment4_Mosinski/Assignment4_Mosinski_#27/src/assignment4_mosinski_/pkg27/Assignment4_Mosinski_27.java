/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg27;

import javax.swing.*;
/**
 *
 * @author nmosinski
 */
public class Assignment4_Mosinski_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choice11;

        ListLinked Listlinked = new ListLinked();

        listpro listing11;

        String name;

        while (true) {

            choice11 = Driver.choice();

            switch (choice11) {

                case 1:

                    listing11 = new listpro();

                    listing11.input();

                    Listlinked.insert(listing11);

                    System.out.println("operation finish");

                    break;

                case 2:

                    name = JOptionPane.showInputDialog("Fetch the name");

                    listing11 = Listlinked.fetch(name);

                    if(listing11 == null)

                        System.out.println("invalid structure");

                    else {

                        System.out.println(listing11.toString());

                    }

                    break;

                case 3:

                    name = JOptionPane.showInputDialog("Delete the name");

                    if(Listlinked.delete(name)) {

                        System.out.println("operation complete");

                    } else {

                        System.out.println("Invalid structure");

                    }

                    break;

                case 4:

                    name = JOptionPane.showInputDialog("update the name");

                    listing11 = Listlinked.fetch(name);

                    if(listing11 == null)

                        System.out.println("invalid structure");

                    else {

                        listing11.input();

                        System.out.println("operation finish");

                    }

                    break;

                case 5:

                    Listlinked.printAll();

                    System.out.println("operation finish");

                    break;

                case 6:

                    return;

                default:

                    System.out.println("Invalid choice. Please try again!!");

                    break;
            }
        }        
    }        
}
