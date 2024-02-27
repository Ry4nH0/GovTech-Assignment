package test;

import main.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    // TEST CASES FOR WHEN AVERAGEPAID IS A DOUBLE
    
    // Tests if under.getPaid() + payOver > averagePaid, then payOver = averagePaid - under.getPaid()
    @Test
    public void ifUnderPaidPlusPayOverGreaterThanAveragePaidDouble_thenPayOverEqualsToAveragePaidDoubleMinusUnderPaid() {
        Person under = new Person("Alice", 40.50);
        Person over = new Person("Bob", 60.70);
        
        double averagePaid = 44.80;
        String expected = "Alice pays Bob $4.30.\n";
        String actual = over.overPaidByUnder(under, averagePaid);
        // System.out.println(averagePaid);
        
        assertEquals(expected, actual);
    }

    // Tests if under.getPaid() + payOver < averagePaid, then payOver = over.getPaid() - averagePaid
    @Test
    public void ifUnderPaidPlusPayOverLessThanAveragePaidDouble_thenPayOverEqualsToOverPaidMinusAveragePaidDouble() {
        Person under = new Person("Alice", 11.40);
        Person over = new Person("Bob", 112.30);

        double averagePaid = 81.60;
        // System.out.println(averagePaid);
        String expected = "Alice pays Bob $30.70.\n";
        String actual = over.overPaidByUnder(under, averagePaid);

        assertEquals(expected, actual);
    }

    // Tests if under.getPaid() + payOver == averagePaid, then payOver = over.getPaid() - averagePaid
    @Test
    public void ifUnderPaidPlusPayOverEqualToAveragePaidDouble_thenPayOverEqualsToOverPaidMinusAveragePaidDouble() {
        Person under = new Person("Alice", 9.70);
        Person over = new Person("Bob", 111.40);

        double averagePaid = 60.55;
        // System.out.println(averagePaid);
        String expected = "Alice pays Bob $50.85.\n";
        String actual = over.overPaidByUnder(under, averagePaid);

        assertEquals(expected, actual);
    }

    // TEST CASES FOR WHEN AVERAGEPAID IS AN INTEGER
    
    // Tests if under.getPaid() + payOver > averagePaid, then payOver = averagePaid - under.getPaid()
    @Test
    public void ifUnderPlusPayOverGreaterThanAveragePaidInt_thenPayOverEqualsToAveragePaidIntMinusUnderPaid() {
        Person under = new Person("Alice", 40);
        Person over = new Person("Bob", 60);
        
        int averagePaid = 45;
        // System.out.println(averagePaid);
        String expected = "Alice pays Bob $5.\n";
        String actual = over.overPaidByUnder(under, averagePaid);
        
        assertEquals(expected, actual);
    }

    // Tests if under.getPaid() + payOver < averagePaid, then payOver = over.getPaid() - averagePaid
    @Test
    public void underPlusPayOverLessThanAveragePaidInt_thenPayOverEqualsToOverPaidMinusAveragePaidInt() {
        Person under = new Person("Alice", 10);
        Person over = new Person("Bob", 110);

        int averagePaid = 80;
        // System.out.println(averagePaid);
        String expected = "Alice pays Bob $30.\n";
        String actual = over.overPaidByUnder(under, averagePaid);

        assertEquals(expected, actual);
    }

    // Tests if under.getPaid() + payOver == averagePaid, then payOver = over.getPaid() - averagePaid
    @Test
    public void underPlusPayOverEqualToAveragePaidInt_thenPayOverEqualsToOverPaidMinusAveragePaidInt() {
        Person under = new Person("Alice", 10);
        Person over = new Person("Bob", 110);

        int averagePaid = 60;
        // System.out.println(averagePaid);
        String expected = "Alice pays Bob $50.\n";
        String actual = over.overPaidByUnder(under, averagePaid);

        assertEquals(expected, actual);
    }
    
    
}
