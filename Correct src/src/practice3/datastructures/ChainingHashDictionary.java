package practice3.datastructures;

import practice3.interfaces.ICollection;
import practice3.interfaces.IDictionary;

import java.util.Iterator;
import java.util.function.Supplier;

public class ChainingHashDictionary<K, V> implements IDictionary<K, V> {
    private Supplier<IDictionary<K, V>> chain;

    public ChainingHashDictionary(Supplier<IDictionary<K, V>> chain) {
        // student: TODO fill me in!
    }

    /**
     * @param key
     * @return value corresponding to key
     */
    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    /**
     * @param value
     * @return true if the HashDictionary contains a key-value pair with
     * this value, and false otherwise
     */
    @Override
    public boolean containsValue(V value) {
        return false;
    }

    /**
     * @return number of key-value pairs in the HashDictionary
     */
    @Override
    public int size() {
        return 0;
    }

    @Override
    public ICollection<K> keys() {
        return null;
    }

    @Override
    public ICollection<V> values() {
        return null;
    }

    /**
     * @return An iterator for all entries in the HashDictionary
     */
    @Override
    public Iterator<K> iterator() {
        return null;
    }
}
