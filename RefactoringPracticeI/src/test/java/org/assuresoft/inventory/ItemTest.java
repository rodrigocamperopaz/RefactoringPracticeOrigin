package org.assuresoft.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
  private final String ITEM_NAME = "item test";
  private final int SELL_IN = 10;
  private final int QUALITY = 30;
  private Item item;

  @BeforeEach
  public void setUp() {
    item = new Item(ITEM_NAME, SELL_IN, QUALITY);
  }

  @Test
  public void testEmptyConstructor() {
    Item emptyItem = new Item();

    assertNull(emptyItem.getName());
    assertEquals(emptyItem.getSellIn(), 0);
    assertEquals(emptyItem.getQuality(), 0);
  }

  @Test
  public void testGetName() {
    assertEquals(ITEM_NAME, item.getName());
  }

  @Test
  public void testGetSellIn() {
    assertEquals(SELL_IN, item.getSellIn());
  }

  @Test
  public void testGetQuality() {
    assertEquals(QUALITY, item.getQuality());
  }

  @Test
  public void testSetName() {
    String newName = "New name";
    item.setName(newName);

    assertEquals(newName, item.getName());
  }

  @Test
  public void testSetSellIn() {
    int newSellIn = 5;
    item.setSellIn(newSellIn);

    assertEquals(newSellIn, item.getSellIn());
  }

  @Test
  public void testSetQuality() {
    int newQuality = 40;
    item.setQuality(newQuality);

    assertEquals(newQuality, item.getQuality());
  }

  @Test
  public void testToString() {
    String expected = "name= '%s', sellIn= %d, quality= %d";

    assertEquals(String.format(expected, ITEM_NAME, SELL_IN, QUALITY), item.toString());
  }
}