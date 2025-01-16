package com.mycompany.lab07_01;

public class Account {
    protected double balance;
     protected String name;
    
    public Account(double balance , String name){
        this.balance = balance;
        this.name = name;
        
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void deposit(double a){
        if (a >= 0){
            this.setBalance(this.getBalance() + a);
            System.out.println(a+" baht is deposited to "+this.getName() + ".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(double a){
        if (a >= 0){
            if (this.getBalance() - a >= 0){
                this.setBalance(this.getBalance() - a);
                System.out.println(a+" baht is withdrawn from "+this.getName()+".");
            }else{
                System.out.println("Not enough money!");
            }
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void showAccount(){
        System.out.println(this.name+" account has "+this.balance+" baht.");
    }
}
