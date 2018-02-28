/* By Hildana.M
 * BillOfSale.java
 * This program calculates the purchased price, total, taxes, 
 * and change of a shirt
 * Feb/27/2018 
 */

package billofsale;


public class BillOfSale {


    public static void main(String[] args) {
        
        double shirt = 12.49;
        int bill = 20;
        double tax = 0.13;
        double totalPrice = shirt+(tax*shirt); //the price of the shirt with tax
        double change = bill - totalPrice; //the change 
        
        //prints the answers 
        System.out.print("price of shirt = " + shirt + "$" + "\nbill used = " + bill + "$");
        System.out.print("\ntax = " + tax + "\ntotal price = " + totalPrice + "$");
        System.out.print("\nchange = " + change + "$" );
     
    }
    
}
