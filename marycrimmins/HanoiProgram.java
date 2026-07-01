package marycrimmins;
import java.util.Scanner;

public class HanoiProgram {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String ans;

        System.out.println("Welcome to the Towers of Hanoi simulation.");
        
        do{
            System.out.println("Enter the number of disks to use in the simulation: ");
            int numDiscs = keyboard.nextInt();
            System.out.println("");

            HanoiTower first = new HanoiTower(numDiscs, "A");
            HanoiTower second = new HanoiTower(numDiscs, "B");
            HanoiTower third = new HanoiTower(numDiscs, "C");

            HanoiSimulation newSim = new HanoiSimulation(numDiscs);
            newSim.runSim();

            System.out.println("Would you like to run another simulation? Y/N");
            ans = keyboard.next();
        }
        while (ans.equalsIgnoreCase("Y"));

        System.out.println("Thank you for using the Towers of Hanoi simulator.");
        
        keyboard.close();

    }
}
