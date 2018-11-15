import java.util.List;
import java.util.Map;

public class Vendor extends Character {
    public Vendor(List<Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    public void Describe(Character vendor) {
        System.out.println(this.getName() + " is a vendor with " + this.getMoney() + "$. His inventory contains " + vendor.getInventory().size() + " items : ");
        Integer itemCount = 2;
        System.out.print(itemCount - 1 + ". " + vendor.getInventory().get(0).getName() + ". Price : " + vendor.getInventory().get(0).getPrice() + "$. Category : " + vendor.getInventory().get(0).getType() + " | ");
        for (int i = 1; i < vendor.getInventory().size(); i++) {

            if (i % 3 == 0) {
                System.out.println("");
            }

            System.out.print(itemCount + ". " + vendor.getInventory().get(i).getName() + ". Price : " + vendor.getInventory().get(i).getPrice() + "$. Category : " + vendor.getInventory().get(i).getType());
            System.out.print(" | ");
            itemCount++;
        }

        System.out.println("");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    }
}
