import java.util.ArrayList;


/**
 * Write a description of class ComputerStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComputerStore
{
    // instance variables - replace the example below with your own
    private ArrayList<Computer> computers;

    /**
     * Constructor for objects of class ComputerStore
     */
    public ComputerStore()
    {
        // initialise instance variables
        computers = ArrayList<>();
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean addComputer(Computer newComputer) {
    
        computers.add(newComputer);
    
        return true;
    }
    
    public boolean removeComputer(int index) {
       
        if(isValidIndex(index)){
            
            computers.remove(index);
            return true;
        
        }else{
        
            return false;
        }
    }

    public void printAllComputers( ) {
    	
        for(Computer computer : computers){
        
            System.out.println(computer.getDetails());
        }
    }
    
    public void printTotalValue( ) {
    	
        int totalPrice = 0;
        for(Computer computer : computers){
            
            totalPrice += computer.getCost();
        }
        
        System.out.println("The total cost for all computers in stock is " 
                            + totalPrice);
    }
    
    private boolean isValidIndex(int index){
    
        if(index >= 0 && index <computers.size()){
        
            return true;
        }else{
        
            return false;
        } 
    }
    
   public Computer findMostExpensiveComputerV1( ) {         
    // This version will use a traditional for loop
     if(isValidIndex(0)){
           Computer expensive = computers.get(0);
         for(int i = 0; i < computers.size(); i++) {
             if(computer.getCost(i) > expensive.getCost()){
                   expensive = computer;
               }           
        } 
         return expensive;         
    } 
       return null;
   }
       
    public Computer findMostExpensiveComputerV2( ) { }
    // This version will use a traditional while loop
    
      public Computer findMostExpensiveComputerV1( )
      {         
         if(isValidIndex(0))
         {
              Computer expensive = computers.get(0);
              int i = 0; 
             while(i < computers.size()) 
               {
                   if(computer.getCost(i) > expensive.getCost())
                       {
                         expensive = computer;
                       }  
                  i++ ;
               } 
            return expensive;         
          } 
       return null;
      }
       
    public Computer findMostExpensiveComputerV3( ) { }
    // This version will use a for-each loop
     if(isValidIndex(0)){
           Computer expensive = computers.get(0);
           
           for(Computer computer : computers){
               
               if(computer.getCost() > expensive.getCost()){
                   expensive = computer;
               }
            
            }
            return expensive;
       }
       return null;
    }
                   
                   // This version will use an Iterator object with a while loop
    public Computer findMostExpensiveComputerV4( ){ 
          if(isValidIndex(0)){
             Iterator<Computer> it = computers.iterator();
             while(it.hasNext()){  
                 Computer expensive = computers.get(0);
                 Computer computer = it.next();
                  if(computer.getCost() > expensive.getCost()){
                      expensive = computer;
                               }        
         
                        }
             return expensive ;
          }
        return null ;
    }


}
