package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

import static org.assuresoft.utils.Constants.AGED_BRIE;

public class AgedBrieUpdateRule extends UpdateRules {
  @Override
  public void updateQuality(Item item) {
    if (AGED_BRIE.equals(item.getName())) {
      if (item.getQuality() < 50) {
        item.setQuality(item.getQuality() + 1);
      }

      item.setSellIn(item.getSellIn() - 1);

      if (item.getSellIn() < 0 && item.getQuality() < 50) {
        item.setQuality(item.getQuality() + 1);
      }
    }

    checkNextMiddleware(item);
  }
}
