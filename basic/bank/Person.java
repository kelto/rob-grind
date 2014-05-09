
public class Person extends Owner{

    private String firstname;
    private String lastname;
    private String address;
    private int age;
    
    public Person(String firstname, String lastname, String address, int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.age = age;
    }
    @Override
    public String getName() {
        return firstname + " " +lastname;
    }
    
}
