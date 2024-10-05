import java.util.ArrayList;

public class Project1<E extends Comparable<E>> implements CollectionUtilities<E> {
    private ArrayList<E> collection;

    public Project1(ArrayList<E> collection) {
        this.collection = collection;
    }

    public static void main(String[] args) {
        example1();
        example2();
    }

    /**
     * example 1 of how to use the Project1 with
     * strings.
     */
    public static void example1()
    {
        // Example 1 - Project1 with strings
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("BB");
        words.add("CCCC");
        words.add("ABCDE");
        for (String v : words) {
            System.out.println(v);
        }
        Project1<String> collection = new Project1<String>(words);
        System.out.println("Smallest = "+collection.findSmallest());
        System.out.println("Largest = "+collection.findLargest());
    }

    public static void example2()
    {
        // Example 2: Project1 with numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        for (Integer v : numbers) {
            System.out.println(v);
        }
        Project1<Integer> numCollection = new Project1<Integer>(numbers);
        System.out.println("Smallest = "+numCollection.findSmallest());
        System.out.println("Largest = "+numCollection.findLargest());

    }


    @Override
    public E findSmallest() {
        if (collection == null || collection.isEmpty()) {
            return null;
        }

        E smallest = collection.get(0);
        for (E element : collection) {
            if (element.compareTo(smallest) < 0) {
                smallest = element;
            }
        }
        return smallest;
    }

    @Override
    public E findLargest() {
        if (collection == null || collection.isEmpty()) {
            return null;
        }

        E largest = collection.get(0);
        for (E element : collection) {
            if (element.compareTo(largest) > 0) {
                largest = element;
            }
        }
        return largest;
    }

    @Override
    public boolean hasDuplicates() {
        if (collection == null || collection.isEmpty()) {
            return false;
        }

        for (int i = 0; i < collection.size(); i++) {
            for (int j = i + 1; j < collection.size(); j++) {
                if (collection.get(i).compareTo(collection.get(j)) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}