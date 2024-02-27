package main;

import java.util.ArrayList;

public class BalanceUtil {
    
    public static void balanceAccounts(ArrayList<Person> persons) {
        
        double totalPaid = 0.0;
        
        for (Person p : persons) {

            totalPaid += p.getPaid();
        }

        int numOfPersons = persons.size();

        double averagePaid = totalPaid / numOfPersons;

        boolean averageIsDouble = true;

        if (totalPaid % numOfPersons == 0) {
            
            averageIsDouble = false;

        }

        // System.out.println("totalPaid = " + totalPaid);
        // System.out.println("numOfPersons = " + numOfPersons);
        // System.out.println("balancePaid = " + balancedPaidDouble);

        ArrayList<Person> overpaid = new ArrayList<Person>();
        ArrayList<Person> underpaid = new ArrayList<Person>();
        
        for (Person p : persons) {
                
            if (p.getPaid() > averagePaid) {
                overpaid.add(p);
            
            } else if (p.getPaid() < averagePaid) {
                underpaid.add(p);
            }
            
        }

        int transactionCount = 0;

        if (averageIsDouble) {
            
            // for (Person p : persons) {
                
            //     if (p.getPaid() > averagePaid) {
            //         overpaid.add(p);
                
            //     } else if (p.getPaid() < averagePaid) {
            //         underpaid.add(p);
            //     }
            // }
            
            for (Person over : overpaid) {
                
                for (Person under : underpaid) {
                    
                    if (over.getPaid() > averagePaid && under.getPaid() < averagePaid) {
                        
                        System.out.print(over.overPaidByUnder(under, averagePaid));
                        

                        transactionCount++;
                    }
                }
            }
        } else {
            
            int averagePaidInt = (int) averagePaid;

            // for (Person p : persons) {
            
            //     if (p.getPaid() > averagePaidInt) {
            //         overpaid.add(p);
            
            //     } else if (p.getPaid() < averagePaidInt) {
            //         underpaid.add(p);
            //     }
            // }
                
            for (Person over : overpaid) {
                
                for (Person under : underpaid) {
                    
                    if (over.getPaid() > averagePaidInt && under.getPaid() < averagePaidInt) {
                        
                        System.out.print(over.overPaidByUnder(under, averagePaidInt));
                        
                        
                        transactionCount++;
                    }
                }
            }
        }
        System.out.printf("Number of transactions: %d\n", transactionCount);
    }

}
