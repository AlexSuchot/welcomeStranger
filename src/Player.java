import java.util.List;
import java.util.Map;

public class Player extends Character {
    public Player(Map<Integer, Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    public void Describe(Character player) {
        System.out.println(this.getName() + " is a player with " + this.getMoney() + "$. His inventory contains " + player.getInventory().size() + " items : ");
        Integer itemCount = 2;
        System.out.print(itemCount - 1 + ". " + player.getInventory().get(0).getName() + ". Price : " + player.getInventory().get(0).getPrice() + "$. Category : " + player.getInventory().get(0).getType() + " | ");
        for (int i = 1; i < player.getInventory().size(); i++) {

            if (i % 4 == 0) {
                System.out.println("");
            }

            System.out.print(itemCount + ". " + player.getInventory().get(i).getName() + ". Price : " + player.getInventory().get(i).getPrice() + "$. Category : " + player.getInventory().get(i).getType());
            System.out.print(" | ");
            itemCount++;
        }

        System.out.println("");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    }

    // On récupère l'inventaire du joueur et l'inventaire du vendeur dans un premier temps.
    public void buyItem(Player player, Vendor vendor, Item item, Integer selectItem) {
        boolean validate = false;
        Item getItem = vendor.getInventory().get(selectItem);
        if(player.getInventory().size() < 8 && player.getMoney() > getItem.getPrice()){
            System.out.println("Voulez vous vraiment acheter l'objet " + getItem.getName() + " qui coûte " + getItem.getPrice());
            

        }

        // Integer newKeyItem = player.getInventory().size() + 1;


    }

    public void sellItem() {

    }

}
