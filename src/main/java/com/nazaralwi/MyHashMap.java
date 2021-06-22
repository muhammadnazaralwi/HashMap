package com.nazaralwi;

public class MyHashMap<K, V> {
    private final int CAPACITY = 100;
    private int size = 0;
    private final Entry<K, V>[] HASH_TABLE = new Entry[CAPACITY];

    private int hashing(int hashCode) {
        return hashCode % CAPACITY;
    }

    public int size() {
        return this.size;
    }

    public boolean containsKey(Object key) {
        if (key == null) {
            if (HASH_TABLE[0].getKey() == null) {
                return true;
            }
        }

        assert key != null;
        int location = hashing(key.hashCode());
        Entry e = null;
        try {
            e = HASH_TABLE[location];
        } catch (NullPointerException exception) {

        }

        if (e != null && e.getKey() == key) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object value) {
        for (Entry entry : HASH_TABLE) {
            if (entry != null && entry.getVal() == value) {
                return true;
            }
        }
        return false;
    }

    public V get(K key) {
        Entry<K, V> e = null;
        V ret = null;
        if (key == null) {
            try {
                e = HASH_TABLE[0];
            } catch (NullPointerException exception) { }

            if (e != null) {
                return (V) e.getVal();
            }
        } else {
            int location = hashing(key.hashCode());
            try {
                e = HASH_TABLE[location];
            } catch (NullPointerException exception) { }
            if (e != null && e.getKey() == key) {
                return (V) e.getVal();
            }
        }
        return ret;
    }

    public V put(K key, V val) {
        V ret = null;
        if (key == null) {
            ret = putForNullKey(val);
            return ret;
        } else {
            int location = hashing(key.hashCode());
            if (location >= CAPACITY) {
                System.out.println("Rehashing required");
                return null;
            }
            Entry<K, V> e = null;
            try {
                e = HASH_TABLE[location];
            } catch (NullPointerException exception) { }

            if (e != null && e.getKey() == key) {
                ret = (V) e.getVal();
            } else {
                Entry<K, V> entry = new Entry<K, V>();
                entry.setKey(key);
                entry.setVal(val);
                HASH_TABLE[location] = entry;
                size++;
            }
        }
        return ret;
    }

    private V putForNullKey(V val) {
        Entry<K, V> e = null;
        try {
            e = HASH_TABLE[0];
        } catch (NullPointerException exception) {
            System.out.println("");
        }
        V ret = null;
        if (e != null && e.getKey() == null) {
            ret = (V) e.getVal();
        } else {
            Entry<K, V> entry = new Entry<>();
            entry.setKey(null);
            entry.setVal(val);
            HASH_TABLE[0] = entry;
            size++;
        }
        return ret;
    }
}
