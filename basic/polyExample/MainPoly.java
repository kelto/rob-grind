
public class MainPoly {
    
    public static void main(String[] args)
    {
        B b = new B();
        System.out.println("Going to print b:");
        printObject(b);
        
        C c = new C();
        System.out.println("Going to print c:");
        printObject(c);
    }
    
    public static void printObject(A object)
    {
        object.hello();
    }
    
}
