simpleJava Examples

The following simpleJava programs can be used to test your compiler.  Note that all aspects of simpleJava are not tested by these programs -- creating your own test files is essential!

connect4-1P.sjava Allows the use to play a game of connect 4 against the computer.  Uses a basic min/max algorithm, with a board evaluation function that weighs the number of blocked or unblocked 2, 3, and 4 -in-a-rows.
connect4-2P.sjava Allows two players to play a game of connet 4 against each other.  Pretty much the program above with the AI ripped out, and replaced by user input.  Good test of 2D arrays
fact.sjava Computes n!, using recursion
GCD.sjava Computes the Greatest Common Divisor of two numbers.  Also recursive.
interpreter.sjava An interpreter for a simple machine language, which is described in the opening comment.  To help my students test their Assembly Code Generator, I wrote a Abstract Assembly Language interpreter in Java, and I though it would be amusing to interpret a simple machine language on top of an AAT interpreter on top of the JavaVM.  Now if we just run the whole thing in virtual PC ...
     interp.div.assm Division, implemented with repeated subtraction
     interp.mult.assm Multiplication, implemented with repeated addtio
     interp.power.assm Power, implemented with repeated multiplication (which is repeated addtion)
     interp.primes.assm Calculates and prints out all primes <= n
primes.sjava Calucaltes and prints out all primes <= n, first by checking all factors of each number <=n, and then by using the sieve of Eratosthenes
queens.sjava Solves the n-queens problem, for any n
Basic Programs
booltest.sjava Tests comparison operators (<, >, etc) and boolean operators (&&, ||, etc)
heaptest1.sjava Testing heap memory: Basic classes
heaptest2.sjava Testing heap memory: Arrays
heaptest3.sjava Testing heap memory: Basic classes & Arrays
(All files in one convenient gzip'ed tarball: sjava.tar.gz)

Create some fun simpleJava programs that you want to share with the word?  Drop me a line: galles <at> usfca <dot> edu
