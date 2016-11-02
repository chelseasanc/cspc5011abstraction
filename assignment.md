Exercises
1. Run the postal code program. Then carefully read through the code for all six classes. 
Use the Java documentation to look up any methods or classes you do not understand.

2. The way the program is written, letters in Canadian postal codes are only accepted if they
are upper case. On the other hand, letters in British postal codes are accepted whether they are
upper case or not. This is inconsistent. Modify the program so that user input of upper or lower
case is accepted, and the input is converted to upper case immediately.

3. Describe how you would design the following modifications to the postal code software. Think
carefully about whether there should be one method, or several different polymorphic methods.
In the latter case, think about whether there should be an abstract method in the superclass and
concrete methods in the subclasses, or else a concrete method in the superclass and one or more
overriding methods in the subclasses.
A. There should be an operation length() that returns the number of characters in a postal code.
B. There should be a file that contains postal codes, one per line. There should be an operation
called isOnRecord() that returns true if a postal code is in this file. Do not worry of now about
the efficiency of this operation in the case of very large files, although you should be aware that
this would be aconcern in a production-quality system. Hint: investigate class FileInputStream.
C. For each country, there should be a file that contains, on each line, a postal code prefix
followed by the name of a destination of such postal codes. For eample, class BritishPostalCode
might use the file BritishPostalDestinations.txt, and on one of its lines in might contain 'SW
SouthWest-London'. The parts of the program that sets the destination should read these files.

4. Implement the designs you prepared in the above step.

5. Add a new subclass representing postal codes for the fictitious country of Ootumlia,
whose format is always one or two letters, followed by a space, followed by two numbers. You will
have to modify the PostalTest class to accomodate your new subclass, although you must not modify the
PostalCode class.
