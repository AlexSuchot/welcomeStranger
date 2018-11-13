import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){


        // Create an empty inventory for the player and the vendor :
        Map<Integer, Item> player1Inventory = new HashMap<Integer, Item>();
        Map<Integer, Item> vendor1Inventory = new HashMap<Integer, Item>();


        // Create a player and a vendor :
        Player player1 = new Player(player1Inventory,"Speleize",2000.0);
        Vendor vendor1 = new Vendor(vendor1Inventory, "Shagger", 3000.0);


        // Adding items to the player inventory :
        player1Inventory.put(0, new Item("potion de santé",200.0,"consommable"));
        player1Inventory.put(1, new Item("épée de fer",400.0,"arme"));
        player1Inventory.put(2, new Item("armure en cuir",350.0,"armure"));


        System.out.println(player1.getInventory().get(1).getName());

        // Adding items to the vendor inventory :
        vendor1Inventory.put(0, new Item("potion de mana",220.0,"consommable"));
        vendor1Inventory.put(1, new Item("potion de santé",200.0,"consommable"));
        vendor1Inventory.put(2, new Item("épée d'acier",560.0,"arme"));
        vendor1Inventory.put(3, new Item("armure en fer",500.0,"armure"));

        player1.Describe();
        vendor1.Describe();



    }
}
