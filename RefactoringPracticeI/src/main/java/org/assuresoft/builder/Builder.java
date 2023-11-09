package org.assuresoft.builder;

public interface Builder {
  ItemBuilder setName(String name);
  ItemBuilder setSellIn(int sellIn);
  ItemBuilder setQuality(int quality);
}
