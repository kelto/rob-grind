# Thread

## Introduction
A Thread is some shallow copy of the program it is coming from. The most important thing to understand is that it's kind of an independant program.
When a thread is launch, it will execute the instructions it has been given and then die.  
Here an example of a Thread : [example](ThreadExample.java) and how it is used : [Main](ThreadMain.java)

So to create a Thread, first we must make our new class Extends from the Thread class, and define the *run* method.
As we can see, it's really easy to create a Thread and to launch it, the *run* method can be assimilated as the *main* function.
We can wait for a thread to finish to then continue to do something else with the *Thread.join()* method. It is sometimes useful to do so.
To make a thread (or the main program) to wait for a certain number of time the *static* method *Thread.sleep(long milliseconde)* can be used as shown in the example.

## Exercice

### Basic
1. Create a Thread that will print 5 times "Hello world !"
2. Create a Thread that will wait for 10 seconde then print "Hello world with some delay ..."
3. Change the previous program so that it will wait for the Thread to finish and then print "Work done !"

### Medium
1. A program will ask the user a number, and create a new thread that should print the message "hello world !" the same number of time as the user has written.
2. The program should launch a thread and give him some File object. The thread will then read the file and print it.

### Difficult
1. Try to understand how [PipedInputStream](http://docs.oracle.com/javase/7/docs/api/java/io/PipedInputStream.html) and [PipedOuputStream](http://docs.oracle.com/javase/7/docs/api/java/io/PipedOutputStream.html) work. And use it to create a program that will create 2 different Thread.
The first one should send through a PipedOutStream a message character by character, waiting 1 second between each.
The second should read from a PipedInputStream and print it.
