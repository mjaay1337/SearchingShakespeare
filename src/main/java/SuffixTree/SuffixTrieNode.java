/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuffixTree;

import java.util.LinkedList; 
import java.util.List; 

public class SuffixTrieNode { 
  
    final static int MAX_CHAR = 256; 
  
    SuffixTrieNode[] children = new SuffixTrieNode[MAX_CHAR]; 
    List<Integer> indexes; 
  
    public SuffixTrieNode() // Constructor 
    { 

        indexes = new LinkedList<Integer>(); 
  
 
        for (int i = 0; i < MAX_CHAR; i++) 
            children[i] = null; 
    } 
  
    public void insertSuffix(String s, int index) { 
          
        indexes.add(index); 
  
        if (s.length() > 0) { 
          
            char cIndex = s.charAt(0); 
  
            if (children[cIndex] == null) 
                children[cIndex] = new SuffixTrieNode(); 
  
            // Recur for next suffix 
            children[cIndex].insertSuffix(s.substring(1), 
                                              index + 1); 
        } 
    } 
  
    public List<Integer> search(String s) { 

        if (s.length() == 0) 
            return indexes; 
  
        if (children[s.charAt(0)] != null) 
            return (children[s.charAt(0)]).search(s.substring(1)); 
  
        else
            return null; 
    } 
    
    public SuffixTrieNode search_root (String s) { 

        if (children[s.charAt(0)] != null) 
            return children[s.charAt(0)]; 
  
        else
            return null; 
    } 
} 
  

