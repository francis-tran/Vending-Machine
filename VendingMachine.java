
import java.util.ArrayList;
public class VendingMachine{
    private double valueOfCoinsInserted;
    private ArrayList<Coin> coinList;
    private ArrayList<Product> productList;
    /**
   	 * Null constructor for the VendingMachine class.
   	 */
    public VendingMachine(){
        valueOfCoinsInserted = 0;
        coinList = new ArrayList<Coin>();
        productList = new ArrayList<Product>();
    }
    /**
   	 * Method that add the coin to the vending machine containing the coin's
   	 * value
   	 */
    public void insertCoin(Coin x){
        valueOfCoinsInserted += x.getValue();
        coinList.add(x);
    }
    /**
   	 *The get method that returns the value of coins inserted.
   	 *@return a double - the value of coins inserted in the vending machine.
   	 */ 
    public double getValueOfCoinsInserted(){
        return valueOfCoinsInserted;
    }
    /**
   	 *The set method that changes the value of coins inserted.
   	 *@param the new values of coins inserted in the vending machine
   	 */ 
    public void setValueOfCoinsInserted(double x){
        valueOfCoinsInserted = x;
    }    
    /**
     * Method that add a new product object to the product list
     * @param x
     */
    public void addProduct(Product x){
        productList.add(x);
    }
    /**
   	 *The get method that returns the list of product.
   	 *@return an arrayList - the list of product in the vending machine
   	 */ 
    public ArrayList<Product> getProductList(){
        return productList;
    }
    /**
   	 *The get method that returns the list of coin.
   	 *@return an arrayList - the list of coin in the vending machine
   	 */ 
    public ArrayList<Coin> getCoinList(){
        return coinList;
    }
    /**
     * The string method that contains the products from the list that the customer chooses to buy
     * @return a string - containing every product from the list that the customer wants to buy
     */
    public String buyProducts(){
        String s = "";
        for(int i = 0; i < productList.size(); i++){
            s += i + ") " + productList.get(i).toString() + "\n";
        }
        return s;
    }
    /**
     * The string method that contains the product from the list
     * @return a string - containing every product from the list
     */
    public String getProducts(){
        String s = "";
        for(int i = 0; i < productList.size(); i++){
            s += productList.get(i).toString() + "\n";
        }
        return s;
    }
    /**
     * The string method that contains the every coin from the coin list
     * @return a string - containing every coin from the coin list
     */
    public String getCoins(){
        String s = "";
        for(int i = 0; i < coinList.size(); i++){
            s += coinList.get(i).toString() + "\n";
        }
        return s;
    }
    /**
     * The Tostring method that displays the options on the vending machine
     * @return a string - containing the options on the vending machine
     */
    public String toString(){
        return "A) Show Products  B) Insert Coins  C) Buy Products D) Add Product  E)Remove Coins  F)Quit";
    }
}