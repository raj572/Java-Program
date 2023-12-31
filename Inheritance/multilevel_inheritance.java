//Example of multi level inheritance

class A{
    void methodA(){
        System.out.println("Method of A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method of B");
    }

}

class C extends B{
    void methodC(){
        System.out.println("Method of C");
    }

}

public class multilevel_inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodB();
    }
}
