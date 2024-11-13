

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int cacheSize;

    public LRUCache(int cacheSize) {
        super(cacheSize, 0.75f, true); // Access-order mode enabled
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize; // Remove eldest entry when size exceeds cacheSize
    }
}

public class LRUCacheExample {
    public static void main(String[] args) {
        // Create an LRU cache with a maximum size of 3
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        // 1. Adding entries to the cache
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println("Initial cache: " + cache);

        // 2. Accessing an entry to update its position in access-order
        cache.get(1);
        System.out.println("Cache after accessing key 1: " + cache);

        // 3. Adding a new entry, causing the least recently used entry to be removed
        cache.put(4, "Four");
        System.out.println("Cache after adding key 4 (exceeding max size): " + cache);

        // 4. Accessing another entry to update its position in access-order
        cache.get(2);
        System.out.println("Cache after accessing key 2: " + cache);

        // 5. Adding another entry to exceed the size, causing another removal
        cache.put(5, "Five");
        System.out.println("Cache after adding key 5: " + cache);
    }
}
