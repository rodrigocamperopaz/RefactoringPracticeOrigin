package org.assuresoft.builder;

import org.assuresoft.inventory.Item;

public class ItemBuilder implements Builder {
  private String name;
  private int sellIn = 0;
  private int quality = 0;

  @Override
  public ItemBuilder setName(String name) {
    this.name = name;

    return this;
  }

  @Override
  public ItemBuilder setSellIn(int sellIn) {
    this.sellIn = sellIn;

    return this;
  }

  @Override
  public ItemBuilder setQuality(int quality) {
    this.quality = quality;

    return this;
  }

  public Item build() {
    return new Item(name, sellIn, quality);
  }
}
