package Collection;

import InventoryManagementSystem.Item;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {

    // sort based on quantity asc
    // then sort based on name desc
    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getQuantity() < o2.getQuantity()) {
            return -1;
        }
        else if(o1.getQuantity() > o2.getQuantity()) {
            return 1;
        }
        else if(o1.getName().compareTo(o2.getName()) < 0) { // o1 - 'a' o2 - 'c'
            return 1;
        }
        else if(o1.getName().compareTo(o2.getName()) > 0) {
            return -1;
        }

        return 0;
    }
}
