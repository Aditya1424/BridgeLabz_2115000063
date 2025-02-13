import java.util.*;
public class CustomHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Node<K, V>>[] buckets;
    
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }
    
    private int getBucketIndex(K key) {
        return key.hashCode() % buckets.length;
    }
    
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node<>(key, value));
    }
    
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Node<K, V> node : buckets[index]) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }
    
    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            Iterator<Node<K, V>> iterator = buckets[index].iterator();
            while (iterator.hasNext()) {
                if (iterator.next().key.equals(key)) {
                    iterator.remove();
                    return;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map= new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.println("Value for key 'two': " + map.get("two"));
        map.remove("two");
        System.out.println("Value for key 'two' after removal: " + map.get("two"));
    }
}
