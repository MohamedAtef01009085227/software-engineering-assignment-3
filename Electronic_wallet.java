import java.util.Scanner;
public class Electronic_wallet extends Payment {
    protected String username;
    protected String password;
    protected double balance;

    Scanner scan = new Scanner(System.in); 
    void pay()
    {
        int choice;
        System.out.println("press (1) to confirm your payment method otherwise press (2)");
        choice = scan.nextInt();
        if(choice == 1)
            System.out.println("Payment successfully");
        else
            System.out.println("Payment canceled");
        return;
    }
    void login()
    {
        System.out.println("Enter your username; ");
        this.username = scan.nextLine();
        System.out.println("Enter your password: ");
        this.password = scan.nextLine();
        System.out.println("Login complete");
        System.out.println("Your balance:" + this.balance);
    }
    void set_balance(double b)
    {
        this.balance = b;
    }
    double get_balance()
    {
        return balance;
    }
    void set_method()
    {
        this.method = "E-wallet";
    }
}
