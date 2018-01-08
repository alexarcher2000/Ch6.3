import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{
    
    public static void main (String[] args)

    {

        ArrayList<Item> cart = new ArrayList<Item>();


        Item item;

        String itemName;

        double itemPrice;

        int quantity;

        Scanner scan = new Scanner(System.in);


        String keepShopping = "y";


        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();


                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();


                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();


                // *** create a new item and add it to the cart

                Item thing = new Item("Watermelon" , 3.0, 3);



                // *** print the contents of the cart object using println

                System.out.println(thing.toString());

                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();

            }


        checkOut(cart);

    }


   public static void checkOut(ArrayList<Item> yourCart) {
        Scanner scan = new Scanner(System.in);
        //You do NOT need a getter method (think about public instance variables)

        //Print the contents of the cart (you may use the toString() method
        while (!answer.equals("n")){
            for(int i = 0; i < yourCart.size(); i++) {
                System.out.println("Remove this time (y/n)? " + yourCart.get(i).name);
                String remove = scan.next();
                
            }
        }
        //Ask the user if they would like to remove an item.  If yes, remove that it
        System.out.println("Would you like to remove and items?");
        String answer = scan.next();

        //Print final total of items and final price (total)
        int totalItems = 0;
        double totalPrice = 0.0;
        for (int i = 0; i < yourCart.size(); i++){
            totalItems += yourCart.get(i).quantity;
            totalPrice += yourCart.get(i).price;
        }
        System.out.println("Your cart cointains: " + yourCart);
        System.out.println("You have " + totalItems + " total items in your cart, that cost: " + totalPrice);

}

}