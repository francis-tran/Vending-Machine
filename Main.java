import java.util.*;
public class Main
{
	public static void main(String[] args) {
		/**
	     * this method performs a vending machine simulation
	     * and perform operations based on the user's input
	     * @param args - command line arguments (not used)
	     */
	     // Scanner to scan for user's input
		Scanner scan = new Scanner(System.in);
		VendingMachine o = new VendingMachine();
		//Displaying the vending machine menu (by calling its toString method)
		//that has the options for user to choose from
		System.out.println(o.toString());
		String input = scan.nextLine();
		while(!input.equals("F")){
		    //Choosing option A from the vending machine menu
		    if(input.equals("A")){
		        //Check if the product list is empty or not, if so display message
                if(o.getProductList().isEmpty()){
                    System.out.println("Vending Machine is out of stock!");
                }
                //if not displaying the product list
                else{
                    System.out.println(o.getProducts());
                }
		    }
			else if(input.equals("B")){
		        //Displaying the coin value to be inserted
				System.out.println("Insert a coin:\nA) nickel @ 0.05\nB) dime @ 0.10\nC) quarter @ 0.25\nD) dollar @ 1.00");
		        String input1 = scan.nextLine();
		        //Choosing option A that will add a nickel to the vending machine object
		        if(input1.equals("A")){
		            System.out.println("You inserted a nickel.");
		            o.insertCoin(new Coin("Nickel", 0.05));
		        }
		        //Choosing option B that will add a dime to the vending machine object
		        else if(input1.equals("B")){
		            System.out.println("You inserted a dime.");
		            o.insertCoin(new Coin("Dime", 0.10));
		        }
		        //Choosing option C that will add a quarter to the vending machine object
		        else if(input1.equals("C")){
		            System.out.println("You inserted a quarter.");
		            o.insertCoin(new Coin("Quarter", 0.25));
		        }
		        //Choosing option A that will add a dollar to the vending machine object
		        else if(input1.equals("D")){
		            System.out.println("You inserted a dollar.");
		            o.insertCoin(new Coin("Dollar", 1.00));
		        }		        
		        //If the option chosen is invalid, display error message
		        else{
		            System.out.println("Invalid coin inserted");
		        }
		    }
		    else if(input.equals("C")){
		        if(o.getProductList().isEmpty()){
                    System.out.println("Vending Machine is out of stock!");
                }
                else{
                    System.out.println(o.buyProducts()); // prints out list of available products
    		        int input1 = scan.nextInt();
    		        if(input1 >= 0 && input1 < o.getProductList().size()){ // checks if the input is within the ArrayList index range
    		            Product temp = o.getProductList().get(input1);
        		        if(o.getValueOfCoinsInserted() >= temp.getPrice()){ // if the value of coins inserted is greater than or equal to the price of the item
        		            o.getCoinList().clear(); // Clears the ArrayList of coins. No change is given.
        		            o.setValueOfCoinsInserted(0.0); 
        		            temp.decrementAmount(); // Decrease amount of the product by one
        		            if(temp.getAmount() == 0){ // Removes the Product object if the amount reaches 0 to prevent user from buying out of stock Products
        		                o.getProductList().remove(temp);
        		            }
        		            String s = temp.toString();
        		            s = s.substring(0, s.indexOf("Quantity"));
        		            System.out.println("You have bought " + s + "\nNo change given.");
        		        }
        		        else{
        		            System.out.println("Insufficient funds, the following coins have been returned:"); // prints out the refund
        		            System.out.println(o.getCoins());        		            
        		            o.getCoinList().clear();
        		            o.setValueOfCoinsInserted(0.0);        		            
        		        }
    		        }
    		        else{
    		            System.out.println("The Vending Machine could not find the item at slot " + input1 + "."); // error message when user inputs an invalid index
    		        }
                }
		    }
		    //Choosing option D from the vending machine menu
		    else if(input.equals("D")){
		        //Inputting the product's name from the user
		    	System.out.println("Name:");
		        String input1 = scan.nextLine();
		        //Inputting the product's price from the user
		        System.out.println("Price:");
		        double input2 = scan.nextDouble();
		        //Inputting the product's amount from the user
		        System.out.println("Amount:");
		        int input3 = scan.nextInt();
		        //Check if the amount number is invalid (less than 1), if so display error message
		        if(input3 < 1){
		            System.out.println("Error: invalid amount was given");
		        }
		        //If not add the product to the list
		        else{
    		        o.addProduct(new Product(input1, input2, input3));
		        }
		    }
		    //Choosing option E from the vending machine menu
		    else if(input.equals("E")){
		        //Check if the coin list in the machine is empty, if so display message
		    	if(o.getCoinList().isEmpty()){
		            System.out.println("No coins were inserted.");
		        }
		        //if not returning the coin to the customer and empty the coins
		    	//in the vending machine (coin list becomes empty and the values inserted becomes 0)
		    	else{
		            System.out.println("The following coins have been returned:");
		            System.out.println(o.getCoins());
        		    o.getCoinList().clear();
        		    o.setValueOfCoinsInserted(0.0);  	
		        }
		    }
			//Displaying the vending machine menu until the users presses F
		    System.out.println(o.toString());
		    input = scan.nextLine();
		}
		scan.close();
	}
}
