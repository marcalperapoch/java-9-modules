package com.myapp.fromfile;

import com.myapp.service.provider.RepositoryProvider;
import com.myapp.service.Repository;

public class FromFileRepositoryProvider implements RepositoryProvider {

    @Override
    public Repository get() {
        return new FromFileRepository("data.properties");
    }
}