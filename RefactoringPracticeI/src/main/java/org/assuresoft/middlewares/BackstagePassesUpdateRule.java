package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

import static org.assuresoft.utils.Constants.BACKSTAGE_PASSES;

public class BackstagePassesUpdateRule extends UpdateRules {
  @Override
  public void updateQuality(Item item) {
    if (BACKSTAGE_PASSES.equals(item.getName())) {
      if (item.getQuality() < 50) {
        item.setQuality(item.getQuality() + 1);
        if (item.getSellIn() < 11 && item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);
        }
        if (item.getSellIn() < 6 && item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);
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
