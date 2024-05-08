// Subclass Car
class Car extends Vehicle {
    private String type; // City Car, Family Car, Premium Car
    // Constructor
    public Car(String brand, double price, int year, String type) {
        super(brand, price, year);
        this.type = type;
    }

    // Method untuk menghitung diskon
    @Override
    public double calculateDiscount() {
        if (type.equals("Family Car")) {
            return 0.05 * price; // Diskon 5%
        } else if (type.equals("Premium Car")) {
            return 0.15 * price; // Diskon 15%
        } else {
            return 0; // Tidak ada diskon untuk tipe lain
        }
    }
}

