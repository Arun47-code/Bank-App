/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp;

/**
 *
 * @author arun
 */
public class Account {
    
    private String accountNumber;
    private String accountHolder;
    private String openDate;
    private double balance;
    
    public Account(String accountNumber, String accountHolder, String openDate,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.openDate = openDate;
        this.balance = balance;
    }
    public void withdrow(double amount){
        this.balance =  this.balance - amount;
    }
    public void deposite(double amount){
        this.balance = this.balance + amount;
        
    }
    public void transfer(Account a, double amount){
        this.withdrow(amount);;
        a.deposite(amount);
    }
     public String getAccountHolder(){
        return this.accountHolder;
    }
    
     public String getOpenDate(){
         return this.openDate;
     }
    
    public double getBalance(){
        return this.balance;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return this.accountNumber;
    }
    
   
    
  
}
