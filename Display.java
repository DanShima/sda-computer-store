
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Display
{
    // instance variables - replace the example below with your own
    private int cost;
    private int screenSize;
    private String resolution;
    private String name;
    private int powerConsumption;

    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        // initialise instance variables
    cost = 1000;
    screenSize = 20;
    resolution = "1600 x 1200";
    name = "Dell"; 
    powerConsumption = 25;
    }
    
    public Display(int cost, int screenSize,String resolution,String name,int powerConsumption)
    {
        // initialise instance variables
    this.cost = cost;
    this.screenSize = screenSize;
    this.resolution = resolution;
    this.name = name; 
    this.powerConsumption = powerConsumption;
    }

    public int getCost()
    {
        return cost;
    }
    
    public void setCost(int cost){
    
        this.cost = cost;
    }
    
     public String getName()
    {
        return name;
    }
    
    public void setName(String name){
    
        this.name = name;
    }
    
    
    public int getScreenSize()
    {
        return screenSize;
    }
     
    public void setScreenSize(int screenSize)
    {
        this.screenSize = screenSize; 
    }
    
    //
    public String getResolutuion()
    {
        return resolution;
    }
    
    public void setResolution(String Resolution)
    {
        this.resolution = resolution;
    }
    
    //
    public int getPowerConsumtion()
    {
        return powerConsumption;
    }
    
     public void setPowerConsumtion(int powerConsumption)
    {
        this.powerConsumption = powerConsumption;
    }
    
    public void printDisplaySummary(){
    
        System.out.println("the cost of a " + name + " monitor is " + cost +
                        "\nwith specifications: \nScreen size: "+ screenSize
                        + "\nResolution: " + resolution + 
                        "\nPower consumption" + powerConsumption);
    
    
    
    }
}
