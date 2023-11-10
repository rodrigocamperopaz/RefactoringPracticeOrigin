package org.assuresoft.middlewares;

import org.assuresoft.builder.ItemBuilder;
import org.assuresoft.inventory.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesUpdateRuleTest {
  private final String NAME = "Backstage passes to a Pokemon Gym concert";
  private BackstagePassesUpdateRule backstagePassesUpdateRule;

  @BeforeEach
  void setUp() {
    backstagePassesUpdateRule = new BackstagePassesUpdateRule();
  }

  @Test
  void testDefaultConstructor() {
    assertEquals(50, backstagePassesUpdateRule.getLimitQuality());
  }

  @Test
  void testParametrizedConstructor() {
    int limitQuality = 40;
    BackstagePassesUpdateRule customRule = new BackstagePassesUpdateRule(limitQuality);

    assertEquals(limitQuality, customRule.getLimitQuality());
  }

  @Test
  void testGetLimitQuality() {
    int limitQuality = 45;
    backstagePassesUpdateRule.setLimitQuality(limitQuality);

    assertEquals(limitQuality, backstagePassesUpdateRule.getLimitQuality());
  }

  @Test
  void testSetLimitQuality() {
    int limitQuality = 30;
    backstagePassesUpdateRule.setLimitQuality(limitQuality);

    assertEquals(limitQuality, backstagePassesUpdateRule.getLimitQuality());
  }

  @Test
  void testUpdateQualityForBackstagePasses() {
    Item item = ItemBuilder.builder()
        .name(NAME)
        .sellIn(15)
        .quality(30)
        .build();
    backstagePassesUpdateRule.updateItem(item);

    assertEquals(31, item.getQuality());
    assertEquals(14, item.getSellIn());
  }

  @Test
  void testUpdateQualityForBackstagePassesCloseToFirstLimit() {
    Item item = ItemBuilder.builder()
        .name(NAME)
        .sellIn(10)
        .quality(30)
        .build();
    backstagePassesUpdateRule.updateItem(item);

    assertEquals(32, item.getQuality());
    assertEquals(9, item.getSellIn());
  }

  @Test
  void testUpdateQualityForBackstagePassesCloseToSecondLimit() {
    Item item = ItemBuilder.builder()
        .name(NAME)
        .sellIn(5)
        .quality(30)
        .build();
    backstagePassesUpdateRule.updateItem(item);

    assertEquals(33, item.getQuality());
    assertEquals(4, item.getSellIn());
  }

  @Test
  void testUpdateQualityForExpiredBackstagePasses() {
    Item item = ItemBuilder.builder()
        .name(NAME)
        .sellIn(-1)
        .quality(30)
        .build();
    backstagePassesUpdateRule.updateItem(item);

    assertEquals(0, item.getQuality());
    assertEquals(-2, item.getSellIn());
  }
}
