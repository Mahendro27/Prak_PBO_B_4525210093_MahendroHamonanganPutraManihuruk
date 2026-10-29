package static_nested;

public class VendingMachine {
    
    private static String machineBrand = "JavaVend";
    private static int totalMachines = 0;
    private static final int MAX_ITEMS = 10;

    private String location;
    private int machineId;

    public VendingMachine(String location) {
        this.location = location;
        totalMachines++;
        this.machineId = totalMachines;
    }

    public void displayMachineInfo() {
        System.out.println("Machine ID: " + machineId);
        System.out.println("Location: " + location);
        System.out.println("Brand: " + machineBrand);
        System.out.println("Total Machines: " + totalMachines);
    }

    public void buyProduct(Product product, int quantity) {
        System.out.println("=== Vending Machine #" + machineId + " at " + location + " ===");
        System.out.println("Buying " + quantity + " x " + product.getName());
        System.out.println("Total: Rp " + (product.getPrice() * quantity));
        System.out.println("Thank you for using " + machineBrand + "!\n");
    }

    public static class Product {
        private String name;
        private int price;
        private static int totalProducts = 0;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
            totalProducts++;
        }

        public void displayInfo() {
            System.out.println("Product: " + name);
            System.out.println("Price: Rp " + price);
            System.out.println("Brand: " + machineBrand);
            System.out.println("Max Items: " + MAX_ITEMS);
            System.out.println(); 
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public static int getTotalProducts() {
            return totalProducts;
        }
    }
}