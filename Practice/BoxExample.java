import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
}

public class BoxExample {
    public static void main(String[] args) {
        double vol;
        Box box1 = new Box();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter height of the box : ");
            box1.height = sc.nextDouble();

            System.out.println("Enter width of the box : ");
            box1.width = sc.nextDouble();

            System.out.println("Enter depth of the box : ");
            box1.depth = sc.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return;
        }

        vol = box1.height * box1.width * box1.depth;

        System.out.println("Volume of the box is " + vol);
    }
}
