package com.myapp.service;

import java.util.Iterator;
import java.util.ServiceLoader;
import com.myapp.service.provider.RepositoryProvider;

public class RepositoryService {

    public static Repository getRepository() {
        final ServiceLoader<RepositoryProvider> sl = ServiceLoader.load(RepositoryProvider.class);
        final Iterator<RepositoryProvider> iter = sl.iterator();
        if (!iter.hasNext()) {
            throw new RuntimeException("No repository found!");
        }
        final RepositoryProvider provider = iter.next();
        return provider.get();
    }

}