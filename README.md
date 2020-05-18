# Inner and Abstract Classes & Interfaces
 Author: Adrian Huebner
 
 All the challenges that I am solving in this repository come from an Udemy Course on Java that I am currently taking online.
 
 ## Interfaces Challenge
 
 [Code Lives Here](/src/com/company/Interfaces)
 
 - Create a simple interface (name it Saveable or ISaveable)
 - The interface allows an object to be saved to some sort of storage medium (use an arraylist)
    - The exact type of medium is unknown to the interface, nor to the classes that implement it
 - The interface will just specify two methods:
    - One to return an ArrayList of values to be saved
    - The other to populate the object's fields from an ArrayList (parameter)
    
- Create a few sample classes that implement your Saveable interface
- Override the toString() method for each of your classes so that they can easily be printed to enable the program to be tested easier
- In Main:
    - Write a method that takes an object that implements the interface as a parameter and "saves" the values e.g. calls the method defined in the interface
        - Method should just print the values to the screen
    - Write a method that restores the values to Saveable object
        - Calls the method from the interface for populating fields
 
 -----