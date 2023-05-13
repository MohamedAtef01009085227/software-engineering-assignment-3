import java.util.Scanner;

public class Order {
    private double total_price;
    protected String address;
    private Cart thecart;
    protected Payment paymentmethod;

    Scanner scan = new Scanner(System.in);

    void calc_total_price()
    {
        double tax = thecart.get_price() * (14/100);
        total_price = thecart.get_price() + tax;
    }
    double get_total_price()
    {
        return total_price; 
    }
    void set_address(String a)
    {
        this.address = a;
    }
    String get_address()
    {
        return address;
    }
    void cancel_item(Item it)
    {
        thecart.removeitem(it);
        total_price -= it.getPrice();
    }
    void review_order()
    {
        System.out.println("Total Price:" + " " + total_price);
        System.out.println("Address:" + " " + address);
    }
    void checkout()
    {
        int choice;
        int choice2;
        System.out.println("total price: " + total_price);
        System.out.println("are you sure to checkout (1) YES (2) NO");
        choice = scan.nextInt();
        if(choice == 1)
        {
            System.out.println("How do you want to pay by ? (1) CASH (2) E-WALLET ");
            choice2 = scan.nextInt();
            if(choice2 == 1)
                paymentmethod = new Cash();
            else
                paymentmethod = new Ewallet();
            System.out.println("Checkout done!");
        }else{
            System.out.println("Checkout cancelled");
            return;
        }

    }
}