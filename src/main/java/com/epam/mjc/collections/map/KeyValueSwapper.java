package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (var newValue: sourceMap.keySet()) {
            var newKey = sourceMap.get(newValue);
            map.put(newKey, newValue);
        }
        return map;
    }
}
