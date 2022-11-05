/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_4;
 class BankAccount
{
private double balance;

public BankAccount()
{
balance = 0;
}

public BankAccount(double initialBalance)
{
balance = initialBalance;
}

public void deposit(double amount)
{
double newBalance = balance + amount;
balance = newBalance;
}

public void withdraw(double amount)
{
double newBalance = balance - amount;
balance = newBalance;
}

public double getBalance()
{
return balance;
}
public void addInterest(double rate)
{
//. . .
}
}

public class Ex5_4 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BankAccount momsSavings = new BankAccount(1000);
momsSavings.addInterest(10);
System.out.print("Balance: ");
  System.out.println();
System.out.println("Expected: . . .");
    }
    
}














/**************public class BankAccount
{
private double balance;

/**
Constructs a bank account with a zero balance
/
public BankAccount()
{
balance = 0;
}

/**
Constructs a bank account with a given balance
@param initialBalance the initial balance
/
public BankAccount(double initialBalance)
{
balance = initialBalance;
}

/**
Deposits money into the bank account.
@param amount the amount to deposit
/
public void deposit(double amount)
{
double newBalance = balance + amount;
balance = newBalance;
}

/**
Withdraws money from the bank account.
@param amount the amount to withdraw
/
public void withdraw(double amount)
{
double newBalance = balance - amount;
balance = newBalance;
}

/**
Gets the current balance of the bank account.
@return the current balance
/
public double getBalance()
{
return balance;
}

/**
. . .
/
public void addInterest(double rate)
{
. . .
}
}


/**
Tests the bank account class with interest.
/
public class BankAccountTester
{
public static void main(String[] args)
{
BankAccount momsSavings = new BankAccount(1000);
momsSavings.addInterest(10);
System.out.print("Balance: ");
System.out.println(. . .);
System.out.println("Expected: . . .");
}
}*/
