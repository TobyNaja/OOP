package com.mycompany.lab07_01;

public class Customer {
    private String fristName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){this("","",null);}
        
    public Customer(String fristName, String lastName){
        this(fristName,lastName,null);
    }
    
    public Customer(String fristName, String lastName, CheckingAccount acct){
        this.fristName = fristName;
        this.lastName = lastName;
        this.acct = acct;

    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
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
            return this.fristName +" "+ this.lastName + " doesn't have account.";
        }else{
            return "The " + this.fristName + " account has " + this.acct.getBalance() + " bath and " + this.acct.getCredit()+ " credits.";
        }
    }
    
    public boolean equals(Customer c){
        return this.fristName.equals(c.fristName) && this.lastName.equals(c.lastName);
    }
}
