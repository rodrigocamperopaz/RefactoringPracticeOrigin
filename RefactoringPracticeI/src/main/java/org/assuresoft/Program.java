package org.assuresoft;

import org.assuresoft.inventory.GameInventory;
import org.assuresoft.inventory.Item;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    System.out.println("Here we are!");

    List<Item> items = new ArrayList<Item>();
    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Sulfuras, Hand of sRagnaros", -1, 80));
    items.add(new Item("Backstage passes to a Pokemon Gym concert", 15, 20));
    items.add(new Item("Backstage passes to a Pokemon Gym concert", 10, 49));
    items.add(new Item("Backstage passes to a Pokemon Gym concert", 5, 49));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    GameInventory app = new GameInventory(items);

    for (int index = 0; index < 31; index++) {
      System.out.println("-------- day " + index + " --------");
      for (Item item : items) {
        System.out.println(item);
      }
      System.out.println("");
      app.updateQuality();
    }
  }
}