* Exercices:

**Basic
1/ Read the text from slipum.txt with a basic stream (FileReader would be the basic choice)
2/ Improve the performance of the previous program with a better stream object
3/ Create a function that will serialize an object through a stream.

**Difficult
1/ Create a program that will ask for a word, and then count the number occurrence of this word in slipum.txt
2/ Create a class Person with two attribute : name and age.
The program should read in a file person.txt, to actualise a binary file of serialized object.
On each line a name and a number is written. If the name exist in the binary file, nothing happen, but if it doesn't, then a new object with this name and age should be created and serialized.
At the end of the program, the program should print each serialized objects.

Example:
Person.txt:
Rob 26
Charles 25
Diana 30

Read first line: Rob exist in file person => Do nothing
Read second line: Charles exist in file person => Do nothing
Read third line: Diana doesn't exist in file person => Create new Person, serialize in person file.
Then print all the person already serialized.

We assume that the program has already been run before with the value Charles and Rob in the person.txt file.

**Very Difficult
1/Create a program that will count every occurrence of every words of the file.
It is possible to do this while reading the file only once. I advice the use of a HashMap for that.

