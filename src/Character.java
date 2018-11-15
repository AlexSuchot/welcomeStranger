import java.util.List;
import java.util.Map;

public abstract class Character {
    private List<Item> inventory;
    private String name;
    private Double money;

    public Character(List<Item> inventory, String name, Double money) {
        this.inventory = inventory;
        this.name = name;
        this.money = money;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

}


