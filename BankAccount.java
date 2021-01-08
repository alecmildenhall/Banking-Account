import java.util.Scanner;

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cName, String cID) {
        customerName = cName;
        customerID = cID;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0)
            System.out.println("Deposited: " + previousTransaction);
        if (previousTransaction < 0)
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        else
            System.out.println("No transaction made.");
    }

    void showMenu() {
        char option = '0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("=====================================");
            System.out.println("Enter an option");
            System.out.println("=====================================");

            option = scanner.next().charAt(0);
            System.out.println();

            switch (option) {
                case 'A':
                    System.out.println("------------------------------");
                    System.out.println("Balance: " + balance);
                    System.out.println("------------------------------");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("------------------------------");
                    System.out.println("Enter amount to deposit:");
                    System.out.println("------------------------------");
                    System.out.println();

                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("------------------------------");
                    System.out.println("Enter amount to withdraw:");
                    System.out.println("------------------------------");
                    System.out.println();

                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("------------------------------");
                    getPreviousTransaction();
                    System.out.println("------------------------------");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("------------------------------");
                    break;

                default:
                    System.out.println("Invalid option! Please enter again, remember to capitalize your choice.");
                    break;
            }
        } while (option != 'E');

        System.out.println("Thank you for using our services!");
    }
}
