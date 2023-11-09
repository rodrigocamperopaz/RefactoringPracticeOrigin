package org.assuresoft.inventory;

import org.assuresoft.middlewares.*;

import java.util.List;

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

  public void updateQuality() {
    for (Item item : items) {
      this.updateRules.updateQuality(item);
    }
  }

  public void setUpdateRules(UpdateRules updateRules) {
    this.updateRules = updateRules;
  }
}
