Create the following:

The superclass Building that contains:
(give a proper visibility for class memebers)
a String instance variable called address . 
an int instance variable called an squareFootage. 
a constructor that accepts 2 parameters: address and squareFootage and initializes them.
toString() method that returns the values of address and squareFootage as String.



The subclass, ApartmentBuilding, that contains:
an int instance variable, totalUnits.
a constructor that accepts 3 parameters: address, squareFootage, totalUnits and initializes them. Call super class's constructor to initialize address and squareFootage.
toString() method that returns the values of address,squareFootage and totalUnits. Call superclass's toString() method to get values of address and squareFootage and add totalUnits's value to it.


Test your ApartmentBuilding class by creating an object and calling its toString method in the Main class.