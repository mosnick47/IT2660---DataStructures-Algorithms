/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.LinkedList;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author nmosinski
 */
public class Graph {
    
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
    
    // Node class to create Node objects
    public class Node
    {
        private int id;
        private int value;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        
        Node(int id, int value)
        {
            this.id = id;
            this.value = value;
        }
    } 
    
    private Node getNode(int id) 
    {
        Node s = nodeLookup.get(id);
        return s; 
    }
    
    public void addEdge(int source, int destination)
    {
        Node s = getNode(source);
        Node d = getNode(destination);
        
        s.adjacent.add(d);
    }
    
    // Recursive method to checks to see if there is a path from one Node to the next
    // Depth-First Search
    public boolean hasPathDFS(int source, int destination)
    {
        Node s = getNode(source);
        Node d = getNode(destination);
        
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(s, d, visited);
    }
    
    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited)
    {
        if(visited.contains(source.id))
        {
            return false;
        }
        
        visited.add(source.id);
        if(source == destination)
        {
            return true;
        }
        
        for(Node child : source.adjacent)
        {
            if(hasPathDFS(child, destination, visited))
            {
                return true;
            }
        }
        return false;                
    }
    
    // Recursive method to checks to see if there is a path from one Node to the next
    // Breadth-First Search
    private boolean hasPathBFS(Node source, Node destination)
    {
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<Integer>();
        nextToVisit.add(source);
        
        while(!nextToVisit.isEmpty())
        {
            Node node = nextToVisit.remove();
            
            if(node == destination)
            {
                return true;
            }
            
            if(visited.contains(node.id))
            {
                continue;
            }
            
            visited.add(node.id);
            
            for(Node child : node.adjacent)
            {
                nextToVisit.add(child);
            }
        }
        
        return false;
    }
    
}
