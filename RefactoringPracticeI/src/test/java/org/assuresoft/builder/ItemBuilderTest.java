package org.assuresoft.builder;

import org.assuresoft.inventory.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemBuilderTest {
  private final String ITEM_NAME = "item test";
  private final int SELL_IN = 10;
  private final int QUALITY = 30;

  @Test
  public void testBuild() {
    Item item = ItemBuilder.builder().name(ITEM_NAME).sellIn(SELL_IN).quality(QUALITY).build();

    assertEquals(ITEM_NAME, item.getName());
    assertEquals(SELL_IN, item.getSellIn());
    assertEquals(QUALITY, item.getQuality());
  }
}
