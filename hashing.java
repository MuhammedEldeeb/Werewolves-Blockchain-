/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author laptop academy
 */
public class hashing {
    public void hash(String text) throws NoSuchAlgorithmException
    {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte [] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8)) ;
        System.out.println(hash);
    }
    
    
}
