package Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MultiMapValue<K, V> extends HashMap<K, ArrayList<V>> {
    public void add(K key, V value) {

        if (get(key) == null) {
            ArrayList<V> newList = new ArrayList<V>();
            newList.add(value);
            put(key, newList);
            return;
        }

        ArrayList<V> existingList = get(key);
        existingList.add(value);
    }

    public void addAll(K key, List<V> values) {
        for (V value : values) {
            add(key, value);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        for (Map.Entry<K, ArrayList<V>> entry : map.entrySet()) {
            this.addAll(entry.getKey(), entry.getValue());
        }
    }

    public V getFirst(K key) {
        return (get(key) == null) ? null : get(key).get(0);
    }

    public List<V> getValues(K key) {
        return get(key);
    }
}