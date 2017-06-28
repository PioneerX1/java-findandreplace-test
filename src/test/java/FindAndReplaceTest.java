import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FindAndReplaceTest {

    @Test
    public void runFindAndReplace_printPhrase_Hello() {
      FindAndReplace testPhrase = new FindAndReplace();
      String expectedOutput = "Hello ";
      assertEquals(expectedOutput, testPhrase.runFindAndReplace("Hello", "", ""));
    }

    @Test
    public void runFindAndReplace_printPhrase_Hello_World_How_Are_You() {
      FindAndReplace testPhrase = new FindAndReplace();
      String expectedOutput = "Hello World How Are You? ";
      assertEquals(expectedOutput, testPhrase.runFindAndReplace("Hello World How Are You?", "", ""));
    }
    //
    // @Test
    // public void runFindAndReplace_FindWordInPhrase_World() {
    //   FindAndReplace testPhrase = new FindAndReplace();
    //   String expectedOutput = "World";
    //   assertEquals(expectedOutput, testPhrase.runFindAndReplace("Hello World How Are You?", "World", ""));
    // }

    @Test
    public void runFindAndReplace_ReplaceWordInPhrase_Universe() {
      FindAndReplace testPhrase = new FindAndReplace();
      String expectedOutput = "Hello Universe How Are You? ";
      assertEquals(expectedOutput, testPhrase.runFindAndReplace("Hello World How Are You? ", "World", "Universe"));
    }


}
