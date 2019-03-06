/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;
import java.security.MessageDigest ;
/**
 *
 * @author laptop academy
 */
public class StringUtil 
{
    public static String applySHA256(String input) 
    {
        try 
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256") ;
            byte [] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer(); 
            for (int i=0 ; i<hash.length ; ++i)
            {
                String hex = Integer.toHexString(0xff & hash[i]) ;
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (Exception e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
