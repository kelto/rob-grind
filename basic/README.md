## Polymorphism

### Explanation

First we have to understand that EVERYTHING in java is object, except primitive (char, int, short, long, double, float and boolean). Even for primitive there is an Object for them : char => Character, int => Integer, short => Short, long => Long, double => Double, float => Float, boolean => Boolean.
So in fact, since everything except primitive is an Object in java, we can use everything as an Object.

### Basic of casting and Polymorphism (Difficulty Easy/Medium)
Let's try to run this file : [BasicCast.java](BasicCast.java)  

### Polymorphism and Inheritance (Difficulty : Medium/Hard)
Concept with more details with all the classes in [Mamal/](Mamal)  
The [Mamal/MainMamal.java](Main file) will show you how to use inheritance on your Object, and how we can cast them between each other.
Then we can see how it might work with some functions in [Mamal/MainPoly.java](MainPoly)


## Object Exercice

### Full exercice (Basic/Medium):

Create an Object Bank that contains multiple BankAccount. The Bank has a name and an address.
Each BankAccount got a balance, a way to withdraw and put back some money in it. Each BankAccount has a owner, and only one.
The owner can be either a Company or a person. 
A Company has a name, a head office address, and an email address.
A Person has a firstname, a lastname, an address, and an age.
It's possible to identify a BankAccount through a unique ID number.
The Bank provide a way to get a list of all the BankAccount of a Person/Company, and a way to calculate the total of all the balance of every BankAccount of a Person/Company.

way of breakthrough:
  
1. Create a simple Object to represent a Bank account, with all the needed attribute. Create a simple object that represent a possible owner, without any difference between Person and Company. No attribute for this one. Then create a Bank object that list every bank account.
2. Find a way to specialize the owner of the account into either a Company or a Person.
3. Create a function that will take a owner. First it will create an ArrayList and then add to this ArrayList every account that has this owner.
4. Create a function that will get the total balance of an ArrayList of account.
5. Create a function that will use the function in 3 and 4 to get the total of all the account of a specified owner.

