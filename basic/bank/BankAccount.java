
class BankAccount {
    
    private double balance;
    private Owner owner;
    
    public BankAccount(Owner owner)
    {
        this.owner = owner;
    }
    
    public void logde(double money)
    {
        this.balance = this.balance + money;
    }
    
    public void withdraw(double money)
    {
        this.balance = this.balance - money;
    }
    
    public void printAccount()
    {
        System.out.println("Hello "+owner.getName());
        System.out.println("You have "+this.balance+"€ on your account.");
    }
    
}
