
import java.util.Scanner;

public class MyExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask user to set a budget for month
        System.out.println("Enter your monthly budget: ");
        //makes answer to user input a double 
        double monthlyBudget = scanner.nextDouble();

        System.out.println("Enter the number of categories you want to track: ");
        //takes scanner info and sets to variable numofcategories
        int numberOfCategories = scanner.nextInt();

        double totalSpending = 0;

        for (int i = 0; i < numberOfCategories; i++) {
            System.out.println("Enter the spending for category " + (i + 1) + ": ");
            double spending = scanner.nextDouble();
            totalSpending += spending;
        }

        if (totalSpending <= monthlyBudget) {
            System.out.println("Congratulations! You are under budget.");
        } else {
            System.out.println("Unfortunately, you are over budget.");
        }
        scanner.close();

    }
}