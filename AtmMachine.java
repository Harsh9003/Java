import java.util.Scanner;

class ATM{
    float Balance;
    int Pin = 7564; //Default Pin

    public void checkpin(){
        System.out.print("Enter your pin: ");
        Scanner obj = new Scanner(System.in);
        int enterPin = obj.nextInt();

        if(enterPin == Pin){
            menu();
        }
        else{
            System.out.println("Incorrect Pin");
            checkpin();
        }
        
    }

    public void menu(){
        System.out.println("Your Options :: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Ammount");
        System.out.println("3. Deposite Ammount");
        System.out.println("4. Exit");
        System.out.print("Enter your choice :: ");
        Scanner nScanner = new Scanner(System.in);
        int opt = nScanner.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawAmmount();
        }
        else if(opt == 3){
            depositeAmmount();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter Valid a choice");
        }

    }

    public void checkBalance(){
        System.out.println("Balance :: "+ Balance);
        System.out.println("Choose Options :: ");
        System.out.println("1. Go to Menu");
        System.out.println("2. Withdraw Ammount");
        System.out.println("3. Deposite Ammount");
        System.out.println("4. Exit");
        System.out.print("Enter your choice :: ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt == 1){
            menu();
        }
        else if(opt == 2){
            withdrawAmmount();
        }
        else if(opt == 3){
            depositeAmmount();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter valid choice");
        }
    }

    public void withdrawAmmount(){
        System.out.print("Enter Withdraw Ammount :: ");
        Scanner amScanner = new Scanner(System.in);
        float Ammount = amScanner.nextFloat();
        if(Ammount>Balance){
            System.out.println("Insufficient Balacne");
        }
        else{
            Balance = Balance - Ammount;
            System.out.println("Money Withdrawl successfully");
            System.out.println("Current Balance:: " + Balance);
        }
        menu();
    }

    public void depositeAmmount(){
        System.out.print("Enter Deposite Ammoun :: ");
        Scanner amScanner = new Scanner(System.in);
        float depAmmount = amScanner.nextFloat();
        Balance = Balance + depAmmount;
        System.out.println("Cash Deposite Successfully");
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
