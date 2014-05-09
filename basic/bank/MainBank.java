
public class MainBank {
    
    public static void main(String[] args)
    {
        Bank bank = new Bank("AIB", "Dublin");
        
        Person p = new Person("Liam", "Neeson", "33 jedi's street", 61);
        
        Company c = new Company("Facebook", "Dublin", "info@facebook.com");
        
        BankAccount liamAccount = new BankAccount(p);
        BankAccount facebookAccount = new BankAccount(c);
        
        liamAccount.logde(552.35);
        facebookAccount.logde(1549874.25);
        
        liamAccount.printAccount();
        facebookAccount.printAccount();
        
        bank.addAccount(liamAccount);
        bank.addAccount(facebookAccount);
        
    }
    
}
