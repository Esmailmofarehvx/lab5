/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_9;
 class CashRegister {
    double price;
    String purchased;
    double total;
    String list = "";

    public void getInfo (String purch, double p) {
        purchased = purch;
        price = p;
        total = total + price;
        list = list + "\n" + purchased.concat(String.valueOf(price));
    }
    public void printReceipt ( ) {
        System.out.println("Purchased Items:");
        System.out.println(list);
        System.out.println("The total amount: " + total);
    }
}


// to test CashRegister class
public class Ex5_9 {

    public static void main(String[] args) {
        CashRegister me = new CashRegister( );
        me.getInfo("Chocalate ",10);
        me.getInfo("Chips ",5);
        me.getInfo("Pepsi ",15);            
        me.getInfo("chocalate ",8);
        me.getInfo("chocalate ",12);
        me.printReceipt( );
    
}}





/*public class CashRegister {
    double price;
    String purchased;
    double total;
    String list = "";

    public void getInfo (String purch, double p) {
        purchased = purch;
        price = p;
        total = total + price;
        list = list + "\n" + purchased.concat(String.valueOf(price));
    }
    public void printReceipt ( ) {
        System.out.println("Purchased Items:");
        System.out.println(list);
        System.out.println("The total amount: " + total);
    }
}


// to test CashRegister class

public class CashTest {
    public static void main(String[] args) {
        CashRegister me = new CashRegister( );
        me.getInfo("Chocalate ",10);
        me.getInfo("Chips ",5);
        me.getInfo("Pepsi ",15);            
        me.getInfo("chocalate ",8);
        me.getInfo("chocalate ",12);
        me.printReceipt( );
    }
}*/
