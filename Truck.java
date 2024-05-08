// Subclass Truk
class Truck extends Vehicle {
    private int cargoCapacity;

    // Constructor
    public Truck(String brand, double price, int year, int cargoCapacity) {
        super(brand, price, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Method untuk menghitung diskon
    @Override
    public double calculateDiscount() {
        if (cargoCapacity > 200) {
            return 0.1 * price; // Diskon 10%
        } else {
            return 0; // Tidak ada diskon
        }
    }
}
