package TowersOfHanoi;

public class EmptyTowerException extends Exception {
/**
 *  Creates an instance of TowerOverflowException without detail message
 */
    public EmptyTowerException(){
        super("There are no discs to remove.");
    }

/**
 *  Creates an instance of TowerOverflowException with specified detail message
 * @param msg the detail message
 */
    public EmptyTowerException(String msg){
        super(msg);
    }

}
