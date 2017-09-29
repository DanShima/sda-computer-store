
/**
 * Write a description of class HardDisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardDisk extends Component
{
    // instance variables - replace the example below with your own
    private String StorageCapacity;
    private String DataTransferRate;
    /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk(String StorageCapacity,String DataTransferRate,String Company,int cost)
    {
     super(Company);
     this.StorageCapacity=StorageCapacity;
     this.DataTransferRate=DataTransferRate;
    }

     public String getStorageCapacity()
    {
        return StorageCapacity;
    }
    public String getDataTransferRate()
    {
        return DataTransferRate;
    }
    
    
    public void setStorageCapacity(String StorageCapacity)
    { this.StorageCapacity=StorageCapacity;
    
    }
    public void setDataTransferRate(String DataTransferRate)
    { this.DataTransferRate=DataTransferRate;
    
    }
    public void printHardDiskSummry(){    
    System.out.println("The cost is "+cost+" and the Storage capacity is "+StorageCapacity+" from "+Company+" with "+DataTransferRate+" Data transfer rate.");
    }
}
