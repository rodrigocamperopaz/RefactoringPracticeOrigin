package org.assuresoft.middlewares;

import org.assuresoft.inventory.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class UpdateRulesTest {
  @Test
  public void testLinkRules() {
    UpdateRules rule1 = Mockito.mock(UpdateRules.class);
    UpdateRules rule2 = Mockito.mock(UpdateRules.class);
    UpdateRules rule3 = Mockito.mock(UpdateRules.class);

    UpdateRules firstRule = UpdateRules.link(rule1, rule2, rule3);

    assertSame(rule1, firstRule);
    assertSame(rule2, rule1.next);
    assertSame(rule3, rule2.next);
    assertNull(rule3.next);
  }
}
