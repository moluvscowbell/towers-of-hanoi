package marycrimmins;

public class TowerOverflowException extends Exception{
/**
 * Creates an instance of TowerOverflowException without detail message
 */
    public TowerOverflowException(){
        super("This tower is stacked too high.");
    }
/**
 * Creates an instance of TowerOverflowException with specified message
 * @param msg detail message
 */
    public TowerOverflowException(String msg){
        super(msg);
    }
}
