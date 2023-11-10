package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

import static org.assuresoft.utils.Constants.AGED_BRIE;

/**
 * Concrete class implementing update rules for Aged Brie item quality, extends from {@link UpdateRules}.
 *
 * @author Jose Lozada
 */
public class AgedBrieUpdateRule extends UpdateRules {
  private int limitQuality = 50;

  public AgedBrieUpdateRule() {
  }

  public AgedBrieUpdateRule(int limitQuality) {
    this.limitQuality = limitQuality;
  }

  public int getLimitQuality() {
    return limitQuality;
  }

  public void setLimitQuality(int limitQuality) {
    this.limitQuality = limitQuality;
  }

  @Override
  public void updateItem(Item item) {
    if (AGED_BRIE.equals(item.getName())) {
      if (item.getQuality() < limitQuality) {
        item.setQuality(item.getQuality() + 1);
      }

      item.setSellIn(item.getSellIn() - 1);

      if (item.getSellIn() < 0 && item.getQuality() < limitQuality) {
        item.setQuality(item.getQuality() + 1);
      }
    }

    checkNextMiddleware(item);
  }
}
