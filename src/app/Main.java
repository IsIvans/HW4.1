package app;

public class Main {
    static int sum;
    static int number;

    public static void main(String[] args) {

        for (int i = 1; i<=6; i++) {
            sum += i;
            number++;
            System.out.print(number+") Num is "+ i+", ");
            System.out.println("sum is " + sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is "+ sum);

    }
}