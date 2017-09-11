package com.myapp.service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class RepositoryService {

    public static Repository getRepository() {
        ServiceLoader<Repository> sl = ServiceLoader.load(Repository.class);
        Iterator<Repository> iter = sl.iterator();
        if (!iter.hasNext()) {
            throw new RuntimeException("No repository found!");
        }
        return iter.next();
    }

}