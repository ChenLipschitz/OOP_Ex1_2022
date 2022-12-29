# OOP_Ex1_2022

The following project focus on design patterns.
In this project we have implemented the UndoableStringBuilder in Java by using the Observer design pattern.
In Fact, there are 3 main classes- Gruop Admin, Member, UndoableStringBuilder
the group admin class contains a collection of members and whenever a change in the UndoableStringBuilder object is made the group admin notifies all the members-
sends them the updated value/content of the UndoableStringBuilder object.

### Extra Info About The Observer Pattern: 
Observer Pattern is one of the behavioral design patterns.
The observer pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers,
and notifies them automatically of any state changes, usually by calling one of their methods. (wikipedia)


## The Project's Files:

* Member, Interface-
Represents the member.

* Sender, Interface-
Represents the sender.

* UndoableStringBuilder, Class-
Represents an UndoanleStringBuilder object (using Java's StringBuilder).

* ConcreteMember, Class -
Implements the Member interface.
Represents the observer in the Observer design pattern.

* GroupAdmin, Class-
Implements the Sender interface.
Represents the subject in the Observer design pattern.

* ConcreteMemberTest, Test-
Tests the ConcreteMember class.

* GroupAdminTest, Test-
Tests the GroupAdmin class.

* JvmUtilities, Class-
Utility class for tracking the Java Virtual Machine resources allocated by the Operating System.

## UML

## How To Run?

## Authors
* @Yael Gabay
* @Chen Lipschitz
