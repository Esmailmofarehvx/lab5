
package ex5_2;

public class Ex5_2 {
private double balance;

    public Ex5_2(){
        balance=0;
    }
    public Ex5_2(double initial){
        balance=initial;
    }

    public void mystery(Ex5_2 that,double amount){
        this.balance-=amount;
        that.balance+=amount;

    }
    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance)
            balance-=amount;
    }

    public void addintrest(double rate){
        balance+=(rate/100)*balance;
    }

    public double getbalance(){
        return balance;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        
        Ex5_2 account=new Ex5_2(1000);
        account.deposit(500);
        account.withdraw(1000);
        account.addintrest(50);
        account.mystery(account,250);
        System.out.println(account.getbalance());
    }
}


