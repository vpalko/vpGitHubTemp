import org.junit.*;
import static org.junit.Assert.*;

public class HashWordsTest {
    private HashWords hashWords;

    @Before
    public void setUp() {
        hashWords = new HashWords(10);
    }

    @Test
    public void testAddWordAndContains() {
        hashWords.addWord("hello");
        assertTrue(hashWords.contains("hello"));
        assertFalse(hashWords.contains("world"));
    }

    @Test
    public void testFrequency() {
        hashWords.addWord("hello");
        hashWords.addWord("hello");
        assertEquals(2, hashWords.frequency("hello"));
        assertEquals(0, hashWords.frequency("world"));
    }

    @Test
    public void testNumUniqueWordsInTable() {
        hashWords.addWord("hello");
        hashWords.addWord("world");
        hashWords.addWord("hello");
        assertEquals(2, hashWords.numUniqueWordsInTable());
    }

    @Test
    public void testTotalNumOfWords() {
        hashWords.addWord("hello");
        hashWords.addWord("world");
        hashWords.addWord("hello");
        assertEquals(3, hashWords.totalNumOfWords());
    }

    @Test
    public void testMostCommonWord() {
        hashWords.addWord("hello");
        hashWords.addWord("world");
        hashWords.addWord("hello");
        hashWords.addWord("world");
        hashWords.addWord("world");
        assertEquals("world", hashWords.mostCommonWord());
    }

    @Test
    public void testTermFrequency() {
        hashWords.addWord("hello");
        hashWords.addWord("world");
        hashWords.addWord("hello");
        assertEquals(2.0 / 3.0, hashWords.termFrequency("hello"), 0.0001);
        assertEquals(1.0 / 3.0, hashWords.termFrequency("world"), 0.0001);
        assertEquals(0.0, hashWords.termFrequency("test"), 0.0001);
    }

    @Test
    public void testResize() {
        for (int i = 0; i < 10; i++) {
            hashWords.addWord("word" + i);
        }
        assertEquals(30, hashWords.size());
    }
}