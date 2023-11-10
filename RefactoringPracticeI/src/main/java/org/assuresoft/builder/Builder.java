package org.assuresoft.builder;

/**
 * Builder interface for constructing Item objects.
 *
 * @author Jose Lozada
 */
public interface Builder {
  /**
   * Sets the name of the item in the builder.
   *
   * @param name The name of the item.
   * @return The ItemBuilder for further construction.
   */
  ItemBuilder name(String name);
  /**
   * Sets the sell-in value of the item in the builder.
   *
   * @param sellIn The sell-in value of the item.
   * @return The ItemBuilder for further construction.
   */
  ItemBuilder sellIn(int sellIn);
  /**
   * Sets the quality of the item in the builder.
   *
   * @param quality The quality of the item.
   * @return The ItemBuilder for further construction.
   */
  ItemBuilder quality(int quality);
}
