
public class Company extends Owner{

    private String name;
    private String headoffice;
    private String email;
    
    public Company(String name, String headoffice, String email)
    {
        this.name = name;
        this.headoffice = headoffice;
        this.email = email;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
}
