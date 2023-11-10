package org.assuresoft.middlewares;

import org.assuresoft.builder.ItemBuilder;
import org.assuresoft.inventory.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultUpdateRuleTest {
  private DefaultUpdateRule updateRule;

  @BeforeEach
  void setUp() {
    updateRule = new DefaultUpdateRule();
  }

  @Test
  void testUpdateQualityForNormalItem() {
    Item item = ItemBuilder.builder()
        .name("Default item")
        .sellIn(5)
        .quality(10)
        .build();
    updateRule.updateQuality(item);

    assertEquals(9, item.getQuality());
    assertEquals(4, item.getSellIn());
  }

  @Test
  void testUpdateQualityForSulfuras() {
    Item item = ItemBuilder.builder()
        .name("Sulfuras, Hand of Ragnaros")
        .sellIn(5)
        .quality(10)
        .build();
    updateRule.updateQuality(item);

    assertEquals(10, item.getQuality());
    assertEquals(5, item.getSellIn());
  }

  @Test
  void testUpdateQualityForExpiredItem() {
    Item item = ItemBuilder.builder()
        .name("Expired Item")
        .sellIn(-1)
        .quality(10)
        .build();
    updateRule.updateQuality(item);

    assertEquals(8, item.getQuality());
    assertEquals(-2, item.getSellIn());
  }

}
