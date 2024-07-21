import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repository {
    private List<Customer> customers;


    private static int counterCustomers = 1;
    private static int counterServices = 1;
    private static int counterOrders = 1;
    private static int counterOrderDetails = 1;

    public Repository() {
        customers = new ArrayList<>();
        // services = new ArrayList<>();
        // cashiers = new ArrayList<>();
    }

    Object[][] ServiceMenu = {
        {"Cuci Kering + Setrika", 7000},
        {"Cuci Kering", 6000},
        {"Setrika", 5000},
        {"Jaket", 5000},
        {"Selimut/Seprai", 5000}
    };

    private static String getCurrentDate() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    private static String generateId(String type) {
        String dateNow = getCurrentDate();
        switch (type) {
            case "customer" -> {
                return dateNow + "CUS" + String.format("%04d", counterCustomers++);
            }
            case "service" -> {
                return dateNow + "SVC" + String.format("%04d", counterServices++);
            }
            case "order" -> {
                return dateNow + "ORD" + String.format("%04d", counterOrders++);
            }
            case "orderdetail" -> {
                return dateNow + "ORT" + String.format("%04d", counterOrderDetails++);
            }
            default -> throw new AssertionError();
        }
    }

    public void addOrder(){
        System.out.println("add order");
    }
    
    public void Order(){
        System.out.println("add order");
    }

    public void deleteOrder(){
        System.out.println("add order");
    }

    public static void exitApp() {
        System.out.println("Exiting the program. Thank you!");
        System.exit(0);
    }

    public void Customer(String name, String phoneNumber) {
        String id = generateId("customer");

        Customer newCustomer = new Customer(id, name, phoneNumber);
        customers.add(newCustomer);
    }
    
    public void serviceMenu(){
        for (int i = 0; i < ServiceMenu.length; i++) {
            System.out.print(1+". "+i);
            for (int j = 0; j < ServiceMenu[i].length; j++) {
                System.out.print(ServiceMenu[i][j] + " ");
            }
            // Pindah baris setelah mencetak semua elemen dalam satu baris
            System.out.println(); 
        }
    }
}
