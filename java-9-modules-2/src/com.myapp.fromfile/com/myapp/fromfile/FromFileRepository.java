package com.myapp.fromfile;

import java.util.Map;
import java.util.HashMap;
import java.io.InputStream;
import java.io.FileInputStream;
import com.myapp.service.Repository;
import java.util.Properties;
import java.io.IOException;

public class FromFileRepository implements Repository {

    private final Map<String, String> data;

    public FromFileRepository(final String path) {
        data = new HashMap<>();
        try (InputStream in = new FileInputStream(path)) {
            final Properties prop = new Properties();
            prop.load(in);
            for (String property : prop.stringPropertyNames()) {
                final String value = prop.getProperty(property);
                data.put(property, value);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getValue(final String key) {
        return data.get(key);
    }
}