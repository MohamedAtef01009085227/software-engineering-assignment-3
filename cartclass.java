import java.util.ArrayList;

public class Cart {
    private double items_price = 0;
    private ArrayList<Item> mycart = new ArrayList<>();

    void additem(Item it) {
        mycart.add(it);
    }

    void removeitem(Item it) {
        for (Item i : mycart) {
            if (i.getName() == it.getName()) {
                mycart.remove(i);
            }
        }
    }

    void calc_items_price() {
        for (Item i : mycart) {
            items_price += i.getPrice();
        }
    }

    ArrayList<Item> get_items() {
        return mycart;
    }

    double get_price() {
        return items_price;
    }

}