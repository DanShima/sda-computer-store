
/**
 * Write a description of class HardDisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardDisk extends Component
{
    // instance variables - replace the example below with your own
    private String storageCapacity;
    private String dataTransferRate;
    /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk(String storageCapacity,String dataTransferRate,String company,int cost)
    {
     super(company, cost);
     this.StorageCapacity=StorageCapacity;
     this.DataTransferRate=DataTransferRate;
    }

     public String getStorageCapacity()
    {
        return storageCapacity;
    }
    public String getDataTransferRate()
    {
        return dataTransferRate;
    }
    
    
    public void setStorageCapacity(String storageCapacity)
    { this.storageCapacity = storageCapacity;
    
    }
    public void setDataTransferRate(String dataTransferRate)
    { this.dataTransferRate = dataTransferRate;
    
    }
    public void printHardDiskSummry(){    
    System.out.println("The cost is "+super.getCost()+" and the Storage capacity is "+storageCapacity
                        +" from "+ super.getDescription()+" with "+dataTransferRate+" Data transfer rate.");
    }
}
