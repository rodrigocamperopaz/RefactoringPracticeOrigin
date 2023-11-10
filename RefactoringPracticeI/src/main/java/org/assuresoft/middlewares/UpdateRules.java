package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

/**
 * Abstract class representing a chain of responsibility for updating item quality.
 *
 * @author Jose Lozada
 */
public abstract class UpdateRules {
  public UpdateRules next;

  /**
   * Links a chain of update rules.
   *
   * @param first The first update rule in the chain.
   * @param chain Additional update rules to be linked.
   * @return The first update rule in the linked chain.
   */
  public static UpdateRules link(UpdateRules first, UpdateRules... chain) {
    UpdateRules head = first;

    for (UpdateRules nextInChain: chain) {
      head.next = nextInChain;
      head = nextInChain;
    }

    return first;
  }

  /**
   * Updates the quality of the given item based on the specific rules.
   *
   * @param item The item to update.
   */
  public abstract void updateItem(Item item);

  /**
   * Checks and passes the item to the next middleware in the chain if it exists.
   *
   * @param item The item to be passed to the next middleware.
   */
  protected void checkNextMiddleware(Item item) {
    if (null == next) {
      return;
    }

    next.updateItem(item);
  }
}
