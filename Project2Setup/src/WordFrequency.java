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
}