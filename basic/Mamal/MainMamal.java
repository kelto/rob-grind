public class MainMamal
{

	public static void main(String[] args)
	{
		Dog dog = new Dog();
		
		// A dog is a canidae ! Dog extends Canidae so i can do this :
		Canidae canidae = dog;

		// And now if i want to go back i have to do this :
		Dog dog2 = (Dog) canidae;

		// Now this is something possible, but we know it's wrong :
		Wolf wolf = (Wolf) canidae;

		// A Wolf IS a canidae ... but we know that the object canidae is in fact a Dog, so if we run, it will crash.

		Cat cat = new Cat();

		// A cat is a Feline.

		Feline feline = cat;
		// And a Feline is a Mamal.
		
		Mamal mamal = feline;

		// So a Cat is a Mamal too !
		mamal = cat;

		// We can always change the type of an Object into a more general Object (here cat into Mamal) but we have to be careful
		// When we want to do the opposite :

		Cat cat2 = (Cat) mamal; // Here the Mamal is really a cat ... but if I tried to cast it into a Dog ... it Would have failed !
	}

}
