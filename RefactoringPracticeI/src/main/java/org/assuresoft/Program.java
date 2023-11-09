package org.assuresoft;

import org.assuresoft.builder.ItemBuilder;
import org.assuresoft.inventory.GameInventory;
import org.assuresoft.inventory.Item;

import java.util.ArrayList;
import java.util.List;

import static org.assuresoft.utils.Constants.DAYS;
import static org.assuresoft.utils.Constants.AGED_BRIE;
import static org.assuresoft.utils.Constants.SULFURAS;
import static org.assuresoft.utils.Constants.BACKSTAGE_PASSES;

public class Program {
  private static List<Item> items;
  private static GameInventory app;

  public static void main(String[] args) {
    setup();

    System.out.println("Here we are!");

    for (int index = 0; index < DAYS; index += 1) {
      System.out.println("-------- day " + index + " --------");

      for (Item item : items) {
        System.out.println(item);
      }

      System.out.println();
      app.updateQuality();
    }
  }

  private static void setup() {
    final ItemBuilder itemBuilder = new ItemBuilder();

    items = new ArrayList<>();
    items.add(itemBuilder.setName("+5 Dexterity Vest").setSellIn(10).setQuality(20).build());
    items.add(itemBuilder.setName(AGED_BRIE).setSellIn(2).setQuality(0).build());
    items.add(itemBuilder.setName("Elixir of the Mongoose").setSellIn(5).setQuality(7).build());
    items.add(itemBuilder.setName(SULFURAS).setSellIn(0).setQuality(80).build());
    items.add(itemBuilder.setName(SULFURAS).setSellIn(-1).setQuality(80).build());
    items.add(itemBuilder.setName(BACKSTAGE_PASSES).setSellIn(15).setQuality(20).build());
    items.add(itemBuilder.setName(BACKSTAGE_PASSES).setSellIn(10).setQuality(49).build());
    items.add(itemBuilder.setName(BACKSTAGE_PASSES).setSellIn(5).setQuality(49).build());
    items.add(itemBuilder.setName("Conjured Mana Cake").setSellIn(3).setQuality(6).build());


    app = new GameInventory(items);
  }
}