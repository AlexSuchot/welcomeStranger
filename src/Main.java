import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Create an empty inventory for the player and the vendor :
        Map<Integer, Item> player1Inventory = new HashMap<Integer, Item>();
        Map<Integer, Item> vendor1Inventory = new HashMap<Integer, Item>();

        // Create a player and a vendor :
        Player player1 = new Player(player1Inventory, "Speleize", 2000.0);
        Vendor vendor1 = new Vendor(vendor1Inventory, "Shagger", 3000.0);

        // Adding items to the player inventory :
        player1Inventory.put(0, new Item("healing potion", 200.0, "consumable"));
        player1Inventory.put(1, new Item("iron sword", 400.0, "weapon"));
        player1Inventory.put(2, new Item("leather armor", 350.0, "armor"));

        // Adding items to the vendor inventory :
        vendor1Inventory.put(0, new Item("mana potion", 220.0, "consumable"));
        vendor1Inventory.put(1, new Item("healing potion", 200.0, "consumable"));
        vendor1Inventory.put(2, new Item("steel sword", 560.0, "weapon"));
        vendor1Inventory.put(3, new Item("iron armor", 500.0, "armor"));

        player1.Describe(player1);
        vendor1.Describe(vendor1);
        System.out.println("La taille du " + player1.getInventory().size());

        Double result = player1.getMoney() - player1.getInventory().get(1).getPrice();
        player1.Describe(player1);
        System.out.println("The player 1 has : " + player1.getMoney() + "$. He's buying : " +
                player1.getInventory().get(1).getName() + " which cost : " +
                player1.getInventory().get(1).getPrice() + "$. He still have : " +
                result + "$.");

    }
}
