package com.myapp.inmemory;

import com.myapp.service.provider.RepositoryProvider;
import com.myapp.service.Repository;

public class InMemoryRepositoryProvider implements RepositoryProvider {

    @Override
    public Repository get() {
        return new InMemoryRepository();
    }
}