
import java.util.ArrayList;

public class Bank {
    
    private String name;
    private String address;
    private ArrayList<BankAccount> listAccount;
    
    public Bank(String name, String address)
    {
        this.name = name;
        this.address = address;
        this.listAccount = new ArrayList<>();
    }
    
    public void addAccount(BankAccount account)
    {
        this.listAccount.add(account);
    }
    
    public void removeAccount(BankAccount account)
    {
        this.listAccount.remove(account);
    }
}
