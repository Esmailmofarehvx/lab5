/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_3;
class Account{
    double dep=0.0d,withdr=0.0d,bal=0.0d,z1=0.0d,z2=0.0d,z3=0.0d,balance=0.0d;
    Account(double d,double w){
    dep=d;
    withdr=w;
    z1=getData();
    System.out.println("The remaining balance is $"+z1);
    z2=getData1(400);
    System.out.println("The remaining balance is $"+z2);
    }
    double getData(){
    bal=dep-withdr;
    return bal;
    }
 double getData1(double w){
    withdr=w;
    balance=bal-withdr;
    return balance;
    }
 }
public class Ex5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1=new Account(1000,500);
       
    }
    
}
