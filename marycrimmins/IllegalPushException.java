package marycrimmins;

public class IllegalPushException extends Exception {

/**
 * Creates a new instance of IllegalPushException without detailed message
 */
    public IllegalPushException(){
        super("This disc is too large to be stacked.");
    }
/**
 * Creates an instance of IllegalPushException with a specified message
 * @param msg the specified message
 */
    public IllegalPushException(String msg){
        super(msg);
    }
}
