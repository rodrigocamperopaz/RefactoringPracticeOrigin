package approval;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.assuresoft.Program;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApprovalTest {
  @Test
  public void thirtyDays() {
    ByteArrayOutputStream fakeOutput = new ByteArrayOutputStream();
    System.setOut(new PrintStream(fakeOutput));
    System.setIn(new ByteArrayInputStream("a\n".getBytes()));

    Program.main(new String[0]);

    String output = fakeOutput.toString();

    Approvals.verify(output, String.valueOf(new DiffReporter()));
  }
}
