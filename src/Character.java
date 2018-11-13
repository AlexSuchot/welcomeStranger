import java.util.Map;

public abstract class Character {
    private Map<Integer, Item> inventory;
    private String name;
    private Double money;

    public Character(Map<Integer, Item> inventory, String name, Double money) {
        this.inventory = inventory;
        this.name = name;
        this.money = money;
    }

    public Map<Integer, Item> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, Item> inventory) {
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

    public String ToString() {
        return getInventory() + "coucou";
    }

}


