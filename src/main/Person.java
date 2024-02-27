package main;

// Define a Person class
public class Person {

    // A Person has a name and the amount he/she paid for the group
    private String name;
    private double paid;
    
    // Constructor function
    public Person(String name, double paid) {
        this.name = name;
        this.paid = paid;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }


    // NOTE: 

    // Under refers to a person who paid an amount less than the averagePaid
    // Over refers to a person who paid an amount greater than the averagePaid


    // OverPaidByUnder is a function which determines the details of transaction
    // such as who are the 2 people involved, who pays who, and the amount paid


    // There are two overloaded OverPaidByUnder functions
    // Which function is called depends on the data type of the averagePaid parameter
    // passed in, whether it is a double or an integer


    // If averagePaid is a double use this function
    public String overPaidByUnder(Person under, double averagePaid) {

        // Define Payover as the value that should be paid from under to over
        // Payover is derived from overPaid - averagePaid
        double payOver = this.getPaid() - averagePaid;

        // If the payover amount + the amount under has paid > averagePaid
        if (under.getPaid() + payOver > averagePaid) {
            
            // Then Payover should be redefined as averagePaid - underPaid
            payOver = averagePaid - under.getPaid();
            
            // Set the new values of under and over after the transaction is made
            this.setPaid(this.getPaid() - payOver);
            under.setPaid(under.getPaid() + payOver);
        
        // Else if payover amount + the amount under has paid <= averagePaid
        // Keep the original definition of payover
        } else {
            
            // Set the new values of under and over after the transaction is made
            this.setPaid(this.getPaid() - payOver);
            under.setPaid(under.getPaid() + payOver);
        }
        
        // Return a String message detailing the transaction details
        return String.format("%s pays %s $%.2f.\n", under.getName(), this.getName(), payOver);
    }
        
    // If averagePaid is an integer, use this function instead
    public String overPaidByUnder(Person under, int averagePaid) {

        // Define Payover as the value that should be paid from under to over
        // Payover derived from overPaid - averagePaid
        int payOver = (int) this.getPaid() - averagePaid;
        
        // If the payover amount + the amount under has paid > averagePaid
        if (under.getPaid() + payOver > averagePaid) {

            // Then Payover should be redefined as averagePaid - underPaid
            payOver = averagePaid - (int) under.getPaid();
            
            // Set the new values of under and over after the transaction is made
            this.setPaid(this.getPaid() - payOver);
            under.setPaid(under.getPaid() + payOver);

        // Else if payover amount + the amount under has paid <= averagePaid
        // Keep the original definition of payover 
        } else {
            
            // Set the new values of under and over after the transaction is made
            this.setPaid((int) this.getPaid() - payOver);
            under.setPaid((int) under.getPaid() + payOver);
        }
        
        // Return a String message detailing the transaction details
        return String.format("%s pays %s $%d.\n", under.getName(), this.getName(), payOver);
    }

}