
/**
 * Write a description of class Computer here.
 *
 * @author (Armin)
 * @version (a version number or a date)
 */
public class Computer
{
    // instance variables - replace the example below with your own
    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;
    private int computerCost;
    
    public Computer(){
        theProcessor = new Processor();
        theHardDisk = new HardDisk();
        theDisplay = new Display();
    }
    
    public void printComputerSummary(){
    
        theProcessor.printProcessorSummary();
        theHardDisk.printHardDiskSummary();
        theDisplay.printDisplaySummary();
        
    
    }
    
    public void costOfComputer(){
        int costOfProcessor = theProcessor.getCost();
        int costOfHardDisk = theHardDisk.getCost();
        int costOfDisplay = theDisplay.getCost();
        int costOfComputer = costOfProcessor + costOfHardDisk + costOfDisplay;
        System.out.println("Cost of computer is " + costOfComputer);
    computerCost = costOfComputer;
    }
    
    public int getCost(){
    return computerCost;
    
    }
 
 
    
    
    
}

    

