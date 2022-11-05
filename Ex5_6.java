/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_6;
class Account{
    double ibal=0.0d,irate=0.0d,bal=0.0d,ir=0.0d,z=0.0d,netamount=0.0d;
    Account(double initial,double interest){
    ibal=initial;
    irate=interest;
    z=addInterest();
    System.out.println("The resulting balance is $"+z);
    }
    double addInterest(){
    ir=ibal*(irate/100);
    netamount=ibal+ir;
    return netamount;
    }}
/** 
 *
 * @author SCC
 */
public class Ex5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Account a1=new Account(1000,10);

    }
    
}







/*class Account{
    double ibal=0.0d,irate=0.0d,bal=0.0d,ir=0.0d,z=0.0d,netamount=0.0d;
    Account(double initial,double interest){
    ibal=initial;
    irate=interest;
    z=addInterest();
    System.out.println("The resulting balance is $"+z);
    }
    double addInterest(){
    ir=ibal*(irate/100);
    netamount=ibal+ir;
    return netamount;
    }
}
class SavingsAccountTester{
    public static void main(String args[]){
    Account a1=new Account(1000,10);
    }
}
/**C:\>java SavingsAccountTester
The resulting balance is $1100.0*/
