package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

import static org.assuresoft.utils.Constants.BACKSTAGE_PASSES;

/**
 * Concrete class implementing update rules for Backstage Passes item quality, extends from {@link UpdateRules}.
 *
 * @author Jose Lozada
 */
public class BackstagePassesUpdateRule extends UpdateRules {
  private int limitQuality = 50;

  public BackstagePassesUpdateRule() {
  }

  public BackstagePassesUpdateRule(int limitQuality) {
    this.limitQuality = limitQuality;
  }

  public int getLimitQuality() {
    return limitQuality;
  }

  public void setLimitQuality(int limitQuality) {
    this.limitQuality = limitQuality;
  }

  @Override
  public void updateQuality(Item item) {
    int firstLimitGetSellIn = 11;
    int secondLimitGetSellIn = 6;

    if (BACKSTAGE_PASSES.equals(item.getName())) {
      if (item.getQuality() < limitQuality) {
        item.setQuality(item.getQuality() + 1);

        if (item.getQuality() < limitQuality) {
          if ((item.getSellIn() < firstLimitGetSellIn)) {
            item.setQuality(item.getQuality() + 1);
          }

          if (item.getSellIn() < secondLimitGetSellIn) {
            item.setQuality(item.getQuality() + 1);
          }
        }
      }

      item.setSellIn(item.getSellIn() - 1);

      if (item.getSellIn() < 0) {
        item.setQuality(0);
      }
    }

    checkNextMiddleware(item);
  }
}
