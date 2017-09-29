
/**
 * Write a description of class Processor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Processor
{
    private String manufacturer;
    private int clockspeed;
    private int cost;

    /**
     * Constructor for objects of class Processor
     */
    public Processor(String manufacturer, int clockspeed, int cost)
    {
        this.manufacturer = manufacturer;
        this.clockspeed = clockspeed;
        this.cost = cost;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //getters
    public String getManufacturer() {
        return manufacturer;
    }
    
    public int getClockspeed(){
        return clockspeed;
    }
    
    public int getCost() {
        return cost;
    }
    
    //setters
    public void changeManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void changeClockspeed(int clockspeed) {
        this.clockspeed = clockspeed;
    }
    
    public void changeCost(int cost) {
        this.cost = cost;
    }
    
    public void printProcessorSummary()
    {
        System.out.println("The manufacturer of this computer is " + getManufacturer() + 
        " and the cost is " + getCost() + " and the clockspeed is " + getClockspeed());
    }
}
