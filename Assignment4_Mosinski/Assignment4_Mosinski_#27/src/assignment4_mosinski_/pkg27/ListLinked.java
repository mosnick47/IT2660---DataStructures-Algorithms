/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg27;

/**
 *
 * @author nmosinski
 */
public class ListLinked {

    private ListingNode headnode;

    public ListLinked() {

        headnode = null;

    }

    public void insert(listpro listing11) {

        ListingNode listingNode = new ListingNode(listing11);

        if(headnode == null) {

            headnode = listingNode;

        } else {

            ListingNode tempval = headnode;

            while (tempval.getnextnode() != null) {

                tempval = tempval.getnextnode();

            }

            tempval.setnextnode(listingNode);

        }

    }

    public listpro fetch(String name) {

        ListingNode tempval = headnode;

        while (tempval != null) {

            if(tempval.getListing().getNamedata().equalsIgnoreCase(name)) {

                return tempval.getListing();

            }

            tempval = tempval.getnextnode();

        }

        return null;

    }

    public boolean delete(String name) {

        ListingNode tempval = headnode;

        boolean found = false;

        if(headnode != null) {

           if(headnode.getListing().getNamedata().equalsIgnoreCase(name)) {

                headnode = headnode.getnextnode();

                found = true;

            } else {

                while (tempval.getnextnode() != null) {

                    if (tempval.getnextnode().getListing().getNamedata().equalsIgnoreCase(name)) {

                        found = true;

                        tempval.setnextnode(tempval.getnextnode().getnextnode());

                        break;

                    }

                    tempval = tempval.getnextnode();

                }

            }

        }

        return found;

    }

    public void printAll() {

        ListingNode tempval = headnode;

        while (tempval != null) {

            System.out.println(tempval.getListing().toString());

            tempval = tempval.getnextnode();

        }

    }

}
