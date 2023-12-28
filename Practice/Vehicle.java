public class Vehicle {
    // Attributes or fields
    String make;
    String model;
    int year;

    // Constructor with parameters
    public Vehicle(String make, String model, int year) {
        // Initializing the attributes with the values passed as parameters
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the vehicle
    public void displayInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
    }
}



