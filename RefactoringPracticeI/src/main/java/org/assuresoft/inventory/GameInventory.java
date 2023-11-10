package org.assuresoft.inventory;

import org.assuresoft.middlewares.*;

import java.util.List;

/**
 * Class representing the game inventory with a list of items and update rules.
 */
public class GameInventory {
  private final List<Item> items;
  private UpdateRules updateRules;

  public GameInventory(List<Item> items) {
    this.items = items;
    this.updateRules = UpdateRules.link(
        new AgedBrieUpdateRule(),
        new BackstagePassesUpdateRule(),
        new DefaultUpdateRule()
    );
  }

  /**
   * Updates the quality of all items in the game inventory based on the current update rules.
   */
  public void updateQuality() {
    for (Item item : items) {
      this.updateRules.updateItem(item);
    }
  }

  public void setUpdateRules(UpdateRules updateRules) {
    this.updateRules = updateRules;
  }
}
