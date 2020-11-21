
public class Product{
    double price;
    String name;
    int amount;
    /**
   	 * Null constructor for the Product class.
   	 */
    public Product(){
        price = 0;
        name = "";
        amount = 0;
    }
    /**
  	 * Initializes Product class's data which is the name, price and the amount.
  	 */
    public Product(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    /**
   	 *The get method that returns the name of the product.
   	 *@return a string - the name of the product object.
   	 */ 
    public String getName(){
        return name;
    }
    /**
   	 *The set method that changes the name of the product.
   	 *@param the new name of the product object.
   	 */ 
    public void setName(String n){
        name = n;
    }
    /**
   	 *The get method that returns the price of the product.
   	 *@return a double - the price of the product object.
   	 */ 
    public double getPrice(){
        return price;
    }
    /**
   	 *The set method that changes the price of the product.
   	 *@param the new price of the product object.
   	 */ 
    public void setPrice(double p){
        price = p;
    }
    /**
   	 *Method that decreases the amount of product
   	 */ 
    public void decrementAmount(){
        amount--;
    }
    /**
   	 *Method that increases the amount of product
   	 */ 
    public void incrementAmount(){
        amount++;
    }
    /**
   	 *The get method that returns the amount of the product.
   	 *@return an int - the amount of the product object.
   	 */ 
    public int getAmount(){
        return amount;
    }
    /**
   	 *The set method that changes the amount of the product.
   	 *@param the new amount of the product object.
   	 */ 
    public void setAmount(int amount){
        this.amount = amount;
    }
    /**The toString method that returns a string containing the product's name, price
     * and the amount
     * @return a string - containing the name, price and the amount of products
     */
    public String toString(){
        return name + " @ " + price + " Quantity: " + amount;
    }
}