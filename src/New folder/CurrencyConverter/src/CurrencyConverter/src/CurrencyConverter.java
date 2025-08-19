import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed conversion rates (example)
        double usdToInr = 83.5;
        double eurToInr = 91.2;

        System.out.println("--- Currency Converter ---");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double converted = 0;

        switch (choice) {
            case 1:
                converted = amount * usdToInr;
                System.out.println(amount + " USD = " + converted + " INR");
                break;
            case 2:
                converted = amount * eurToInr;
                System.out.println(amount + " EUR = " + converted + " INR");
                break;
            default:
                System.out.println("❌ Invalid option");
        }
        sc.close();
    }
}

