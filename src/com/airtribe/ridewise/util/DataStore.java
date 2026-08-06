package com.airtribe.ridewise.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore<T> {
    private Map<String, T> dataMap;
    private ArrayList<T> dataList;

    public DataStore() {
         this.dataMap = new HashMap<>();
         this.dataList = new ArrayList<>();
    }

    public void add(String id, T item) {
        dataMap.put(id, item);
        dataList.add(item);
    }

    public T findById(String id) {
        return dataMap.get(id);
    }

    public void update(String id, T item) {
        T existingItem = dataMap.put(id, item);
        if (existingItem == null) {
            dataList.add(item);
            return;
        }

        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) == existingItem) {
                dataList.set(i, item);
                return;
            }
        }
    }

    public void delete(String id) {
        T item = dataMap.remove(id);
        dataList.remove(item);
    }

    public List<T> getAll() {
        return new ArrayList<>(dataList);
    }

    public int size() {
        return dataList.size();
    }

    public boolean contains(String id) {
        return dataMap.containsKey(id);
    }
}
