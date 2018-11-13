import java.util.List;
import java.util.Map;

public class Player extends Character {
    public Player(Map<Integer, Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    public void Describe(Character player) {
        System.out.println(this.getName() + " is a player with " + this.getMoney() + "$. His inventory contains " + player.getInventory().size() + " items : ");
        Integer itemCount = 1;
        for (Integer i = 0; i < player.getInventory().size(); i++) {

            System.out.println(itemCount + ". " + player.getInventory().get(i).getName() + ". Price : " + player.getInventory().get(i).getPrice() + "$. Category : " + player.getInventory().get(i).getType());
            itemCount++;
        }
    }

    public void buyItem(Item item) {
        item.getName();

    }

    public void sellItem() {

    }

}
