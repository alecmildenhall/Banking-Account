import java.util.Scanner;

class BankingApplication {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.print("Input Name: ");
        String name = in.nextLine();

        System.out.print("Input ID: ");
        String identity = in.nextLine();

        BankAccount account1 = new BankAccount(name, identity);
        account1.showMenu();
    }
}
