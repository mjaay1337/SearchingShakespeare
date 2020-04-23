/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuffixTree;

// A Trie of all suffixes 

import java.util.ArrayList;
import java.util.List;

public class Suffix_tree { 
  
    SuffixTrieNode root = new SuffixTrieNode(); 
  
    // Constructor
    Suffix_tree() {} 
  
    public List find(String pat) { 
      
        List<Integer> result = root.search(pat); 
        List resList = new ArrayList();
        if (result == null) {
            System.out.println("Pattern not found"); 
            return result;
        }else { 
            int patLen = pat.length(); 
            for (Integer i : result) {
                System.out.println("Pattern " + ": " + pat + " :" + " found at position " + (i - patLen)); 
                resList.add((i - patLen));
            }
        } 
        return resList;
    }
    
    public void add(String txt){
        
        for (int i = 0; i < txt.length(); i++) 
            root.insertSuffix(txt.substring(i), i); 
        
    }
    
    public String locate(String pat){
        
        SuffixTrieNode result = root.search_root(pat); 
        
        if (result == null){ 
            System.out.println("Pattern not found"); 
            return "";
        }else { 
            int patLen = pat.length(); 
            System.out.println("Root found at:  " + result.indexes.get(0));
            return Integer.toString(result.indexes.get(0));
        } 
    }

}
