package src.inner_class;

public class Restaurant {
    
    private String restaurantName;
    private String address;
    private String phone;

    private static int totalRestaurants = 0;

    public Restaurant(String restaurantName, String address, String phone) {
       
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

    public Order createOrder(String customerName) {