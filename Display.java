
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Display extends Component
{
    // instance variables - replace the example below with your own
    private int screenSize;
    private String resolution;
    private int powerConsumption;

    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        super("Dell", 1000);
        screenSize = 20;
        resolution = "1600 x 1200";
        powerConsumption = 25;
    }
    
    public Display(int cost, int screenSize, String resolution, 
                                    String name,int powerConsumption)
    {
        // initialise instance variables
        super(name, cost);
        this.screenSize = screenSize;
        this.resolution = resolution; 
        this.powerConsumption = powerConsumption;
    }
    
    
    //SCREEN
    public int getScreenSize()
    {
        return screenSize;
    }
     
    public void setScreenSize(int screenSize)
    {
        this.screenSize = screenSize; 
    }
    
    //RESOL
    public String getResolutuion()
    {
        return resolution;
    }
    
    public void setResolution(String Resolution)
    {
        this.resolution = resolution;
    }
    
    //POWER
    public int getPowerConsumtion()
    {
        return powerConsumption;
    }
    
     public void setPowerConsumtion(int powerConsumption)
    {
        this.powerConsumption = powerConsumption;
    }
    
    
    public void printDisplaySummary(){
    
        System.out.println("the cost of a " + super.getDescription() 
                        + " monitor is " + super.getCost() 
                        + "\nScreen size: "+ screenSize 
                        + " inches \nResolution: " + resolution + 
                        "\nPower consumption: " + powerConsumption + "W");               
    
    }
}
