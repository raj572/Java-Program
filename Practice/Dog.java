public class Dog {
    private String name;
    private String breed;

    // Constructor to initialize the Dog with name and breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for the breed attribute
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Getter method for the breed attribute
    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        // Creating two instances of the Dog class
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Labrador");

        // Printing the initial values
        System.out.println("Initial values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modifying attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("Beagle");

        // Printing the updated values
        System.out.println("\nUpdated values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}
