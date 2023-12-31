class Calculator{

    int a;
    int b;

    public void add(){
        System.out.println("Please give atleast two numbers to add");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b , int c){
        System.out.println(a+b+c);
    }


}



public class polyExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(25,25);
        cal.add(1,2,2);
        cal.add();
    }

}