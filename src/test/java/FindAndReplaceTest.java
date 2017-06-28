import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FindAndReplaceTest {

    @Test
    public void runFindAndReplace_printPhrase_Hello() {
      FindAndReplace testPhrase = new FindAndReplace();
      String expectedOutput = "Hello";
      assertEquals(expectedOutput, testPhrase.runFindAndReplace("Hello"));
    }
}
