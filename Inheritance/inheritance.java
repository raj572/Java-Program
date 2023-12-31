class Vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
class Car extends Vehicle{
    String ftype;
    boolean sunroof;
    String brand;

}

public class inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tata";
        car1.color = "black";
        car1.mileage = 18.3;
        car1.ftype = "Diesel";
        car1.sunroof = true;
        car1.price = 1500000;

        car1.display();
        
    }
    
}