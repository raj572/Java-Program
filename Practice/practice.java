import java.util.Scanner;

class practice {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read a line of text entered by the user
        String userName = scanner.nextLine();

        // Prompt the user for another input
        System.out.print("Enter your age: ");

        // Read an integer entered by the user
        int userAge = scanner.nextInt();

        // Display the entered information
        System.out.println("Hello, " + userName + "! You are " + userAge + " years old.");

        // Close the Scanner to prevent resource leak (optional but good practice)
        scanner.close();
        for(int i=0; i<10;i++){
            System.out.print(i);
        }
    }
}
