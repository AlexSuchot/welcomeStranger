import java.util.List;
import java.util.Map;

public class Vendor extends Character {
    public Vendor(Map<Integer, Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    public void Describe() {
        System.out.println(this.getName() + " is a vendor with " + this.getMoney() + "$. His inventory contains : " + this.getInventory());
    }
}
