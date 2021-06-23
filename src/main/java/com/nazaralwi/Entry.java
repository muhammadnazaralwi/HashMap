package com.nazaralwi;

public class Entry<K, V> {
    K key;
    V val;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    public int hashCode() {
        int prime = 13;
        int mul = 11;
        if (key != null) {
            return prime * mul + key.hashCode();
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || !this.getClass().getName().equals(object.getClass().getName())) {
            return false;
        }

        Entry e = (Entry) object;

        return this.key == e.key;
    }
}
