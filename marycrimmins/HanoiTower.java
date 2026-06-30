package marycrimmins;

public class HanoiTower {
    private int discStack[];
    private int discsOn;
    private String rodName;

    /**
     * Constructor which represents an empty rod/tower
     * @param newMax used to initialize the array to hold a given number of discs
     * @param newRod initializes the rod name variable
     */
    public HanoiTower(int newMax, String newRod){
        this.rodName = newRod;
        this.discsOn = 0;
        int[] discs = new int[newMax];
        this.setDiscStack(discs);
    }

    /**
     * Adds new discs to the discs array
     * @param newDisc the disc number to be added to the tower
     * @throws TowerOverflowException if the tower is full
     * @throws IllegalPushException if the disc being added is larger than the disc on top
     */
    public void push(int newDisc) throws TowerOverflowException, IllegalPushException{
        int discsOn = this.getNumOn();
        int [] discStack = this.getDiscStack();

        if (discsOn == discStack.length){
            throw new TowerOverflowException();
        }
        else if (discsOn > 0 && newDisc > discStack[discsOn - 1]){
            throw new IllegalPushException();
        }
        discStack[discsOn] = newDisc;
        discsOn++;
        this.setNumOn(discsOn);
        this.setDiscStack(discStack);
        }
    


/**
 * Overrides toString to return the tower object name annd the disc numbers from the bottom to the top.
 * @return tower name and disc numbers
 */
    @Override 
    public String toString(){
        String result = " ";
        for (int i = 0; i < this.discsOn; i++){
            result = result + " " + discStack[i]; 
        }
        return "Rod " + rodName + ": " + result;
    }

/**
 * Accessor method for the number of discs on the tower
 * @return number of discs on tower
 */
    public int getNumOn(){
        return this.discsOn;
    }
/**
 * Mutator method for the number of discs on the tower
 * @param discsOn number of discs on the tower
*/
    public void setNumOn(int discsOn){
        this.discsOn = discsOn;
    }

/**
 * Accessor method for the array that stores discs
 * @return the array storing the discs
 */
    public int[] getDiscStack(){
        return this.discStack;
    }
/**
 * Mutator method for the array that stores the discs
 * @param discStack the array storing the discs
*/
    public void setDiscStack(int[] discStack){
        this.discStack = discStack;
    }
}
