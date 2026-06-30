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

        }
        
        HanoiSimulation simulation = new HanoiSimulation();

    }
}
