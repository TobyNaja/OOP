package com.mycompany.lab07_01;

public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){this("","",null);}
        
    public Customer(String firstName, String lastName){
        this(firstName,lastName,null);
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    
    @Override
    public String toString(){
        if (this.acct == null){
            return this.firstName +" "+ this.lastName + " doesn’t have account.";
        }else{
            return "The " + this.firstName + " account has " + this.acct.getBalance() + " baht and " + this.acct.getCredit()+ " credits.";
        }
    }
    
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}
