import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Player extends Character {
    public Player(List<Item> inventory, String name, Double money) {
        super(inventory, name, money);
    }

    // On décrit le personnage :
    public void Describe(Character player) {
        System.out.println(this.getName() + " is a player with " + this.getMoney() + "$. His inventory contains " + player.getInventory().size() + " items : ");
        Integer itemCount = 2;
        System.out.print(itemCount - 1 + ". " + player.getInventory().get(0).getName() + ". Price : " + player.getInventory().get(0).getPrice() + "$. Category : " + player.getInventory().get(0).getType() + " | ");
        for (int i = 1; i < player.getInventory().size(); i++) {

            if (i % 2 == 0) {
                System.out.println("");
            }

            System.out.print(itemCount + ". " + player.getInventory().get(i).getName() + ". Price : " + player.getInventory().get(i).getPrice() + "$. Category : " + player.getInventory().get(i).getType());
            System.out.print(" | ");
            itemCount++;
        }

        System.out.println("");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    }

    // On récupère l'inventaire du joueur et l'inventaire du vendeur dans un premier temps :
    public void BuyItem(Player player, Vendor vendor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an item to buy :");

        Integer selectItem = 0;
        try {
            selectItem = sc.nextInt() - 1;
        } catch (Exception e) {
            System.out.println("error");
            BuyItem(player, vendor);
        }

        // On demande au joueur de choisir un objet dans l'inventaire d'un vendeur :

        // Gestion de l'erreur si on rentre une valeur qui n'est pas dans l'inventaire :

        Item getItem = vendor.getInventory().get(selectItem);

        if (player.getInventory().size() < 8 && player.getMoney() > getItem.getPrice()) {
            System.out.println("Are you sure to buy " + getItem.getName() + " who cost " + getItem.getPrice());
            System.out.println("1. Yes  |  2. No");
            Integer buyValidate = sc.nextInt();
            if (buyValidate == 1) {
                player.getInventory().add(getItem);
                vendor.getInventory().remove(getItem);
                player.setMoney(player.getMoney() - getItem.getPrice());
                vendor.setMoney(vendor.getMoney() + getItem.getPrice());

            } else if (buyValidate == 2) {
                System.out.println("Buy cancelled.");
            } else {
                System.out.println("Wrong entry, please type 1 or 2.");
            }

        } else if (player.getInventory().size() > 8) {
            System.out.println("Inventory full.");
        } else if (player.getMoney() < getItem.getPrice()) {
            System.out.println("You have not enough money.");
        }

    }

    public void Choice(Player player, Vendor vendor) {
        System.out.println("Welcome Stranger ! What do you need ?");
        System.out.println("Menu : ");
        System.out.println("1. Buy   2. Sell");
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        if (choice == 1) {
            BuyItem(player, vendor);
        } else if (choice == 2) {
            SellItem(player, vendor);
        } else {
            System.out.println("Wrong entry.");
        }
    }

    public void SellItem(Player player, Vendor vendor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an item to sell :");

        Integer selectItem = 0;
        try {
            selectItem = sc.nextInt() - 1;
        } catch (Exception e) {
            System.out.println("error");
            SellItem(player, vendor);
        }

        // On demande au joueur de choisir un objet dans l'inventaire d'un vendeur :

        // Gestion de l'erreur si on rentre une valeur qui n'est pas dans l'inventaire :

        Item getItem = player.getInventory().get(selectItem);

        if (player.getInventory().size() > 0 && vendor.getMoney() > getItem.getPrice()) {
            System.out.println("Are you sure to sell " + getItem.getName() + " for " + getItem.getPrice() / 2);
            System.out.println("1. Yes  |  2. No");
            Integer buyValidate = sc.nextInt();
            if (buyValidate == 1) {
                vendor.getInventory().add(getItem);
                player.getInventory().remove(getItem);
                vendor.setMoney(vendor.getMoney() - getItem.getPrice() / 2);
                player.setMoney(player.getMoney() + getItem.getPrice() / 2);

            } else if (buyValidate == 2) {
                System.out.println("Sell cancelled.");
            } else {
                System.out.println("Wrong entry, please type 1 or 2.");
            }

        } else if (vendor.getInventory().size() > 8) {
            System.out.println("Empty inventory.");
        } else if (vendor.getMoney() < getItem.getPrice()) {
            System.out.println("The vendor has not enough money.");
        }

    }

}

