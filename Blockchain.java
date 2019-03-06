/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.security.NoSuchAlgorithmException;
import com.google.gson.GsonBuilder  ;//JSON format
import java.util.ArrayList;


/**
 *
 * @author laptop academy
 */
public class Blockchain {

    /**
     * @param args the command line arguments
     */
    public static boolean isChainValied()
    {
        Block currentBlock  , previousBlock ; 
        
        for (int i=1 ; i<blockChain.size() ; ++i)
        {
            currentBlock = blockChain.get(i) ;
            previousBlock = blockChain.get(i-1) ; 
            if (!(currentBlock.hash.equals(currentBlock.calculateHash())))
            {
                return false ;
            }
            if (!(previousBlock.hash.equals(previousBlock.calculateHash())))
            {
                return false ; 
            }
             
        }
        return true ;
    }
    public static ArrayList<Block> blockChain = new ArrayList<Block>();
    
    public static void main(String[] args)
    {
        blockChain.add(new Block("Hi i'm the first block:  " , "0"));
        blockChain.add(new Block("Hi i'm the second block: " , blockChain.get(blockChain.size()-1).hash));
        blockChain.add(new Block("Hi i'm the third block:  " , blockChain.get(blockChain.size()-1).hash));
        //to create JSON format 
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        
        System.out.println(blockchainJson);
    }
    
}
