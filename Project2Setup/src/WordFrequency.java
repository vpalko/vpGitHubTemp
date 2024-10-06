public class WordFrequency {
    private String word;
    private int count;

    public WordFrequency(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        this.count++;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof String) {
            String w = (String) other;
            return getWord().equalsIgnoreCase(w);
        } else if (other instanceof WordFrequency) {
            WordFrequency wf = (WordFrequency) other;
            String w = wf.getWord();
            return getWord().equalsIgnoreCase(w);
        } else {
            return false;
        }
    }
}