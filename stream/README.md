# Stream:

##Basic
1. Create a basic program that will ask for a name and an age. Then create an object Person with this name and age, and serialize this object by adding it to the file, without erasing everything from the file !! 
At the end of the program, it should print all of the serialized person in the file.

##Difficult

1. The program should read in a file person.txt, to actualise a binary file of serialized object.
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

Assuming that the program has already been run before with the value Charles and Rob in the person.txt file ...
(hints): Read from the binary file every Object person and stock it in an ArrayList. Then read from the text file ... if the name of the person doesn't exist, create a new Person and add it to the ArrayList. When all the text file has been read, serialize all of the person in the ArrayList.

##Very Difficult
1. Create a program that will count every occurrence of every words of the file.
It is possible to do this while reading the file only once. I advice the use of a HashMap for that.

## Already done :

1. Read the text from slipum.txt with a basic stream (FileReader would be the basic choice) (Done)
2. Improve the performance of the previous program with a better stream object (Done)
3. Create a function that will serialize an object through a stream. (Done)

4. Create a program that will ask for a word, and then count the number occurrence of this word in slipum.txt (Done)
