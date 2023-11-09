package inventory;

import org.assuresoft.inventory.GameInventory;
import org.assuresoft.inventory.Item;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameInventoryTest {
  @Test
  public void backstagePasses() {
    // ToDo
  }

  @Test
  public void sulfuras() {
    // ToDo
  }

  @Test
  public void agedBrie() {
    // ToDo
  }

  @Test
  public void foo() {
    List<Item> items = new ArrayList<>();
    items.add(new Item("foo", 0, 0));
    GameInventory app = new GameInventory(items);
    app.updateQuality();

    assertEquals("foo", items.get(0).getName());
    assertEquals(0, items.get(0).getQuality());
    assertEquals(-1, items.get(0).getSellIn());
  }
}
