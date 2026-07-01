package marycrimmins;

/**
 * @author Mary Crimmins
 * 
 * HanoiSimulation runs the simulation to move given discs from towerA to towerB 
 * using towerC as an auxillary tower.
 */
public class HanoiSimulation {
    private int totalDiscs;
    private HanoiTower towerA;
    private HanoiTower towerB;
    private HanoiTower towerC;

    /** 
     * Constructor which initializes number of discs and tower objects
     * All discs are pushed to tower A for the beginning of the simulation
     * @param numDiscs number of discs in the simulation
     */
    public HanoiSimulation(int numDiscs){
        super();
        this.totalDiscs = numDiscs;
        this.towerA = new HanoiTower(totalDiscs, "A");
        this.towerB = new HanoiTower(totalDiscs, "B");
        this.towerC = new HanoiTower(totalDiscs, "C");
        try{
            for (int i = 0; i < totalDiscs; i++){
                this.towerA.push(totalDiscs - i);
            }
        }
        catch(IllegalPushException ipe){
            System.out.println(ipe.getMessage());
        }
        catch(TowerOverflowException toe){
            System.out.println(toe.getMessage());
        }
    }

    /**
     * Begins running this simulation
     * Displays initial placement of discs on towerA, towerB, and towerC
     */
    public void runSim(){
        this.displayTowers();
        this.moveDiscs(towerA, towerB, towerC, totalDiscs);
    }

    /**
     * Moves the given number of discs to the desired destination using a series of recursive calls
     * @param src source HanoiTower disc location
     * @param dst destination HanoiTower for discs to be moved to
     * @param aux auxiliary for disc to be temporarily held before dst
     * @param totalDiscs number of discs to be moved.
     */
    private void moveDiscs(HanoiTower src, HanoiTower dst, HanoiTower aux, int totalDiscs){
        try{
            if(totalDiscs == 1){
                int disc = src.pop();
                dst.push(disc);
                this.displayTowers();
            }
            else{
                moveDiscs(src, aux, dst, totalDiscs - 1);
                int disc = src.pop();
                dst.push(disc);
                this.displayTowers();
                moveDiscs(aux, dst, src, totalDiscs - 1);
            }
        }
        catch (TowerOverflowException toe){
            System.out.println(toe.getMessage());
        }
        catch (IllegalPushException ipe){
            System.out.println(ipe.getMessage());
        }
        catch (EmptyTowerException ete){
            System.out.println(ete.getMessage());
        }
    }

    /**
     * Displays the HanoiTower objects in order
     */
    private void displayTowers(){
        System.out.println(this.towerA);
        System.out.println(this.towerB);
        System.out.println(this.towerC);
        System.out.println("");
    }
}
