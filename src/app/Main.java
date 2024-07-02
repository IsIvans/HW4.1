package app;

public class Main {

    static double finance;
    static double taxes;
    static double taxRate;


    public static void main(String[] args) {

        finance = 11456;
        taxRate = finance > 0 && finance <= 10000 ? 2.5 : finance > 10000 && finance <= 25000 ? 4.3 : 6.7;
        if (finance < 0) {
            System.out.println("Error");
        }else{
            taxes = (finance * taxRate) / 100;
            System.out.printf("Tax amount = "+"%.2f",taxes);
        }
    }
}
