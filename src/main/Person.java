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
    
    public void overPaidByUnder(Person under, double balancedPaid) {
        double payOver = balancedPaid - under.getPaid();
        this.setPaid(this.getPaid() - payOver);
        under.setPaid(under.getPaid() + payOver);
        
        System.out.printf("%s pays %s $%.2f.\n", under.getName(), this.getName(), payOver);
        // System.out.println("balance = " + balancedPaid + ", newOver = " + this.getPaid() + ", newUnder = " + under.getPaid());
    }

    public void overPaidByUnder(Person under, int balancedPaid) {
        
        int payOver = balancedPaid - (int) under.getPaid();
        
        this.setPaid((int) this.getPaid() - payOver);
        
        under.setPaid((int) under.getPaid() + payOver);
        
        System.out.printf("%s pays %s $%d.\n", under.getName(), this.getName(), payOver);
        System.out.println("balance = " + balancedPaid + ", newOver = " + this.getPaid() + ", newUnder = " + under.getPaid());
    }

}