package approval;

import org.assuresoft.Program;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApprovalTest {
  @Test
  public void thirtyDays() {
    ByteArrayOutputStream fakeOutput = new ByteArrayOutputStream();
    System.setOut(new PrintStream(fakeOutput));
    System.setIn(System.in);

    Program.main(new String[0]);

    String output = fakeOutput.toString();

    assertNotNull(output);
  }
}
