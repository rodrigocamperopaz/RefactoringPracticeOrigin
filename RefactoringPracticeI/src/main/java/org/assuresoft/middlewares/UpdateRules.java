package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;

public abstract class UpdateRules {
  public UpdateRules next;

  public static UpdateRules link(UpdateRules first, UpdateRules... chain) {
    UpdateRules head = first;

    for (UpdateRules nextInChain: chain) {
      head.next = nextInChain;
      head = nextInChain;
    }

    return first;
  }

  public abstract void updateQuality(Item item);

  protected void checkNextMiddleware(Item item) {
    if (null == next) {
      return;
    }

    next.updateQuality(item);
  }
}
