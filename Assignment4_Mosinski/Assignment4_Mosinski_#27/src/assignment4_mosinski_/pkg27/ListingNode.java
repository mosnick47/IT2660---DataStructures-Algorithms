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
public class ListingNode {

    private listpro listing11;

    private ListingNode nextnode;

    public ListingNode(listpro listing11) {

        this.listing11 = listing11;

    }

    public listpro getListing() {

        return listing11;

   }

    public void setListing(listpro listing11) {

        this.listing11 = listing11;

    }

    public ListingNode getnextnode() {

        return nextnode;

    }

    public void setnextnode(ListingNode nextnode) {

        this.nextnode = nextnode;

    }
}