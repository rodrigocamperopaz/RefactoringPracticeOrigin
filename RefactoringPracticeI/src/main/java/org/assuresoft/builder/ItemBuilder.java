package org.assuresoft.builder;

import org.assuresoft.inventory.Item;

/**
 * Builder class for constructing Item objects using the Builder pattern,
 * implements the {@link Builder} interface.
 *
 * @author Jose Lozada
 */
public class ItemBuilder implements Builder {
  private static String name;
  private static int sellIn = 0;
  private static int quality = 0;

  public ItemBuilder() {
  }

  /**
   * Static method to create a new instance of ItemBuilder.
   *
   * @return A new instance of ItemBuilder.
   */
  public static ItemBuilder builder() {
    return new ItemBuilder();
  }

  @Override
  public ItemBuilder name(String name) {
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

  /**
   * Builds and returns the final Item object.
   *
   * @return The constructed Item object.
   */
  public Item build() {
    return new Item(name, sellIn, quality);
  }
}
