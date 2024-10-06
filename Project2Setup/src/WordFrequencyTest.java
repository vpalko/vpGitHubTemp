import org.junit.*;
import static org.junit.Assert.*;

public class WordFrequencyTest {

  @Test
  public void testConstructorAndGetters() {
    WordFrequency wf = new WordFrequency("hello", 3);
    assertEquals("hello", wf.getWord());
    assertEquals(3, wf.getCount());
  }

  @Test
  public void testIncrement() {
    WordFrequency wf = new WordFrequency("hello", 3);
    wf.increment();
    assertEquals(4, wf.getCount());
  }

  @Test
  public void testMultipleIncrements() {
    WordFrequency wf = new WordFrequency("hello", 3);
    wf.increment();
    wf.increment();
    wf.increment();
    assertEquals(6, wf.getCount());
  }

  @Test
  public void testWordCaseSensitivity() {
    WordFrequency wf = new WordFrequency("Hello", 1);
    assertEquals("Hello", wf.getWord());
  }
}