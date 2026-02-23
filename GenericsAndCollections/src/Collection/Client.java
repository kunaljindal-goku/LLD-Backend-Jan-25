package Collection;

import InventoryManagementSystem.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Item i1 = new Item("1","A",100,5);
        Item i2 = new Item("2","D",120,4);
        Item i3 = new Item("3","B",80,2);

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);

        Collections.sort(items);

        for(Item item: items) {
            System.out.println(item.getName() + " " + item.getPrice() + " " + item.getQuantity());
        }
    }
}
