public class Car {
    // Data members
    String brand;
    String model;
    double price;

    // Constructor to initialize values
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Creating 3 objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 26000);
        Car car2 = new Car("Tesla", "Model 3", 39000);
        Car car3 = new Car("Ford", "Mustang", 42000);

        // Displaying details
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}