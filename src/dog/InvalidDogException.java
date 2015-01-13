/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Owner_HP
 */
public class InvalidDogException extends RuntimeException{
    
    
    public InvalidDogException()
    {
        super("Error in Dog.");
    }
    
    public InvalidDogException(String errMsg)
    {
        super(errMsg);
    }
}
