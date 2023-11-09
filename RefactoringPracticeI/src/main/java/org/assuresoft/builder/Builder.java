package org.assuresoft.builder;

public interface Builder {
  ItemBuilder name(String name);

  ItemBuilder sellIn(int sellIn);
  ItemBuilder quality(int quality);
}
