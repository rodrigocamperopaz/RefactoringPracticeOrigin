package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;
import static org.assuresoft.utils.Constants.AGED_BRIE;
import static org.assuresoft.utils.Constants.BACKSTAGE_PASSES;
import static org.assuresoft.utils.Constants.SULFURAS;

/**
 * Concrete class implementing default update rules for item quality, extends from {@link UpdateRules}.
 *
 * @author Jose Lozada
 */
public class DefaultUpdateRule extends UpdateRules {
  @Override
  public void updateItem(Item item) {
    if (!AGED_BRIE.equals(item.getName()) && !BACKSTAGE_PASSES.equals(item.getName())) {
      if (!SULFURAS.equals(item.getName())) {
        if (item.getQuality() > 0) {
          item.setQuality(item.getQuality() - 1);
        }

        item.setSellIn(item.getSellIn() - 1);
      }

      if (item.getSellIn() < 0 && !SULFURAS.equals(item.getName()) && item.getQuality() > 0) {
        item.setQuality(item.getQuality() - 1);
      }
    }

    checkNextMiddleware(item);
  }
}

