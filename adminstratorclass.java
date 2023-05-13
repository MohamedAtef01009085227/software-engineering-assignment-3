import java.util.Scanner;
public class Adminastrator {
    private admincatalog catalog;
    private soldItem sealed;
    private LooseItem loose;
    public void setCatalog(admincatalog cat){
        catalog = cat;
    }

    public void addToCatalog(){
        System.out.println("what would you like to add \n1-sealed item\n2-loose item");
        try (Scanner objScanner = new Scanner(System.in)) {
            String choice = objScanner.nextLine();
            while(!choice.trim().equals("1") && !choice.trim().equals("2")){
                System.out.println("  for sealed item press 1 , for loose item press 2");
                choice = objScanner.nextLine();
            }
            //inserting item name
            System.out.println("insert item name");
            String itemName = objScanner.nextLine();

            //inserting item brand
            System.out.println("insert item brand");
            String brand = objScanner.nextLine();

            //inserting item category
            System.out.println("insert item category");
            String category = objScanner.nextLine();

            //inserting item describtion
            System.out.println("insert item describtion");
            String describtion = objScanner.nextLine();

            double price , discount;
            //inserting item price
            System.out.println("insert item Price");
            while(true){
            try {
                price = objScanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid price !!! , please insert a valid price");
                objScanner.nextLine();
            }}
            //discount
            System.out.println("insert item discount");
            while(true){
            try {
                discount = objScanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid price !!! , please insert a valid price");
                objScanner.nextLine();
            }}
            if(choice.trim().equals("1")){
                int availableUnits;
                System.out.println("Write the availavle untis");
                while(true){
                try {
                    availableUnits = objScanner.nextInt();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid number of units");
                    objScanner.nextLine();
                }}
                sealed =new sealedItem(itemName, brand, category, describtion, price,discount, availableUnits);
                catalog.addToList(sealed);
            }
            else{
                Float availableKilos;
                System.out.println("Write the available kilos");
                while(true){
                try {
                    availableKilos = objScanner.nextFloat();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid number of kilos");
                    objScanner.nextLine();
                }}
                loose =new LooseItem(itemName, brand, category, describtion, price,discount, availableKilos);
                catalog.addToList(loose);
            }
        }
    }

    public void removeFromCatalog(){
        catalog.displayItems();
        System.out.println("insert the name of the item to be deleted");
        try (Scanner objScanner = new Scanner(System.in)) {
            String name = objScanner.nextLine();
            catalog.removefromCatalog(name);
        }
    }

    public void EditItem(){
        catalog.displayItems();
        System.out.println("insert the name of the item to be Updated");
        try (Scanner objScanner = new Scanner(System.in)) {
            String name = objScanner.nextLine();
            catalog.updateProductInfo(name);
        }
    }

}
