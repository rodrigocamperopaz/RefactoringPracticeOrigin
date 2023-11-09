package org.assuresoft.builder;

import org.assuresoft.inventory.Item;

public class ItemBuilder implements Builder {
  private String name;
  private int sellIn;
  private int quality;

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  @Override
  public void setQuality(int quality) {
    this.quality = quality;
  }

  public Item build() {
    return new Item(name, sellIn, quality);
  }
}
