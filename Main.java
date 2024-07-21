

import java.util.Scanner;


public class Main {
    
    private static final String LAUNDRY_NAME = "Quick Wash";
    private static final String LAUNDRY_ADDRESS = "Jl. Merdeka No. 1";
    private static final String LAUNDRY_PHONE = "08123456789";

    static Scanner scanner = new Scanner(System.in);
    static Repository repository = new Repository();

    public static void main(String[] args) {
        while (true) {
            System.out.println(LAUNDRY_NAME);
            System.out.println("==================================================================");
            System.out.println(LAUNDRY_ADDRESS + LAUNDRY_PHONE);

             // ini function add Customer dr inputan
            System.out.println("Enter Customer Name : ");
            String custName = scanner.nextLine();

            System.out.println("Enter Customer Phone Number : ");
            String custNumber = scanner.nextLine();

            repository.Customer(custName, custNumber);

            System.out.println("==========List Layanan===============");

            repository.serviceMenu();
            System.out.println("\nMenu:");
            System.out.println("1. Create New Order");
            System.out.println("2. Order Invoice");
            System.out.println();

            System.out.print("Input [0:EXIT]: ");
            int selectionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (selectionMenu) {
                case 1 -> repository.addOrder();
                case 2 -> repository.Order();
                case 0 -> {
                    Repository.exitApp();
                    return;
                }
                default -> System.out.println("Kode menu yang anda input tidak valid!");
            }

        }
    }
}