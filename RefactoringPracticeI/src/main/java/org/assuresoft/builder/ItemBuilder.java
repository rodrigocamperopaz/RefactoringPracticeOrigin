package org.assuresoft.builder;

import org.assuresoft.inventory.Item;

public class ItemBuilder implements Builder {
  private static String name;
  private static int sellIn = 0;
  private static int quality = 0;

  public ItemBuilder() {
  }

  public static ItemBuilder name(String name) {
    ItemBuilder itemBuilder = new ItemBuilder();
    ItemBuilder.name = name;

    return itemBuilder;
  }

  @Override
  public ItemBuilder sellIn(int sellIn) {
    ItemBuilder.sellIn = sellIn;

    return this;
  }

  @Override
  public ItemBuilder quality(int quality) {
    ItemBuilder.quality = quality;

    return this;
  }

  public Item build() {
    return new Item(name, sellIn, quality);
  }
}
