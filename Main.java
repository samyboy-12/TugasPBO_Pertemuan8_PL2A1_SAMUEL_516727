public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Toyota", 50000, 2022, 250);
        Car car = new Car("Honda", 40000, 2023, "Family Car");

        // Menghitung diskon untuk truk dan mobil
        double truckDiscount = truck.calculateDiscount();
        double carDiscount = car.calculateDiscount();

        // Menampilkan hasil
        System.out.println("Diskon untuk truk: " + truckDiscount);
        System.out.println("Diskon untuk mobil: " + carDiscount);
    }
}
