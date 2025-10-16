import java.util.LinkedList;

public class HashTable<K, V> {

    private LinkedList<Entry<K,V>>[] table;
    private int size;
    private int capacity = DEFAULT_CAPACITY;
    private static final int DEFAULT_CAPACITY = 11;


    public HashTable() {
        table = new LinkedList[DEFAULT_CAPACITY];
        size = 0;
    }
    
    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        this.capacity = capacity;
        size = 0;
    }


    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null){
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V> (key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] == null){
            return null;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)){
                table[index].remove(entry);
            }
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private int hash(K key){
        return key.hashCode() / capacity;
    }

    static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }
    }
}
