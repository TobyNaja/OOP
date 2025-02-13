import java.util.ArrayList;

public class CollectionAPI {


    private String firstName;
    private String lastName;
    private ArrayList acct;
    
    public CollectionAPI(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    
    public CollectionAPI() {
        this("", "");
        acct = new ArrayList();
    }

    public void addAccount(Account ac) {
        acct.add(ac);
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return (Account)acct.get(index);
    }
    
    public int getNumOfAccount() {
        return acct.size();
    }
    
    @Override
    public String toString() {
        if ( acct == null ) {
            return firstName + " " + lastName + " doesn’t have account.";
        }
        return firstName + " " + lastName + " has " + acct.size() +" accounts.";
    }
    
    public boolean equals(CollectionAPI c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}

