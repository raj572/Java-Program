class Animal{
    void eat(){
        System.out.println("Eating");
    }
        void run(){
        System.out.println("running");
    }
        void sleep(){
        System.out.println("sleeping");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }

}


public class inheritanceDOg {
    public static void main(String[] args) {
        Dog poupi = new Dog();
        poupi.eat();
        poupi.bark();
    }
    
}
