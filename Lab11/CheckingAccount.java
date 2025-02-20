public class CheckingAccount extends Account{
    private double credit;
   
    public CheckingAccount() {this(0.0,"",0.0);}
    public CheckingAccount(double balance, String name,double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    @Override
    public void withdraw(double a) throws WithdrawException {
        if (a >= 0) {
            if ((balance - a) >= 0) {
                balance -= a ;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else if (((balance - a) < 0) && (((balance - a) + credit) >= 0)) {
                credit -= a - balance;
                balance = 0;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else if (((balance - a) < 0) && (((balance - a) + credit) < 0)) {
                throw new WithdrawException("Account " + name + " has not enough money!");
            }
        }
        else {
            throw new WithdrawException("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(String a){
        double amount = Double.parseDouble(a);
        if (amount > 0){
            if (this.getBalance() - amount >= 0){
                this.setBalance(this.getBalance() - amount);
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.credit+".");
            }else if (this.getBalance() - amount + this.getCredit() >= 0){
                   credit = this.credit - (amount - this.getBalance());
                this.setBalance(0);
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.credit+".");
            }else{
                System.out.println("Not enough money!");
            }
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    @Override
    public String toString(){
        return "The "+ this.getName() + " account has " + this.getBalance() + " baht and " + this.credit + " credits.";
    }
}
