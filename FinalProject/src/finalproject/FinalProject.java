/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import finalproject.Graph.Node;
import java.util.Random;

/**
 *
 * @author nmosinski
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();        
        int num = random.nextInt(300000) + 1;
        
        Graph graph = new Graph();
        Node n = graph.new Node(0, num);
        
        // Genereate 100000 Nodes and add them to the list
        for(int i = 0; i < 100000; i++ )
        {
            // Generate random number
            num = random.nextInt(300000) + 1;
            
            // Add nodes to list of nodes 100000 times
            n.adjacent.add(graph.new Node(i, num));
        }                      
    }
    
}
