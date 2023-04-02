/**
 * Truck class of the Java program.
 */

public class BarryUKolmarFoodTruck extends Thrower {
 
    /**
     * Number of trays
     */
	int trays;
    
    /**
     * Creates a new tray
     *
     * @param c  the tray color
     * @param l  the state of the tray load
     */
	public Truck(String c, boolean l){
	    super(c,l);
	    trays = 0;
	}
    
    /**
     * Creates a new truck
     *
     * @param c  the truck color
     * @param l  the state of the tray load
     * @param t  the number of trays
     */
	public Truck(String c, boolean l, int t){
	    trays= t;
	}
    
 	/**
     * Returns a String representation of the truck
     *
     * @return the String representation of the truck
     */
	public String toString(){
	   String state = "";
	    if(load){
	        state = "on";
	    }else{
	        state = "off";
	    }
	    String result1 = "This truck is "+color+", loads are "+state;
	    String result2 = " and carries "+trays+" trays.";
	    return result1+result2;
	}
	
	/**
     * Prints a description of the truck to the console
     *
     */
	public void printDescription(){
	    System.out.println(toString());
	}
    
}
