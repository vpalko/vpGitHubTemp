// import javafx.beans.binding.When;

public class HashWords {
    private WordFrequency[] table;
    private int size;
    private int uniqueWordCount;
    private int totalWordCount;

    public HashWords(int initialSize) {
        table = new WordFrequency[initialSize];
        size = 0;
        uniqueWordCount = 0;
        totalWordCount = 0;
    }

    // DONE
    public int size() {
        return table.length;
    }

    // DONE
    public int hashKey(String w) {
        int hash = 0;
        for (char c : w.toLowerCase().toCharArray()) {
            hash += c;
        }
        return hash % table.length;
    }

    // DONE
    public void addWord(String w) {
        int index = hashKey(w);
        int originalIndex = index;
        int probeCount = 0;

        while (table[index] != null && !table[index].getWord().equals(w)) {
            index = (originalIndex + ++probeCount) % table.length;
        }

        if (table[index] == null) {
            table[index] = new WordFrequency(w, 1);
            size++;
            uniqueWordCount++;
        } else {
            table[index].increment();
        }

        totalWordCount++;

        // if (size >= table.length * 0.75) {
        if (size >= table.length) {
            WordFrequency[] oldTable = table;
            table = new WordFrequency[oldTable.length * 3];
            size = 0;
            uniqueWordCount = 0;
            totalWordCount = 0;

            for (WordFrequency entry : oldTable) {
                if (entry != null) {
                    for (int i = 0; i < entry.getCount(); i++) {
                        addWord(entry.getWord());
                    }
                }
            }
        }
    }

    // DONE
    public boolean contains(String w) {
        int index = hashKey(w);
        int originalIndex = index;
        int probeCount = 0;

        while (table[index] != null) {
            if (table[index].getWord().equals(w)) {
                return true;
            }
            index = (originalIndex + ++probeCount) % table.length;
        }

        return false;
    }

    // DONE
    public int frequency(String w) {
        int index = hashKey(w);
        int originalIndex = index;
        int probeCount = 0;

        while (table[index] != null) {
            if (table[index].getWord().equals(w)) {
                return table[index].getCount();
            }
            index = (originalIndex + ++probeCount) % table.length;
        }

        return 0;
    }

    // DONE
    public int numUniqueWordsInTable() {
        return uniqueWordCount;
    }

    // DONE
    public int totalNumOfWords() {
        return totalWordCount;
    }

    // DONE
    public String mostCommonWord() {
        String mostCommon = null;
        int highestCount = 0;

        for (WordFrequency entry : table) {
            if (entry != null && entry.getCount() > highestCount) {
                highestCount = entry.getCount();
                mostCommon = entry.getWord();
            }
        }

        return mostCommon;
    }

    // DONE
    public double termFrequency(String w) {
        int wordFrequency = frequency(w);
        int totalWords = totalNumOfWords();

        if (totalWords == 0) {
            return 0;
        }

        return (double) wordFrequency / totalWords;
    }
}