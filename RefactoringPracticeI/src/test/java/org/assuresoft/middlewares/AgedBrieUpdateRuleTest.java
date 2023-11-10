package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieUpdateRuleTest {

  private AgedBrieUpdateRule agedBrieUpdateRule;

  @BeforeEach
  void setUp() {
    agedBrieUpdateRule = new AgedBrieUpdateRule();
  }

  @Test
  void testDefaultConstructor() {
    assertEquals(50, agedBrieUpdateRule.getLimitQuality());
  }

  @Test
  void testParametrizedConstructor() {
    int limitQuality = 40;
    AgedBrieUpdateRule customRule = new AgedBrieUpdateRule(limitQuality);

    assertEquals(limitQuality, customRule.getLimitQuality());
  }

  @Test
  void testGetLimitQuality() {
    int limitQuality = 45;
    agedBrieUpdateRule.setLimitQuality(limitQuality);

    assertEquals(limitQuality, agedBrieUpdateRule.getLimitQuality());
  }

  @Test
  void testSetLimitQuality() {
    int limitQuality = 30;
    agedBrieUpdateRule.setLimitQuality(limitQuality);

    assertEquals(limitQuality, agedBrieUpdateRule.getLimitQuality());
  }

  @Test
  void testUpdateQualityForAgedBrie() {
    Item item = new Item("Aged Brie", 5, 40);
    agedBrieUpdateRule.updateQuality(item);

    assertEquals(41, item.getQuality());
    assertEquals(4, item.getSellIn());
  }

  @Test
  void testUpdateQualityForExpiredAgedBrie() {
    Item item = new Item("Aged Brie", -1, 40);
    agedBrieUpdateRule.updateQuality(item);

    assertEquals(42, item.getQuality());
    assertEquals(-2, item.getSellIn());
  }
}
