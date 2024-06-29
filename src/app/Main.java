package app;

public class Main {

    static String product = "Product";
    static String number = "No";
    static String productName;
    static int productCount;
    static double sales;
    static double price;
    static double totalSales;
    static int dayCount;
    final static String CURRENCY = "EUR";
    static double dailySales;

    public static void main(String[] args) {
        productCount = 1;
        productName = "smartphone";
        sales = 20;
        price = 607.67;
        totalSales = (double) (Math.round((sales * price) * 100)) / 100;
        dayCount = 5;
        dailySales = (double) (Math.round((totalSales/dayCount) * 100)) / 100;
        System.out.println(product+" "+number+" "+productCount+": "+productName+",");
        System.out.println("total "+ "sales for "+dayCount+" days is "+CURRENCY+" "+totalSales+",");
        System.out.println("sales by day is "+ CURRENCY+" "+dailySales+".");

        productCount = 2;
        productName = "laptop";
        sales = 5;
        price = 2097.37;
        totalSales = (double) (Math.round((sales * price) * 100)) / 100;
        dayCount = 7;
        dailySales = (double) (Math.round((totalSales/dayCount) * 100)) / 100;
        System.out.println(product+" "+number+" "+productCount+": "+productName+",");
        System.out.println("total "+ "sales for "+dayCount+" days is "+CURRENCY+" "+totalSales+",");
        System.out.printf("sales by day is "+ CURRENCY+" "+dailySales+".");




    }
}