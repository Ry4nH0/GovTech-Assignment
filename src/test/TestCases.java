package test;

import java.util.ArrayList;

import main.Person;
import static main.BalanceUtil.*;

public class TestCases {

        // Below are the test cases used to test the logic of the program
        public static void main(String[] args) {
        
            System.out.println("PROVIDED TEST CASES\n");
            System.out.println("TEST CASE 1 (1 person pay 2 ppl (with 2dp))");
            Person a1 = new Person("Ali", 40.105);
            Person b1 = new Person("Bob", 40.105);
            Person c1 = new Person("Charlie", 10);
    
            ArrayList<Person> persons1 = new ArrayList<Person>();
            persons1.add(a1);
            persons1.add(b1);
            persons1.add(c1);
    
            balanceAccounts(persons1);
            System.out.println();
            
            System.out.println("TEST CASE 2 (1 person pay 2 ppl)");
            Person a2 = new Person("Ali", 40);
            Person b2 = new Person("Bob", 40);
            Person c2 = new Person("Charlie", 10);
    
            ArrayList<Person> persons2 = new ArrayList<Person>();
            persons2.add(a2);
            persons2.add(b2);
            persons2.add(c2);
    
            balanceAccounts(persons2);
            System.out.println();
    
            System.out.println("TEST CASE 3 (4 ppl)");
            Person a3 = new Person("Ali", 10);
            Person b3 = new Person("Bob", 20);
            Person c3 = new Person("Charlie", 0);
            Person d3 = new Person("Don", 10);
    
            ArrayList<Person> persons3 = new ArrayList<Person>();
            persons3.add(a3);
            persons3.add(b3);
            persons3.add(c3);
            persons3.add(d3);
    
            balanceAccounts(persons3);
            System.out.println();
    
            System.out.println("TEST CASE 4 (4 ppl)");
            Person a4 = new Person("Alice", 40);
            Person b4 = new Person("Bob", 40);
            Person c4 = new Person("Charlie", 10);
            Person d4 = new Person("Don", 10);
    
            ArrayList<Person> persons4 = new ArrayList<Person>();
            persons4.add(a4);
            persons4.add(b4);
            persons4.add(c4);
            persons4.add(d4);
    
            balanceAccounts(persons4);
            System.out.println();
            
            System.out.println("TEST CASE 5 (4 ppl, with 1 person paying significantly more)");
            Person a5 = new Person("Alice", 200);
            Person b5 = new Person("Bob", 80);
            Person c5 = new Person("Charlie", 50);
            Person d5 = new Person("Don", 20);
    
            ArrayList<Person> persons5 = new ArrayList<Person>();
            persons5.add(a5);
            persons5.add(b5);
            persons5.add(c5);
            persons5.add(d5);
    
            balanceAccounts(persons5);
            System.out.println();
    
            System.out.println("TEST CASE 6 (4 ppl, with 2 persons paying significantly more)");
            Person a6 = new Person("Alice", 160);
            Person b6 = new Person("Bob", 120);
            Person c6 = new Person("Charlie", 50);
            Person d6 = new Person("Don", 20);
    
            ArrayList<Person> persons6 = new ArrayList<Person>();
            persons6.add(a6);
            persons6.add(b6);
            persons6.add(c6);
            persons6.add(d6);
    
            balanceAccounts(persons6);
            System.out.println();
            
            System.out.println("EXAMPLE SCENARIO TEST CASES\n");
            System.out.println("TEST CASE 7");
            Person a7 = new Person("Alice", 60);
            Person b7 = new Person("Bob", 120);
            Person c7 = new Person("Charlie", 30);
    
            ArrayList<Person> persons7 = new ArrayList<Person>();
            persons7.add(a7);
            persons7.add(b7);
            persons7.add(c7);
    
            balanceAccounts(persons7);
            System.out.println();
    
            System.out.println("TEST CASE 8");
            Person a8 = new Person("Ali", 10);
            Person b8 = new Person("Zack", 30);
    
            ArrayList<Person> persons8 = new ArrayList<Person>();
            persons8.add(a8);
            persons8.add(b8);
    
            balanceAccounts(persons8);
            System.out.println();
    
            System.out.println("MY TEST CASES\n");
            System.out.println("TEST CASE 9 (Everyone pays the same amount)");
            Person a9 = new Person("Alice", 23);
            Person b9 = new Person("Bob", 23);
            Person c9 = new Person("Charlie", 23);
    
            ArrayList<Person> persons9 = new ArrayList<Person>();
            persons9.add(a9);
            persons9.add(b9);
            persons9.add(c9);
    
            balanceAccounts(persons9);
            System.out.println();
    
            System.out.println("TEST CASE 10 (Only one person pays)");
            Person a10 = new Person("Alice", 0);
            Person b10 = new Person("Bob", 0);
            Person c10 = new Person("Charlie", 120);
            Person d10 = new Person("Don", 0);
            Person e10 = new Person("Ellie", 0);
    
            ArrayList<Person> persons10 = new ArrayList<Person>();
            persons10.add(a10);
            persons10.add(b10);
            persons10.add(c10);
            persons10.add(d10);
            persons10.add(e10);
    
            balanceAccounts(persons10);
            System.out.println();
        
    }

}
