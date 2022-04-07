import java.util.Scanner;


public class BankTransactATM {
    public static void main(String[] args){
        displayHeader();

        short pinNumber;
        byte choice;
        double balance = 100000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Pin Number... ex. 1234");
        pinNumber = scanner.nextShort();

        boolean result = pinValidate(pinNumber);

            if(!result) {
                System.out.println("Input Validation Failed! Entered an invalid Pin Number");
              
            } else {
                System.out.println("Please Choose from the options");
                choice = scanner.nextByte();
                balance = processTransaction(choice, balance);
                
                System.out.println("Your Current Balance: " + balance);
                System.out.println();
            }
        
        scanner.close();
    }

    private static double processTransaction(byte choice, double balance) {
        Scanner scanner = new Scanner(System.in);
        
        double amount, newBalance;

        switch(choice){
            case 1: 
                System.out.println("How much do you want to withdraw?");
                amount = scanner.nextDouble();
                scanner.close();
                newBalance = withdraw(amount, balance);
                System.out.println("Withdrawing " + amount);
                return newBalance;
            case 2: 
                System.out.println("How much do you want to deposit?");
                amount = scanner.nextDouble();
                scanner.close();
                newBalance = deposit(amount, balance);
                System.out.println("Depositing " + amount);

                return newBalance;
            case 3: 
                System.out.println("checking your balance...");
                scanner.close();
                return balance;
                
            case 4: 
                System.out.println("Exit");
                break;

        }
        scanner.close();
        return balance;
    }
    private static double withdraw(double amt, double bal) {
        if(bal <= 0){
            System.out.println("You have 0 balance in your account!");
            return bal;
        }else{
            return bal - amt; 
        }
    }

    private static double deposit(double amt, double bal){
        if(amt <= 0){
            System.out.println("Invalid Amount! You cannot Enter 0 or a negative Number!");
            return bal;
        }else{
            return bal + amt;
        }
    }

    private static boolean pinValidate(short pin) {
        return (pin == 1234) ? true : false ; 
    }

    private static void displayHeader(){
        System.out.println();
        System.out.println("<------------------ ATM MACHINE USING JAVA ------------------------>");
        System.out.println("<--------------------------- OPTIONS ------------------------------>");
        System.out.println("Enter 1 for Withdraw");
        System.out.println("Enter 2 for Deposit");
        System.out.println("Enter 3 for Check Balance");
        System.out.println("Enter 4 for Withdraw");
        System.out.println("<--------------------------- OPTIONS ------------------------------>");
        System.out.println();
    }   
}