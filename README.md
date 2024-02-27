# GovTech-Assignment

CHALLENGE 1:


NOTE: I have coded and tested my files using Visual Studio Code. For this assignment, I have used Java. 

How to run the code:

1. Open my GovTech-Assignment folder in Visual Studio Code
2. Open up a Command Prompt Terminal in Visual Studio Code
3. Ensure that the working directory is GovTech-Assignment
4. Type "compile.bat" into the terminal and press enter
5. Type "run.bat" into the terminal and press enter

Assumptions: 

1. For the Person class, the value passed into the "paid" attribute is a double greater than or equal to 0. 
Hence, it is not possible for a Person to have paid a negative value

2. For the Person class, the value passed into the "name" attribute is a String which is not null. 

3. For both of the overPaidByUnder methods in the Person class, the "averagePaid" argument is either 
an integer or double that is greater than or equal to zero. 
Hence, it is not possible for averagePaid to have paid a negative value

4. For both of the overPaidByUnder methods in the Person class, the "under" argument must be an instance of the Person object

Logic Testing

The primary method that runs the code logic is balanceAccounts, which is in src/main/BalanceUtil.java
I have used src/test/TestCases.java to run the provided logic test cases for BalanceUtil.java

Unit Testing:
I have implemented JUnit Jupiter to unit test the methods of src/main/Person.java. 

To install JUnit on Visual Studio Code: 
1. Click on Testing (the conical flask symbol) on the left sidebar
2. Click "Enable Java Tests"
3. A search bar will pop up, click on JUnit Jupiter
4. JUnit Jupiter will start installing

The file used for unit testing is src/test/PersonTest.java



CHALLENGE 2 ER Diagram Documentation:


1. For each BOOKING a GUEST makes, the GUEST can choose to apply a DiscountCode which applies a DiscountPercentage to the TotalBill of the BOOKING

2. A GUEST can make one or more BOOKINGS, while a BOOKING can be only made by one GUEST. 

3. The TotalBill of each BOOKING is a derived attribute which is derived from the DiscountPercentage, PeriodOfStay, the number of ROOMS reserved, the BasePrice of each ROOM booked, and the AddOnPrice of each ROOM. 

4. I have decided that the GUESTSTAYS entity should be absorbed into the BOOKING entity because the requested booking period and the period of stay are the same. They are merged into the PeriodOfStay attribute in BOOKING. 

5. The PeriodOfStay of each BOOKING is a derived attribute which can be derived from StartDateOfStay - EndDateOfStay. It is measured in days. 

6. A BOOKING can reserve one or more ROOMS, while a ROOM can be reserved by only zero or one BOOKING at a time. 

7. The BasePrice of a ROOM is the price of booking a specific type of room (STANDARD, DELUXE, SUITE) for one day. 

8. The AddOnPrice of each ROOM is a derived attribute which can be derived from either RefillTeaSatchet, RefillCoffeeBean, or RefillWine, depending on the RoomType (STANDARD, DELUXE, SUITE). On top of that, for DELUXE ROOMS, the TotalPrice of each ROOMSERVICE will also add to the AddOnPrice. 

9. Amenities of each ROOM is a multivalued and composite attribute which consists of the component attributes AmenityType and Quantity.

10. Furnishings of each ROOM is a multivalued and composite attribute which consists of the component attributes FurnishingType and Quantity.

11. There are exactly 3 subtypes of ROOM without overlap. The subtypes are STANDARD, DELUXE, and SUITE. 

12. TeaSatchetSelection is only available to STANDARD ROOMS. It is a multivalued attribute containing the different brands of tea satchet made available in the STANDARD ROOM. 

13. RefillTeaSatchet is only available to STANDARD ROOMS. It is a multivalued and composite attribute which consists of the component attributes TeaType, TeaPrice and Quantity. RefillTeaSatchet will add to the AddOnPrice of a STANDARD ROOM. 

14. CoffeeBeanSelection is only available to DELUXE ROOMS. It is a multivalued attribute containing the different types of coffee bean made available in the DELUXE ROOM.

15. RefillCoffeeBean is only available to DELUXE ROOMS. It is a multivalued and composite attribute which consists of the component attributes CoffeeType, CoffeePrice and Quantity. RefillCoffeeBean will add to the AddOnPrice of a DELUXE ROOM. 

16. WineSelection is only available to SUITE ROOMS. It is a multivalued attribute containing the different brands of wine made available in the SUITE ROOM. 

17. RefillWine is only available to SUITE ROOMS. It is a multivalued and composite attribute which consists of the component attributes WineType, WinePrice and Quantity. RefillWine will add to the AddOnPrice of a SUITE ROOM. 

18. ROOMSERVICE can be ordered by DELUXE ROOMS only. The TotalPrice of a ROOMSERVICE adds to the AddOnPrice of a DELUXE ROOM. 

19. FoodOrdered in a ROOMSERVICE is a multivalued and composite attribute which consists of the component attributes FoodItem, FoodPrice and Quantity. FoodOrdered will add to the TotalPrice of a ROOMSERVICE. 

20. DrinksOrdered in a ROOMSERVICE is a multivalued and composite attribute which consists of the component attributes DrinkItem, DrinkPrice and Quantity. DrinksOrdered will add to the TotalPrice of a ROOMSERVICE. 

21. The TotalPrice of each ROOMSERVICE is a derived attribute which is derived from FoodOrdered and DrinksOrdered. The TotalPrice of each ROOMSERVICE will add to the AddOnPrice of a DELUXE ROOM. 

22. A DELUXE ROOM can order any number of ROOMSERVICE, while a ROOMSERVICE can be ordered by only one DELUXE ROOM. 

23. A BUTLER can serve SUITE ROOMS only. 

24. A SUITE ROOM is served by only one BUTLER, while a BUTLER can serve at most one SUITE. 
