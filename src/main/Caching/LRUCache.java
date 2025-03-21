package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	private int capacity;
	private Map<Integer,Integer> cache;
	
	public LRUCache(int capacity) {
		super();
		this.capacity = capacity;
		this.cache = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true);
	}
	
	public int get(int key) {
		return cache.getOrDefault(cache.get(key), -1);
	}
	
	public void put(int key,int value) {
		if (cache.size() >= capacity) {
            cache.remove(cache.entrySet().iterator().next().getKey());
        }
        cache.put(key, value);
	}
}
