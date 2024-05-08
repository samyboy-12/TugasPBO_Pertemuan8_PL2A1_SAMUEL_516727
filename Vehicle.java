class Vehicle {
    protected String brand;
    protected double price;
    protected int year;

    // Constructor
    public Vehicle(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    // Method untuk menghitung diskon (akan dioverride di subclass)
    public double calculateDiscount() {
        return 0; // Default, tidak ada diskon
    }
}