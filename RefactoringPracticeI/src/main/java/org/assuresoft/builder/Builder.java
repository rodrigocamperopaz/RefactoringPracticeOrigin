package org.assuresoft.builder;

public interface Builder {
  static ItemBuilder name(String name) {
    return null;
  }

  ItemBuilder sellIn(int sellIn);
  ItemBuilder quality(int quality);
}
