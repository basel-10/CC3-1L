1. Create a new project named RPG.
2. Complete the Dice.java template (see page 2 of this file) given to model
rolling a regular six-sided die. You only need to complete the Dice()
constructor and roll() method. To generate random numbers, use the
imported Random class. Random has a method called nextInt(int), which
takes an integer as its parameter, and returns a random integer between 0
(inclusive) and the given parameter (exclusive). For example:
r.nextInt(100);
returns a number from 0-99
3. Complete Character.java code template (see page 3 of this file), which
models a character for a roleplaying game. You will need to add the 6
instance variables described in the documentation, as well as the code for all
of the given methods. Some of the implementation (such as the attack()
method) can be done in many different ways and is open to your
interpretation.
4. Write a TestCharacter.java class, which creates two characters who
alternate attacking each other, until one character's current life is less than or
equal to zero. Print the results of each attack and the eventual winner.
Sample output for the class TestCharacter:
Round 1
Joe: 24
Bob: 23
Joe attacks Bob for 6
Bob attacks Joe for 11
Round 2
Joe: 13
Bob: 17
Joe attacks Bob for 5
Bob attacks Joe for 9
Round 3
Joe: 4
Bob: 12
Joe attacks Bob for 9
Bob attacks Joe for 8
Bob wins!
