package Homework9;

public class Test {
    public static void main(String [] args){
        CompanyET comp1 = new CompanyET("Peycho 89 Ltd.", "23/12/11", "BG89221123",
                "Peycho Peycho", 1000.01, 5003.05);


        System.out.println(comp1.toString());
        System.out.println("Profit : " + comp1.getProfit());
        comp1.invoice();
    }
}
