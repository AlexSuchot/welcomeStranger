import java.util.List;
import java.util.Map;

public class Vendor extends Character {
    public Vendor(Map<Integer, Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    public void Describe(Character vendor) {
        System.out.println(this.getName() + " is a vendor with " + this.getMoney() + "$. His inventory contains " + vendor.getInventory().size() + " items : ");
        Integer itemCount = 1;
        for (Integer i = 0; i < vendor.getInventory().size(); i++) {

            System.out.println(itemCount + ". " + vendor.getInventory().get(i).getName() + ". Price : " + vendor.getInventory().get(i).getPrice() + "$. Category : " + vendor.getInventory().get(i).getType());
            itemCount++;
        }
    }
}
