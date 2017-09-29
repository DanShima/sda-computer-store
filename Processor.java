
/**
 * Write a description of class Processor here.
 *
 * @Danning, Max & Waseem
 * @version (2017/09/29)
 */
public class Processor extends Component 
{
    private double clockSpeed;
   
    /**
     * Constructor for objects of class Processor
     */
    public Processor()
    {
        super("AMD", 80);
        clockSpeed = 1.8;
    }     
    
    
    /**
     * Constructor for objects of class Processor
     */
    public Processor(String manufacturer, double clockSpeed, int cost)
    {
        super(manufacturer, cost);
        this.clockSpeed = clockSpeed;
       
    }

    /**
     * Getter for the variable clockspeed
     *
     * @return    the clockspeed of the processor
     */
    public double getClockSpeed(){
        return clockspeed;
    }
    
    /**
     * Setter for the variable clockspeed
     *
     * @param   the new speed of the processor
     */
    public void changeClockspeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
    
    /**
     * print the details of the processor
     */
    public void printProcessorSummary()
    {
        System.out.println("The manufacturer of this computer is " + super.getManufacturer() + 
        " and the cost is " + super.getCost() + " and the clockspeed is " + clockSpeed);
    }
}
