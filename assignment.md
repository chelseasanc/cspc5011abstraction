#Programming Assignment 1

###Objective:
This programming assignment is intended to help you gain functional knowledge of using the most
important features of object oriented concepts in Java including inheritance, polymorphism, string
manipulation, and access control. This assignment also illustrated the dual perspective design: the
separation of user interface form the implementation part of the system.

####PostalCode
toString()
getCode()
getDestination()
setDestination()
validate()
getCountry()

####BritishPostalCode
validate()
getCountry()

####CanadianPostalCode
validate()
getCountry()

####USZipCode
validate()
getCountry()

####PostalCodeException

####PostalTest
main()

###Software description:
The software is divided into three elements, as illustrated in the figure above. The first element
is a hierarchy representing postal codes of different countries. The second elements is a new exception
class. The third element is the PostalTest class that allows the user to enter postal codes and test the
facilities of the PostalCode hierarchy. The Java code of the system is provided with this assignment.

1. **The PostalCode hierarchy**
Study the diagram above and the provided java code and note the following important points about the
postal code system:
  1. PostalCode is declared as abstract, meaning that no instances can be created. Two of its operations,
namely validate() and getCountry(), are abstract, meaning that they must be given concrete implementations
in subclasses.
  2. The operation validate() is protected, and is called by the constructor. Its concrete implementations
in each subclass will throw a PostalCodeException (described below) if the format of the code is invalid.
  3. All the instance variables are declared private. All other classes, including subclasses, can only
access them using methods. This helps to improve encapsulation.
  4. There is a toString() method, as should be provided in most Java classes.

  There are three examples of subclasses of PostalCode. Each of theres implements the two abstract operations,
namely validate() and getCountry(). For example, the validate() method of one subclass, CanadianPostalCode,
ensures that the formal is XNX NXN, where N is a number and X is a letter; the first letter is also taken from
a restricted set. The other implementations of validate() ensure that US postal codes have an all-numeric
format, while British postal codes adhere to their more complex alphanumeric format.

2. **The PostalCodeException class**
PostalCodeException illustrates the concept of the user-defined exception class. Instances of this class
are thrown when an error is found while validating a postal code. A class that manipulates postal codes
could choose to handle such exceptions in any way it wishes.

3. **The user interface class PostalTest**
The user interface class, PostalTest, has only on static main method and one private static helper method
called getInput(). The code prompts the user for input and then attempts to create an instance of one of
the subclasses of PostalCode. If a PostalCodeException is thrown, it tries to create an instance of other
subclasses until none remain. Then it prints out information about the result. Clearly this is not a
sophistocated user interface, nevertheless it is sufficient to test the facilities of the Postal Code
hierarchy.

  It would be possible to put all the code from PostalTest into PostalCode- the main() method in PostalCode
would then simply be used to test the class. This is, in fact, a design alternative that some people
would choose. In this assignment, the complete superstation of the classes that do the user interface
work from the implementation classes, is chosen.

###Exercises

1. Run the postal code program. Then carefully read through the code for all six classes.Use the Java documentation to look up any methods or classes you do not understand.

2. The way the program is written, letters in Canadian postal codes are only accepted if they are upper case. On the other hand, letters in British postal codes are accepted whether they are upper case or not. This is inconsistent. Modify the program so that user input of upper or lower case is accepted, and the input is converted to upper case immediately.

3. Describe how you would design the following modifications to the postal code software. Think carefully about whether there should be one method, or several different polymorphic methods.In the latter case, think about whether there should be an abstract method in the superclass and concrete methods in the subclasses, or else a concrete method in the superclass and one or more overriding methods in the subclasses.

    1. There should be an operation length() that returns the number of characters in a postal code.
    2. There should be a file that contains postal codes, one per line. There should be an operation called isOnRecord() that returns true if a postal code is in this file. Do not worry of now about the efficiency of this operation in the case of very large files, although you should be aware that this would be aconcern in a production-quality system. Hint: investigate class FileInputStream.
    3. For each country, there should be a file that contains, on each line, a postal code prefix followed by the name of a destination of such postal codes. For eample, class BritishPostalCode might use the file BritishPostalDestinations.txt, and on one of its lines in might contain 'SW SouthWest-London'. The parts of the program that sets the destination should read these files.

4. Implement the designs you prepared in the above step.

5. Add a new subclass representing postal codes for the fictitious country of Ootumlia, whose format is always one or two letters, followed by a space, followed by two numbers. You will have to modify the PostalTest class to accomodate your new subclass, although you must not modify the PostalCode class.
