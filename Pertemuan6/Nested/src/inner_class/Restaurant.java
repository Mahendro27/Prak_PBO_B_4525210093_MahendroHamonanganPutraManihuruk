package inner_class;

public class Restaurant {
    // Instance fields - data spesifik restoran
    private String restaurantName;
    private String address;
    private String phone;

    // Static field - Data umum
    private static int totalRestaurants = 0;

    public Restaurant(String restaurantName, String address, String phone) {
        // 1. Perbaikan: gunakan 'restaurantName' sesuai nama parameter
        this.restaurantName = restaurantName;
        this.address = address;
        this.phone = phone;
        totalRestaurants++;
        System.out.println("Restaurant '" + restaurantName + "' created!");
    }

    public void displayRestaurantInfo() {
        System.out.println("\n--- Info Restoran ---");
        System.out.println("Nama    : " + restaurantName);
        System.out.println("Alamat  : " + address);
        System.out.println("Telepon : " + phone);
    }

    // Method helper untuk membuat objek inner class Order
    public Order createOrder(String customerName) {
        return new Order(customerName);
    }

    // Inner Class dimulai di sini
    public class Order {
        private String customerName;
        private String[] items;
        private int[] quantities;
        private double totalPrice;

        // 2. Perbaikan: hapus kata 'class' pada constructor
        // 3. Perbaikan: masukkan constructor dan method ke dalam kurung kurawal Order
        public Order(String customerName) {
            this.customerName = customerName;
            this.items = new String[10];
            this.quantities = new int[10];
            this.totalPrice = 0.0;
        }

        public void addItem(String itemName, int quantity, double price) {
            // Cari slot kosong
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = itemName;
                    quantities[i] = quantity;
                    totalPrice += (price * quantity);
                    break;
                }
            }
        }

        public void displayOrder() {
            System.out.println("\n=== ORDER DETAILS ===");
            System.out.println("Restaurant: " + restaurantName);
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
            System.out.println("Customer: " + customerName);
            System.out.println("Total Restaurant: " + totalRestaurants);

            System.out.println("\n--- Items Ordered ---");
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    System.out.println("- " + items[i] + " x" + quantities[i]);
                }
            }

            System.out.println("===========================");
            System.out.println("TOTAL: Rp " + totalPrice);
            System.out.println("Thank you for ordering from " + restaurantName + "!");
        }

        // Method untuk proses order
        public void processOrder() {
            // Sedikit dirapikan spasinya di sekitar kata "at"
            System.out.println("\nProcessing order for " + customerName + " at " + restaurantName);
            System.out.println("Contact: " + phone);
            System.out.println("Delivery to provided address...");
        }
    }
}