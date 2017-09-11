package com.myapp.provider;

import java.util.Map;
import com.myapp.service.Repository;

public class InMemoryRepository implements Repository {

    private final Map<String, String> data = Map.of("key1", "java", "key2", "jigsaw and services");

    @Override
    public String getValue(final String key) {
        return data.get(key);
    }
}