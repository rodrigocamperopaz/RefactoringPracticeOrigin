package org.assuresoft.inventory;

import org.assuresoft.middlewares.AgedBrieUpdateRule;
import org.assuresoft.middlewares.UpdateRules;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameInventoryTest {
  private final String ITEM_NAME = "foo";
  private List<Item> items;
  private GameInventory app;

  @BeforeEach
  public void setup() {
    items = new ArrayList<>();
    items.add(new Item(ITEM_NAME, 0, 0));
  }

  @Test
  public void testUpdateQuality() {
    app = new GameInventory(items);
    app.updateQuality();

    assertEquals(ITEM_NAME, items.get(0).getName());
    assertEquals(0, items.get(0).getQuality());
    assertEquals(-1, items.get(0).getSellIn());
  }

  @Test
  public void testChangeUpdateRules() {
    app = new GameInventory(items);
    UpdateRules updateRules = UpdateRules.link(new AgedBrieUpdateRule());
    app.setUpdateRules(updateRules);
    app.updateQuality();

    assertEquals(ITEM_NAME, items.get(0).getName());
    assertEquals(0, items.get(0).getQuality());
    assertEquals(0, items.get(0).getSellIn());
  }
}
