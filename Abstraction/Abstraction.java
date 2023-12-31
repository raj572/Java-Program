abstract class Car {
    abstract public void fueltype(); 
    
    /*we only declare abstract method , do not create body of method here.*/
    // public void color(){
    //     System.out.println("Red");
    // }  
}

class Tata extends Car{
    public void fueltype(){
        System.out.println("Diesel");
    }
}


public class Abstraction{
    public static void main(String[] args) {
        Tata naxon = new Tata();
        // naxon.color();
        naxon.fueltype();

        
    }
}