//Example of hierarchical inheritance
class A{
    void methodA(){
        System.out.println("Class A method is runnig");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Class B method is runnig");
    }
}
class C extends A{
    void methodC(){
        System.out.println("Class C method is runnig");
    }
}
class D extends A{
    void methodD(){
        System.out.println("Class D method is runnig");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        B obj1 = new B();
        obj1.methodA();

    }
    
}
