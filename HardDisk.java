
/**
 * Write a description of class HardDisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardDisk
{
    // instance variables - replace the example below with your own
    private int cost;
    private String StorageCapacity;
    private String DataTransferRate;
    private String Company;
    /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk(String StorageCapacity,String DataTransferRate,String Company,int cost)
    {
     this.StorageCapacity=StorageCapacity;
     this.DataTransferRate=DataTransferRate;
     this.Company=Company;
     this.cost = cost;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getCost()
    {
        return cost;
    }
     public String getStorageCapacity()
    {
        return StorageCapacity;
    }
     public String getCompany()
    {
        return Company;
    }
    public String getDataTransferRate()
    {
        return DataTransferRate;
    }
    public void setcost(int cost)
    { this.cost=cost;
    
    }
    public void setcost(String StorageCapacity)
    { this.StorageCapacity=StorageCapacity;
    
    }
    public void setDataTransferRate(String DataTransferRate)
    { this.DataTransferRate=DataTransferRate;
    
    }
    public void setCompany(String Company)
    { this.Company=Company;
    
    }
    public void printHardDiskSummry(){    
    System.out.println("The cost is "+cost+" and the Storage capacity is "+StorageCapacity+" from "+Company+" with "+DataTransferRate+" Data transfer rate.");
    }
}
