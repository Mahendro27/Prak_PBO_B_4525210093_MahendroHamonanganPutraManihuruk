package static_nested;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== VENDING MACHINE DEMO ===\n");

        VendingMachine.Product p1 = new VendingMachine.Product("Coca Cola", 8000);
        VendingMachine.Product p2 = new VendingMachine.Product("Potato Chips", 12000);
        VendingMachine.Product p3 = new VendingMachine.Product("Mineral Water", 5000);

        System.out.println("--- Product Info ---");
        p1.displayInfo();
        p2.displayInfo();

        System.out.println("Total products created: " + VendingMachine.Product.getTotalProducts());
        System.out.println();

        VendingMachine vm1 = new VendingMachine("Lobby Floor 1");
        VendingMachine vm2 = new VendingMachine("Cafeteria");

        System.out.println("--- Vending Machines ---");
        vm1.displayMachineInfo();
        vm2.displayMachineInfo();
        System.out.println();

        System.out.println("--- Purchase Simulation ---");
        vm1.buyProduct(p1, 2); 
        vm2.buyProduct(p2, 1); 
        vm1.buyProduct(p3, 3);
    }
}