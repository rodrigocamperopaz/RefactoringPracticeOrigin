package org.assuresoft.middlewares;

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
    Item item = new Item("Default item", 5, 10);
    updateRule.updateQuality(item);

    assertEquals(9, item.getQuality());
    assertEquals(4, item.getSellIn());
  }

  @Test
  void testUpdateQualityForSulfuras() {
    Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 10);
    updateRule.updateQuality(item);

    assertEquals(10, item.getQuality());
    assertEquals(5, item.getSellIn());
  }

  @Test
  void testUpdateQualityForExpiredItem() {
    Item item = new Item("Expired Item", -1, 10);
    updateRule.updateQuality(item);

    assertEquals(8, item.getQuality());
    assertEquals(-2, item.getSellIn());
  }

}
