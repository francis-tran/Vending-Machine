
public class Coin{
    double value;
    String name;
    /**
   	 * Null constructor for the Coin class.
   	 */
    public Coin(){
        value = 0;
        name = "";
    }
    /**
  	 * Initializes Coin class's data which is the name and its value.
  	 */
    public Coin(String name,double value){
        this.name = name;
        this.value = value;
    }
    /**
   	 *The set method that changes the name of the coin.
   	 *@param the new name of the coin object.
   	 */ 
    public void setName(String n){
        name = n;
    }
    /**
   	 *The get method that returns the name of coin.
   	 *@return a string - the name of the coin object.
   	 */ 
    public String getName(){
        return name;
    }
    /**
   	 *The get method that returns the value of coin.
   	 *@return a double - the value of the coin object.
   	 */
    public double getValue(){
        return value;
    }
    /**
   	 *The set method that changes the value of the coin.
   	 *@param the new value of the coin object.
   	 */ 
    public void setValue(double x){
        value = x;
    }
    /**The toString method that returns a string containing the coin's name
     * and its value
     * @return a string - containing the name and the value
     */
    public String toString(){
        return name + " @ " + value;
    }
}