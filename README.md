# GovTech-Assignment

NOTE: I have coded and tested my files using Visual Studio Code

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
The primary method that runs the code logic is balanceAccounts, which is in src/main/BalanceUtil.java. 
I have used src/test/TestCases.java to run the provided logic test cases for BalanceUtil.java

Unit Testing:
I have implemented JUnit Jupiter to unit test the methods of src/main/Person.java. 

To install JUnit on Visual Studio Code: 
1. Click on Testing (the conical flask symbol) on the left sidebar
2. Click "Enable Java Tests"
3. A search bar will pop up, click on JUnit Jupiter
4. JUnit Jupiter will start installing

The unit testing file is src/test/PersonTest.java