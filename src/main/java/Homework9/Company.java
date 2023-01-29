package Homework9;

public class Company {
    private String name;
    private String startDate;
    private String bulstat;

    public Company(String name, String startDate, String bulstat){
    setName(name);
    setStartDate(startDate);
    setBulstat(bulstat);
    }

    public Company() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
        this.name = name;
        } else {
            System.out.println("System Error: Invalid input for name.");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.trim().isEmpty()) {
            this.startDate = startDate;
        } else {
            System.out.println("System Error: Invalid input for start date.");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if ((bulstat.length()) == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("System Error: Invalid input for bulstat.");
        }
    }

    public String toString(){
        return "Company: " +
                "name : " + name  +
                ", startDate : " + startDate +
                ", bulstat : " + bulstat;
    }
}