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
    items = new ArrayList<>();

    items.add(ItemBuilder.builder().name("+5 Dexterity Vest").sellIn(10).quality(20).build());
    items.add(ItemBuilder.builder().name(AGED_BRIE).sellIn(2).quality(0).build());
    items.add(ItemBuilder.builder().name("Elixir of the Mongoose").sellIn(5).quality(7).build());
    items.add(ItemBuilder.builder().name(SULFURAS).sellIn(0).quality(80).build());
    items.add(ItemBuilder.builder().name(SULFURAS).sellIn(-1).quality(80).build());
    items.add(ItemBuilder.builder().name(BACKSTAGE_PASSES).sellIn(15).quality(20).build());
    items.add(ItemBuilder.builder().name(BACKSTAGE_PASSES).sellIn(10).quality(49).build());
    items.add(ItemBuilder.builder().name(BACKSTAGE_PASSES).sellIn(5).quality(49).build());
    items.add(ItemBuilder.builder().name("Conjured Mana Cake").sellIn(3).quality(6).build());

    app = new GameInventory(items);
  }
}