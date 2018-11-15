import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create an empty inventory for the player and the vendor :
        List<Item> player1Inventory = new ArrayList<Item>();
        List<Item> vendor1Inventory = new ArrayList<Item>();

        // Create a player and a vendor :
        Player player1 = new Player(player1Inventory, "Speleize", 1000.0);
        Vendor vendor1 = new Vendor(vendor1Inventory, "Shagger", 3000.0);

        // Adding items to the player inventory :
        player1Inventory.add(new Item("healing potion", 200.0, "consumable"));
        player1Inventory.add(new Item("iron sword", 400.0, "weapon"));
        player1Inventory.add(new Item("leather armor", 350.0, "armor"));

        // Adding items to the vendor inventory :
        vendor1Inventory.add(new Item("mana potion", 220.0, "consumable"));
        vendor1Inventory.add(new Item("healing potion", 200.0, "consumable"));
        vendor1Inventory.add(new Item("steel sword", 560.0, "weapon"));
        vendor1Inventory.add(new Item("iron armor", 500.0, "armor"));

        player1.Describe(player1);
        vendor1.Describe(vendor1);

        player1.Choice(player1, vendor1);

        player1.Describe(player1);
        vendor1.Describe(vendor1);


    }

}
