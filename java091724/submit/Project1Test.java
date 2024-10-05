import org.junit.*;
import static org.junit.Assert.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.function.*;

public class Project1Test {

    private Project1<String> runner;

    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup() {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("BB");
        words.add("CCCC");
        words.add("ABCDE");
        runner = new Project1<String>(words);
    }

    /**
     * Test method for findSmallest.
     */
    @Test
    public void findSmallest() {
        assertEquals("A", runner.findSmallest());
    }

    /**
     * Test method for findSmallest.
     * Should return null
     */
    @Test
    public void findSmallestNull() {
        ArrayList<String> words = new ArrayList<>();
        runner = new Project1<String>(words);
        assertEquals(null, runner.findSmallest());
    }

    /**
     * Test method for findLargest.
     */
    @Test
    public void findLargest() {
        assertEquals("CCCC", runner.findLargest());
    }

    /**
     * Test method for findLargest.
     * Should return null
     */
    @Test
    public void findLargestNull() {
        ArrayList<String> words = new ArrayList<>();
        runner = new Project1<String>(words);
        assertEquals(null, runner.findLargest());
    }

    /**
     * Test method for hasDuplicates.
     * Should return false
     */
    @Test
    public void hasNoDuplicates() {
        assertEquals(false, runner.hasDuplicates());
    }

    /**
     * Test method for hasDuplicates.
     * Should return false
     */
    @Test
    public void hasDuplicates() {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("BB");
        words.add("A");
        runner = new Project1<String>(words);
        assertEquals(true, runner.hasDuplicates());
    }

    /**
     * Test method for hasDuplicates.
     * Should return false
     */
    @Test
    public void hasDuplicatesForEmptyCollection() {
        ArrayList<String> words = new ArrayList<>();
        runner = new Project1<String>(words);
        assertEquals(false, runner.hasDuplicates());
    }
}