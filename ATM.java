package javaProgram;
import java.util.Scanner;
public class ATM {
	

	
	    private static double balance = 1000.0;
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int choice;

	        do {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Enter your card with your pin code");
	            System.out.println("2. Check Balance");
	            System.out.println("3. Deposit");
	            System.out.println("4. Withdraw");
	            System.out.println("5. Display Current Balance");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    enterPin();
	                    break;
	                case 2:
	                    checkBalance();
	                    break;
	                case 3:
	                    deposit();
	                    break;
	                case 4:
	                    withdraw();
	                    break;
	                case 5:
	                    displayBalance();
	                    break;
	                case 6:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 6);
	    }

	    private static void enterPin() 
	    {
	        
	        System.out.println("PIN code entered successfully.");
	    }

	    private static void checkBalance() 
	    {
	        System.out.println("Your current balance is: $" + balance);
	    }

	    private static void deposit()
	    {
	        System.out.print("Enter the amount to deposit: $");
	        double amount = scanner.nextDouble();
	        if (amount > 0)
	        {
	            balance += amount;
	            System.out.println("Deposit of $" + amount + " successful.");
	        } 
	        else 
	        {
	            System.out.println("Invalid amount. Please enter a positive amount.");
	        }
	    }

	    private static void withdraw() 
	    {
	        System.out.print("Enter the amount to withdraw: $");
	        double amount = scanner.nextDouble();
	        if (amount > 0 && amount <= balance) 
	        {
	            balance -= amount;
	            System.out.println("Withdrawal of $" + amount + " successful.");
	        } else if (amount > balance) 
	        {
	            System.out.println("Insufficient funds.");
	        } 
	        else
	        {
	            System.out.println("Invalid amount. Please enter a positive amount.");
	        }
	    }

	    private static void displayBalance() {
	        System.out.println("Your current balance is: $" + balance);
	    }
	}
	


