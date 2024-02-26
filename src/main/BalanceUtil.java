package main;

import java.util.ArrayList;

public class BalanceUtil {
    
    public static void balanceAccounts(ArrayList<Person> persons) {
        
        double totalPaid = 0.0;
        
        for (Person p : persons) {

            totalPaid += p.getPaid();
        }

        int numOfPersons = persons.size();
        
        int balancedPaidInt = 0;
        double balancedPaidDouble = 0.0;

        boolean balanceIsDouble = true;

        if (totalPaid % numOfPersons != 0) {
         
            balancedPaidDouble = totalPaid / numOfPersons;

        } else {
            balancedPaidInt = (int) totalPaid / numOfPersons;
            balanceIsDouble = false;
        }

        // System.out.println("totalPaid = " + totalPaid);
        // System.out.println("numOfPersons = " + numOfPersons);
        // System.out.println("balancePaid = " + balancedPaidDouble);


        ArrayList<Person> overpaid = new ArrayList<Person>();
        ArrayList<Person> underpaid = new ArrayList<Person>();

        int transactionCount = 0;
        
        if (balanceIsDouble) {
        
            for (Person p : persons) {
        
                if (p.getPaid() > balancedPaidDouble) {
                    overpaid.add(p);
                
                } else if (p.getPaid() < balancedPaidDouble) {
                    underpaid.add(p);
                }
            }
            
            for (Person under : underpaid) {
            
                for (Person over : overpaid) {
                
                    if (over.getPaid() > balancedPaidDouble && under.getPaid() < balancedPaidDouble) {

                        over.overPaidByUnder(under, balancedPaidDouble);

                        transactionCount++;
                    }
                }
            }
        } else {
            
            for (Person p : persons) {
            
                if (p.getPaid() > balancedPaidInt) {
                    overpaid.add(p);
            
                } else if (p.getPaid() < balancedPaidInt) {
                    underpaid.add(p);
                }
            }
                
            
            for (Person over : overpaid) {
                
                for (Person under : underpaid) {
                
                    if (over.getPaid() > balancedPaidInt && under.getPaid() < balancedPaidInt) {
                 
                        over.overPaidByUnder(under, balancedPaidInt);
                        transactionCount++;
                    }
                }
            }
        }
        System.out.printf("Number of transactions: %d\n", transactionCount);
    }

}
