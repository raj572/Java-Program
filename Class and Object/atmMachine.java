import java.util.Scanner;

class AtmProject {
    float balance;
    int pin = 1432;


    //constructor 
    AtmProject() {
        System.out.println("Enter your PIN");
        try (Scanner sc = new Scanner(System.in)) {
            int enteredpin = sc.nextInt();
            if(enteredpin==pin){
                menu();
            }
            else{
                System.out.println("Enter a valid pin");
            }
        }

    }
    public void menu(){
        System.out.println("Choose your choice");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. EXIT");

        try (Scanner sc = new Scanner(System.in)) {
            int opt = sc.nextInt();

            if(opt == 1){
                checkbalance();
            }else if(opt == 2){
                Withdraw();
            }else if(opt == 3){
                Deposite();
            }else if(opt == 4){
                return;
            }else{
                System.out.println("Choose correct option ");
            }
        }
        menu();
    }
    public void checkbalance(){
        System.out.println("Your current balance : " + balance);
        menu();
    }
    public void Withdraw(){
        System.out.println("Enter Amount to Withdraw");
        try (Scanner sc = new Scanner(System.in)) {
            float amount = sc.nextFloat();
            if(amount>balance){
                System.out.println("Insufficent Balance!");
            } else{
                balance = balance - amount;
                System.out.println("Money Withdrawn Successfully!");
            }
        }
        menu();

    }
    public void Deposite(){
        System.out.println("Enter Amount to Deposite");
        try (Scanner sc = new Scanner(System.in)) {
            float amount = sc.nextFloat();
            balance = amount + balance;
        }
        System.out.println("Money Deposited Successfully!");
        menu();
    }
}

public class atmMachine {
    public static void main(String[] args) {
        AtmProject obj = new AtmProject();
    }

}
