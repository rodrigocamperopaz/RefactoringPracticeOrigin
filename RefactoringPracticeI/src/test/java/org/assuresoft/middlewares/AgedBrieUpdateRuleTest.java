package org.assuresoft.middlewares;

import org.assuresoft.builder.ItemBuilder;
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
    assertEquals(50, agedBrieUpdateRule.getDefaultLimitQuality());
  }

  @Test
  void testParametrizedConstructor() {
    int limitQuality = 40;
    AgedBrieUpdateRule customRule = new AgedBrieUpdateRule(limitQuality);

    assertEquals(limitQuality, customRule.getDefaultLimitQuality());
  }

  @Test
  void testGetLimitQuality() {
    int limitQuality = 45;
    agedBrieUpdateRule.setDefaultLimitQuality(limitQuality);

    assertEquals(limitQuality, agedBrieUpdateRule.getDefaultLimitQuality());
  }

  @Test
  void testSetLimitQuality() {
    int limitQuality = 30;
    agedBrieUpdateRule.setDefaultLimitQuality(limitQuality);

    assertEquals(limitQuality, agedBrieUpdateRule.getDefaultLimitQuality());
  }

  @Test
  void testUpdateQualityForAgedBrie() {
    Item item = ItemBuilder.builder()
        .name("Aged Brie")
        .sellIn(5)
        .quality(40)
        .build();
    agedBrieUpdateRule.updateItem(item);

    assertEquals(41, item.getQuality());
    assertEquals(4, item.getSellIn());
  }

  @Test
  void testUpdateQualityForExpiredAgedBrie() {
    Item item = ItemBuilder.builder()
        .name("Aged Brie")
        .sellIn(-1)
        .quality(40)
        .build();
    agedBrieUpdateRule.updateItem(item);

    assertEquals(42, item.getQuality());
    assertEquals(-2, item.getSellIn());
  }
}
