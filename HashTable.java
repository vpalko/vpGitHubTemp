public class HashTable<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private Entry<K, V>[] table;

    public HashTable() {
        table = new Entry[INITIAL_CAPACITY];
    }

    private static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % table.length);
    }

    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newEntry;
            }
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("apple", 1);
        hashTable.put("banana", 2);
        hashTable.put("cherry", 3);

        System.out.println("Value for 'apple': " + hashTable.get("apple"));
        System.out.println("Value for 'banana': " + hashTable.get("banana"));
        System.out.println("Value for 'cherry': " + hashTable.get("cherry"));

        hashTable.remove("banana");
        System.out.println("Value for 'banana' after removal: " + hashTable.get("banana"));
    }
}