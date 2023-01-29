package Homework9;

public class CompanyET extends Company {
    private String owner;
    private double intialCapital;
    private double currentCapital;

    public CompanyET(){
    }

    public CompanyET(String name, String startDate, String bulstat, String owner, double intialCapital, double currentCapital){
        super(name, startDate, bulstat);
        this.owner = owner;
        this.intialCapital = intialCapital;
        this.currentCapital = currentCapital;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if ((!owner.trim().isEmpty())) {
        } else {
            System.out.println("System Error: Invalid input for name.");
        }
        this.owner = owner;
    }

    public double getIntialCapital() {
        return intialCapital;
    }

    public void setIntialCapital(double intialCapital) {
        if (intialCapital >= 0) {
            this.intialCapital = intialCapital;
        } else {
            System.out.println("System Error: Invalid input for intial capital.");
        }
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        if (currentCapital >= 0) {
            this.currentCapital = currentCapital;
        } else {
            System.out.println("System Error: Invalid input for current capital.");
        }
    }


    public double getProfit(){
        double profit = currentCapital - intialCapital;
        return profit;
    }

    public String toString(){
        return  "Name Company: " + getName() + '\n' + "Start date: " + getStartDate() + '\n' + "Bulstat: " + getBulstat() + '\n'
                + "Owner: " + owner + '\n' + "Initial Capital: " + intialCapital + '\n' + "Current Capital: " + currentCapital + '\n';
    }

    public void invoice(){
    System.out.println("\n" +
            "Invoice: FK230011\n" + "date: 29/01/23\n" +
            "Customer: Iliyana 89 Ltd.\n" +
            "Address: Sofia, ul. Vitosha 17 \n" +
            "Company №: BG23896534\n" +
            "\n" +
            "Contractor: Peycho 89 Ltd.\n" +
            "Addreess: Sofia, ul. Vitosha 18\n" +
            "Company №: BG89221123\n" +
            "\n" +
            "№  Description of goods/service  Quantity  Unit value  Total value\n" +
            "Buyer: \n" + "Seller:");
    }
}