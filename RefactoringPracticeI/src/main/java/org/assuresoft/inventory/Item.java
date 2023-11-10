package org.assuresoft.inventory;

/**
 * Class representing an item with a name, sell-in value, and quality.
 */
public class Item {
  private String name;
  private int sellIn;
  private int quality;

  public Item() {
  }

  public Item(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public String getName() {
    return name;
  }

  public int getSellIn() {
    return sellIn;
  }

  public int getQuality() {
    return quality;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  @Override
  public String toString() {
    return "name= '" + name + '\'' +
        ", sellIn= " + sellIn +
        ", quality= " + quality;
  }
}
