package org.assuresoft.inventory;

import java.util.List;

public class GameInventory {
  private final List<Item> items;

  public GameInventory(List<Item> items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      if (!"Aged Brie".equals(item.getName()) &&
          !"Backstage passes to a Pokemon Gym concert".equals(item.getName())) {
        if (item.getQuality() > 0 && !"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
          item.setQuality(item.getQuality() - 1);
        }
      } else {
        if (item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);

          if ("Backstage passes to a Pokemon Gym concert".equals(item.getName())) {
            if (item.getSellIn() < 11 && item.getQuality() < 50) {
              item.setQuality(item.getQuality() + 1);
            }

            if (item.getSellIn() < 6 && item.getQuality() < 50) {
              item.setQuality(item.getQuality() + 1);
            }
          }
        }
      }

      if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
        item.setSellIn(item.getSellIn() - 1);
      }

      if (item.getSellIn() < 0) {
        if (!"Aged Brie".equals(item.getName())) {
          if (!"Backstage passes to a Pokemon Gym concert".equals(item.getName())) {
            if (item.getQuality() > 0 && !"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
              item.setQuality(item.getQuality() - 1);
            }
          } else {
            item.setQuality(0);
          }
        } else {
          if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
          }
        }
      }
    }
  }
}
