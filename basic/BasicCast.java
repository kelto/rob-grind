
public class BasicCast {

	public static void main(String[] args)
	{
		// Equivalent of an int in Object
		Integer integer = new Integer(5);
		// This will work, since an Integer is an Object, as any other things (except primitive) in Java.
		Object o =  integer;
		
		// and then we can go the other way :
		Integer second = (Integer) o;

		// but now we will try to make it fail ...
		String string = "Hello world !";

		// String does it inherit from Integer ? No ! So it can't work.
		Integer fail = (Integer) string;
		
		// Another way to think about it is ... Is a String an Integer ? No. So not possible.
	}
}
