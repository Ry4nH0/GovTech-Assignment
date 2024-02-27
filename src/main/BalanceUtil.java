package main;

import java.util.ArrayList;

public class BalanceUtil {
    
    // Create a function which takes in an array list of persons and
    // balances the accounts with the least number of transactions
    public static void balanceAccounts(ArrayList<Person> persons) {
        
        // Initialise total amount paid by everyone
        double totalPaid = 0.0;
        
        // Loop through the array list and get the total amount paid by everyone
        for (Person p : persons) {

            totalPaid += p.getPaid();
        }

        // Define the total number of persons
        int numOfPersons = persons.size();

        // Derive the average amount paid
        double averagePaid = totalPaid / numOfPersons;

        // Initially assume that the average amount paid is a double
        boolean averageIsDouble = true;

        // If the total paid is divisible by number of persons
        if (totalPaid % numOfPersons == 0) {
            
            // Then the average amount paid is an integer, not a double
            averageIsDouble = false;

        }


        // Create two array lists: 
        // Overpaid stores the persons who paid more than the average amount paid
        // Underpaid stores the persons who paid less than the average amount paid
        ArrayList<Person> overpaid = new ArrayList<Person>();
        ArrayList<Person> underpaid = new ArrayList<Person>();
        
        // Loop through the array list of persons
        for (Person p : persons) {
                
            // If the person paid more than the average amount paid
            // Then add to overpaid
            if (p.getPaid() > averagePaid) {
                overpaid.add(p);
            
            // If the person paid less than the average amount paid
            // Then add to underpaid
            } else if (p.getPaid() < averagePaid) {
                underpaid.add(p);
            }
            // If the person paid an amount equal to the average amount paid, 
            // There is no need for the person to pay someone or be paid by someone
            // So just ignore the person
        }


        // Initialise the number of transactions it takes to balance the accounts to 0
        int transactionCount = 0;

        // If the average amount paid is a double
        if (averageIsDouble) {
            
            // Compare every person who overpaid with every person who underpaid
            for (Person over : overpaid) {
                
                for (Person under : underpaid) {
                    
                    // If over paid an amount greater than the average paid amount
                    // And if under paid an amount less than the average paid amount
                    if (over.getPaid() > averagePaid && under.getPaid() < averagePaid) {
                        
                        // Run the overPaidByUnder method defined in Person.java to determine the transaction details
                        System.out.print(over.overPaidByUnder(under, averagePaid));
                        
                        // After the transaction is made, add 1 to the transaction count
                        transactionCount++;
                    }
                }
            }
        // If the average amount paid is an integer instead of a double
        } else {
            
            // Typecast averagePaid to an integer variable
            int averagePaidInt = (int) averagePaid;

            // Compare every person who overpaid with every person who underpaid
            for (Person over : overpaid) {
                
                for (Person under : underpaid) {
                    
                    // If over paid an amount greater than the average paid amount
                    // And if under paid an amount less than the average paid amount
                    if (over.getPaid() > averagePaidInt && under.getPaid() < averagePaidInt) {
                        
                        // Run the overPaidByUnder method defined in Person.java to determine the transaction details
                        System.out.print(over.overPaidByUnder(under, averagePaidInt));
                        
                        // After the transaction is made, add 1 to the transaction count
                        transactionCount++;
                    }
                }
            }
        }
        // After all transactions are made, print out the total number of transactions made
        System.out.printf("Number of transactions: %d\n", transactionCount);
    }

}
