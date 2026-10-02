class Car {
    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car information
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating 3 objects
        Car car1 = new Car("Toyota", "Fortuner", 3500000);
        Car car2 = new Car("BMW", "X5", 9500000);
        Car car3 = new Car("Mercedes-Benz", "C-Class", 6500000);

        // Displaying details
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
