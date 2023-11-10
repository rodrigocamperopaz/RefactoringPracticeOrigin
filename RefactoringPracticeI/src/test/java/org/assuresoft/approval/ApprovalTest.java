package org.assuresoft.approval;

import org.assuresoft.Program;
import org.assuresoft.utils.TestConstants;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApprovalTest {
  @Test
  public void thirtyDays() {
    ByteArrayOutputStream fakeOutput = new ByteArrayOutputStream();
    System.setOut(new PrintStream(fakeOutput));
    System.setIn(System.in);

    Program.main(new String[0]);

    String output = fakeOutput.toString();
    // Use to convert LF instead to CRLF
    output = output.replace("\r\n", "\n");

    assertEquals(TestConstants.EXPECTED_PROGRAM_OUTPUT, output);
  }
}
