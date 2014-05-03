#JAVAQUARIUM

The aim of this exercice is to create an aquarium simulation with fish and alga.
The aquarium should be able to introduce new fish and alga, and let the time flow and observe the aquarium.

So a program in two time : add fish/alga and let the time flow.

We are going to split the exercice into small one, and each time we will try to either add new features or improve the previous one.


###Exercice 1: Fill the aquarium.

1. basic
The aquarium has fish and alga in any number. Alga does nothing, it's just exist or not.
Fish got a name, and a gender (male or female).
The aquarium got a method to add a new fish with a name and a gender, and another method to add an alga.
The aquarium got a method to let the time flow: each new turn we do every action (for now, there is nothing to do ...), and we print the number of alga, and the list of fish.

2. diversity
In our aquarium, we will have different breed, and different type: herbivore and and carnivore. There will be 6 breed:
**
Carnivore fish : Grouper, Tuna, Cod
Herbivore fish: Sardine, Bass, Carp.
Each fish can eat (a method) : according to its diet, he will either eat an alga (parameter: an alga), or another fish (parameter: another fish, anyone.).
Poissons carnivores : Mérou, Thon, Poisson-clown.
Poissons herbivores : Sole, Bar, Carpe.

###Exercice 2:Eating

1.Each time a fish eat, it kills its prey. A fish can't eat itself. And the alga or fish that will be eaten, must be chosen randomly.
(for random number  [http://docs.oracle.com/javase/7/docs/api/java/util/Random.html#nextInt%28int%29](random) )


2. This is too extreme, so we will introduce the concept of Health Point(HP).
Fish and alga are live beings.
Each live being start with 10 HP.
A live being that have 0 HP die.

Each alga grow each turn: gain 1HP.
An alga eaten by a fish lose 2HP.

Each turn, fish get more hungry: it loses 1HP.
A fish that is hungry enough(5Hp or less) seek to eat.
Herbivorous don't have a lot of trouble but alga aren't really nutritive : eating them give 3Hp.
Carnivorous eat good fish meat which give 5Hp.
A Carnivorous attack each turn a fish randomly: he's got only one chance. Unfortunatly for him he can't eat himself, nor a fish of his species.
Being bitten hurt a lot and make lose 4Hp.

