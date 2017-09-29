
/**
 * Write a description of class Component here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Component
{
    // instance variables - replace the example below with your own
    private String manufactor;
    private int cost;
  
    /**
     * Constructor for objects of class Component
     */
    public Component(String man, int cost)
    {
      this.manufactor = man;
      this.cost = cost;
    }
    
    public int getCost(){
         return cost;
    }
    
     public void setCost(int cost){
        this.cost = cost;
    }
    
    public String getDescription(){
        return manufactor;
    }
    
    public void setDescription(String man){
        this.manufactor = man;
    }
}
