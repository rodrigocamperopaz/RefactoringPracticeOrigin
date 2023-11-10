package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

import static org.assuresoft.utils.Constants.AGED_BRIE;

/**
 * Concrete class implementing update rules for Aged Brie item quality, extends from {@link UpdateRules}.
 *
 * @author Jose Lozada
 */
public class AgedBrieUpdateRule extends UpdateRules {
  private int defaultLimitQuality = 50;

  public AgedBrieUpdateRule() {
  }

  public AgedBrieUpdateRule(int defaultLimitQuality) {
    this.defaultLimitQuality = defaultLimitQuality;
  }

  public int getDefaultLimitQuality() {
    return this.defaultLimitQuality;
  }

  public void setDefaultLimitQuality(int defaultLimitQuality) {
    this.defaultLimitQuality = defaultLimitQuality;
  }

  @Override
  public void updateItem(Item item) {
    if (AGED_BRIE.equals(item.getName())) {
      if (item.getQuality() < this.defaultLimitQuality) {
        item.setQuality(item.getQuality() + 1);
      }

      item.setSellIn(item.getSellIn() - 1);

      if (item.getSellIn() < 0 && item.getQuality() < this.defaultLimitQuality) {
        item.setQuality(item.getQuality() + 1);
      }
    }

    checkNextMiddleware(item);
  }
}
