public class MainPoly
{

	public static void main(String[] args)
	{

		// We can use Polymorphism to use function on general Object when in reality they are subclasses of this object.
		Dog dog = new Dog();

		// This will work since a Dog is a Mamal !
		mamalFunction(dog);

		Mamal mamal = new Mamal();
		// this will fail :
		dogFunction(mamal);
		// a mamal is not a Dog ! Mamal doesn't extends Dog ! it's the opposite !

		// And finally since EVERYTHING is Object we can ...
		Object object = mamal;

	}

	public static void mamalFunction(Mamal mamal)
	{
		// do nothing
	}

	public static void dogFunction(Dog dog)
	{
		// do nothing
	}
}
