import java.util.List;
import java.util.Map;

public class Player extends Character {
    public Player(Map<Integer, Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    public void Describe() {
        System.out.println(this.getName() + " is a player with " + this.getMoney() + "$. His inventory contains : " + this.getInventory());
    }

    public void buyItem() {



    }
    public void sellItem(){

    }

    }
