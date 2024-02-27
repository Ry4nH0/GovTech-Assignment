package main;
    
public class Person {

    private String name;
    private double paid;
    
    public Person(String name, double paid) {
        this.name = name;
        this.paid = paid;
    }

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


    public String overPaidByUnder(Person under, double averagePaid) {

        double payOver = this.getPaid() - averagePaid;

        if (under.getPaid() + payOver > averagePaid) {
            
            payOver = averagePaid - under.getPaid();
            
            this.setPaid(this.getPaid() - payOver);
            under.setPaid(under.getPaid() + payOver);
            
        } else {
            
            this.setPaid(this.getPaid() - payOver);
            under.setPaid(under.getPaid() + payOver);
        }
        
        // System.out.printf("%s pays %s $%.2f.\n", under.getName(), this.getName(), payOver);
        return String.format("%s pays %s $%.2f.\n", under.getName(), this.getName(), payOver);
    }
        
    public String overPaidByUnder(Person under, int averagePaid) {

        int payOver = (int) this.getPaid() - averagePaid;
        
        if (under.getPaid() + payOver > averagePaid) {

            payOver = averagePaid - (int) under.getPaid();
            
            this.setPaid(this.getPaid() - payOver);
            under.setPaid(under.getPaid() + payOver);

            
        } else {
            
            this.setPaid((int) this.getPaid() - payOver);
            under.setPaid((int) under.getPaid() + payOver);
        }
        
        // System.out.printf("%s pays %s $%d.\n", under.getName(), this.getName(), payOver);
        return String.format("%s pays %s $%d.\n", under.getName(), this.getName(), payOver);
    }

}